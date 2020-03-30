package com.zz.like.service.impl;

import com.zz.like.mapper.UsersCollectItemsMapper;
import com.zz.like.mapper.UsersLikeItemsMapper;
import com.zz.like.pojo.UsersCollectItems;
import com.zz.like.pojo.UsersLikeItems;
import com.zz.like.service.LikeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by caochunpeng on 2020-03-03
 */
@RestController
@Slf4j
public class LikeServiceImpl implements LikeService {

    @Autowired
    private UsersLikeItemsMapper usersLikeItemsMapper;
    @Autowired
    private UsersCollectItemsMapper usersCollectItemsMapper;


    @Override
    public int insertLike(Integer itemsId, String openId, String phone) {
        if(StringUtils.isBlank(itemsId+"")){
            return 0;
        }
        if (StringUtils.isBlank(openId)){
            return 0;
        }
        UsersLikeItems usersLikeItems = new UsersLikeItems();
        usersLikeItems.setItemsId(itemsId);
        usersLikeItems.setOpenId(openId);
        usersLikeItems.setPhone(phone);
        int result = usersLikeItemsMapper.insertSelective(usersLikeItems);
        return result;
    }

    @Override
    public boolean isLike(Integer itemsId, String openId, String phone) {
        Map<String,Object> map = new HashMap<>();
        map.put("itemsId",itemsId);
        //map.put("userName", userName);
        map.put("openId", openId);
        UsersLikeItems likeItem = usersLikeItemsMapper.queryUsersLikeItemsAll(map);
        if (likeItem!=null){
            return true;
        }
        return false;
    }

    @Override
    public int insertCollect(Integer itemsId, String openId, String phone) {
        if(StringUtils.isBlank(itemsId+"")){
            return 0;
        }
        if (StringUtils.isBlank(openId)){
            return 0;
        }
        UsersCollectItems usersCollectItems = new UsersCollectItems();
        usersCollectItems.setItemsId(itemsId);
        usersCollectItems.setOpenId(openId);
        usersCollectItems.setPhone(phone);
        int result = usersCollectItemsMapper.insertSelective(usersCollectItems);
        return result;
    }

    @Override
    public boolean isCollect(Integer itemsId, String openId, String phone) {
        Map<String,Object> map = new HashMap<>();
        map.put("itemsId",itemsId);
        //map.put("userName", userName);
        map.put("openId", openId);
        UsersCollectItems collectItemsList = usersCollectItemsMapper.queryUsersCollectItemsAll(map);
        if (collectItemsList!=null){
            return true;
        }
        return false;
    }

    @Override
    public int updateLike(Integer itemsId, String openId, String phone) {
        Example example = new Example(UsersLikeItems.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("itemsId",itemsId);
        criteria.andEqualTo("openId",openId);
        UsersLikeItems usersLikeItems = usersLikeItemsMapper.selectOneByExample(example);
        if (usersLikeItems == null){
            return 0;
        }
        UsersLikeItems likeItems = new UsersLikeItems();
        likeItems.setItemsId(usersLikeItems.getItemsId());
        likeItems.setOpenId(usersLikeItems.getOpenId());
        int result = usersLikeItemsMapper.updateLike(usersLikeItems);
        return result;
    }

    @Override
    public int updateCollect(Integer itemsId, String openId, String phone) {
        Example example = new Example(UsersCollectItems.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("itemsId",itemsId);
        criteria.andEqualTo("openId",openId);
        UsersCollectItems usersCollectItems = usersCollectItemsMapper.selectOneByExample(example);
        if (usersCollectItems == null){
            return 0;
        }
        UsersCollectItems collectItems = new UsersCollectItems();
        collectItems.setItemsId(usersCollectItems.getItemsId());
        collectItems.setOpenId(usersCollectItems.getOpenId());
        int result = usersCollectItemsMapper.updateCollect(collectItems);
        return result;
    }

    @Override
    @Transactional
    public UsersLikeItems queryUsersLikeItemsAll(Integer itemsId, String openId) {
        Map<String,Object> map = new HashMap<>();
        map.put("itemsId",itemsId);
        //map.put("userName", userName);
        map.put("openId", openId);
        UsersLikeItems likeItem  = usersLikeItemsMapper.queryUsersLikeItemsAll(map);
        return likeItem;
    }

    @Override
    public UsersCollectItems queryUsersCollectItemsAll(Integer itemsId, String openId) {
        Map<String,Object> map = new HashMap<>();
        map.put("itemsId",itemsId);
        //map.put("userName", userName);
        map.put("openId", openId);
        UsersCollectItems collectItemsList = usersCollectItemsMapper.queryUsersCollectItemsAll(map);
        return collectItemsList;
    }

    @Override
    public List<UsersLikeItems> usersLikeItemsAll(String openId) {
        UsersLikeItems usersLikeItems = new UsersLikeItems();
        usersLikeItems.setOpenId(openId);
        return usersLikeItemsMapper.select(usersLikeItems);
    }

    @Override
    public List<UsersCollectItems> usersCollectAll(UsersCollectItems usersCollectItems) {
        return usersCollectItemsMapper.select(usersCollectItems);
    }

}
