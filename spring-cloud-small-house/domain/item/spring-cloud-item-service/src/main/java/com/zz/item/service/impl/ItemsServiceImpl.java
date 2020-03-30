package com.zz.item.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zz.item.fallback.likeservice.LikeFeignClient;
import com.zz.item.mapper.*;
import com.zz.item.pojo.*;
import com.zz.item.pojo.vo.ItemAll;
import com.zz.item.pojo.vo.ItemDe;
import com.zz.item.pojo.vo.ItemsParamLeaseVO;
import com.zz.item.service.ItemsService;
import com.zz.like.pojo.UsersCollectItems;
import com.zz.like.pojo.UsersLikeItems;
import com.zz.like.service.LikeService;
import com.zz.pojo.PagedGridResult;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by caochunpeng on 2020-02-21
 */
@RestController
@Slf4j
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;
    @Autowired
    private ItemsParamMapper itemsParamMapper;
    @Autowired
    private ItemsImgMapper itemsImgMapper;
    @Autowired
    private LikeFeignClient likeService;
//    @Autowired
//    private LikeService likeService;
    @Autowired
    private ItemsAptImgMapper itemsAptImgMapper;
    @Autowired
    private ItemsVrImgMapper itemsVrImgMapper;
    @Autowired
    private ItemLeaseImgMapper itemLeaseImgMapper;
    @Autowired
    private ReportFileMapper reportFileMapper;

    @Override
    @GlobalTransactional(name = "item-service1",rollbackFor = Exception.class)
    public ItemAll queryItemById(Integer itemId, String openId, String phone) {
        Items mideng = new Items();
        Items item = itemsMapper.selectByPrimaryKey(itemId);
        if (item!=null){
            mideng.setDianjicishu(item.getDianjicishu());
            mideng.setId(item.getId());
            itemsMapper.updateItems(mideng);
        }

        ItemsParam itemsParam = new ItemsParam();
        List<ItemsImg> list = new ArrayList<>();
        List<ItemsAptImg> itemsAptImgList = new ArrayList<>();
        List<ItemsVrImg> itemsVrImgList = new ArrayList<>();
        List<ItemLeaseImg> itemLeaseImgList = new ArrayList<>();
        ItemsParamLeaseVO itemsParamLeaseVO = new ItemsParamLeaseVO();
        ItemDe itemDe = new ItemDe();

        //新添加insert操作  用于测试分布式事务
        //likeService.insertLike(itemId,openId,phone);
        if (item!=null){
            BeanUtils.copyProperties(item,itemDe);
            UsersLikeItems likeItem  = likeService.queryUsersLikeItemsAll(itemDe.getId(),openId);
            if (likeItem!=null){
                itemDe.setIsLike(0);
            }
            UsersCollectItems collectItemsList = likeService.queryUsersCollectItemsAll(itemDe.getId(),openId);
            if (collectItemsList!=null){
                itemDe.setIsCollect(0);
            }

            ReportFile reportFile = reportFileMapper.selectByPrimaryKey(item.getVideoId());
            itemDe.setVideoId(reportFile.getYear());
            //房产参数
            ItemsParam itemsParams = new ItemsParam();
            itemsParams.setItemId(itemDe.getId());
            itemsParam = itemsParamMapper.selectOne(itemsParams);

            //租约合同
            BeanUtils.copyProperties(itemsParam,itemsParamLeaseVO);
            Example example3 = new Example(ItemLeaseImg.class);
            Example.Criteria criteria3 = example3.createCriteria();
            criteria3.andEqualTo("itemId",itemDe.getId());
            itemLeaseImgList = itemLeaseImgMapper.selectByExample(example3);
            itemsParamLeaseVO.setLeaseImgList(itemLeaseImgList);
            //房产子图片
            Example example = new Example(ItemsImg.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("itemId",itemDe.getId());
            list = itemsImgMapper.selectByExample(example);

            //房产户型图子图
            Example example1 = new Example(ItemsAptImg.class);
            Example.Criteria criteria1 = example1.createCriteria();
            criteria1.andEqualTo("itemId",itemDe.getId());
            itemsAptImgList = itemsAptImgMapper.selectByExample(example1);

            //房产VR图子图
            Example example2 = new Example(ItemsVrImg.class);
            Example.Criteria criteria2 = example2.createCriteria();
            criteria2.andEqualTo("itemId",itemDe.getId());
            itemsVrImgList = itemsVrImgMapper.selectByExample(example2);


        }
        ItemAll itemAll = new ItemAll();
        itemAll.setItems(itemDe);
        itemAll.setItemsParamLeaseVO(itemsParamLeaseVO);
        itemAll.setItemsImgList(list);
        itemAll.setItemsAptImgList(itemsAptImgList);
        itemAll.setItemsVrImgList(itemsVrImgList);
        return itemAll;
    }

    @Override
    @GlobalTransactional(name = "item-service2",rollbackFor = Exception.class)
    public PagedGridResult queryLike(String openId, String phone, Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        List<UsersLikeItems> likeList = likeService.usersLikeItemsAll(openId);
        List<ItemAll> itemAllList = new ArrayList<>();
        for (UsersLikeItems like:likeList){
            Integer itemId = like.getItemsId();
            ItemAll itemAll = this.queryItem(itemId,openId,phone);
            itemAllList.add(itemAll);
        }
        return setterPagedGrid(itemAllList, page);
    }

    @Override
    @GlobalTransactional(name = "item-service3",rollbackFor = Exception.class)
    public PagedGridResult queryCollect(String openId, String phone, Integer page, Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        UsersCollectItems usersCollectItems = new UsersCollectItems();
        //usersCollectItems.setUserName(userName);
        usersCollectItems.setOpenId(openId);
        List<UsersCollectItems> collectList = likeService.usersCollectAll(usersCollectItems);
        List<ItemAll> itemAllList = new ArrayList<>();
        for (UsersCollectItems collectItems:collectList){
            Integer itemId = collectItems.getItemsId();
            ItemAll itemAll = this.queryItem(itemId,openId,phone);
            itemAllList.add(itemAll);
        }
        return setterPagedGrid(itemAllList, page);
    }

    @Override
    @GlobalTransactional(name = "item-service4",rollbackFor = Exception.class)
    public ItemAll queryItem(Integer itemId, String openId, String phone) {
        Items item = itemsMapper.selectByPrimaryKey(itemId);
        ItemsParam itemsParam = new ItemsParam();
        List<ItemsImg> list = new ArrayList<>();
        List<ItemsAptImg> itemsAptImgList = new ArrayList<>();
        List<ItemsVrImg> itemsVrImgList = new ArrayList<>();
        List<ItemLeaseImg> itemLeaseImgList = new ArrayList<>();
        ItemsParamLeaseVO itemsParamLeaseVO = new ItemsParamLeaseVO();
        ItemDe itemDe = new ItemDe();
        if (item!=null){
            BeanUtils.copyProperties(item,itemDe);
            Map<String,Object> map = new HashMap<>();
            map.put("itemsId",itemDe.getId());
            //map.put("userName", userName);
            map.put("openId", openId);
            UsersLikeItems likeItem  = likeService.queryUsersLikeItemsAll(itemDe.getId(),openId);
            if (likeItem!=null){
                itemDe.setIsLike(0);
            }
            UsersCollectItems collectItemsList = likeService.queryUsersCollectItemsAll(itemDe.getId(),openId);
            if (collectItemsList!=null){
                itemDe.setIsCollect(0);
            }

            ReportFile reportFile = reportFileMapper.selectByPrimaryKey(item.getVideoId());
            itemDe.setVideoId(reportFile.getYear());
            //房产参数
            ItemsParam itemsParams = new ItemsParam();
            itemsParams.setItemId(itemDe.getId());
            itemsParam = itemsParamMapper.selectOne(itemsParams);

            //租约合同
            BeanUtils.copyProperties(itemsParam,itemsParamLeaseVO);
            Example example3 = new Example(ItemLeaseImg.class);
            Example.Criteria criteria3 = example3.createCriteria();
            criteria3.andEqualTo("itemId",itemDe.getId());
            itemLeaseImgList = itemLeaseImgMapper.selectByExample(example3);
            itemsParamLeaseVO.setLeaseImgList(itemLeaseImgList);
            //房产子图片
            Example example = new Example(ItemsImg.class);
            Example.Criteria criteria = example.createCriteria();
            criteria.andEqualTo("itemId",itemDe.getId());
            list = itemsImgMapper.selectByExample(example);

            //房产户型图子图
            Example example1 = new Example(ItemsAptImg.class);
            Example.Criteria criteria1 = example1.createCriteria();
            criteria1.andEqualTo("itemId",itemDe.getId());
            itemsAptImgList = itemsAptImgMapper.selectByExample(example1);

            //房产VR图子图
            Example example2 = new Example(ItemsVrImg.class);
            Example.Criteria criteria2 = example2.createCriteria();
            criteria2.andEqualTo("itemId",itemDe.getId());
            itemsVrImgList = itemsVrImgMapper.selectByExample(example2);


        }
        ItemAll itemAll = new ItemAll();
        itemAll.setItems(itemDe);
        itemAll.setItemsParamLeaseVO(itemsParamLeaseVO);
        itemAll.setItemsImgList(list);
        itemAll.setItemsAptImgList(itemsAptImgList);
        itemAll.setItemsVrImgList(itemsVrImgList);
        return itemAll;
    }
    private PagedGridResult setterPagedGrid(List<?> list, Integer page) {
        PageInfo<?> pageList = new PageInfo<>(list);
        PagedGridResult grid = new PagedGridResult();
        grid.setPage(page);
        grid.setRows(list);
        grid.setTotal(pageList.getPages());
        grid.setRecords(pageList.getTotal());
        return grid;
    }
}
