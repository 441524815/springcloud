package com.zz.item.controller;

import com.zz.controller.BaseController;
import com.zz.item.fallback.likeservice.LikeFeignClient;
import com.zz.item.pojo.vo.ItemAll;
import com.zz.item.service.ItemsService;
import com.zz.like.pojo.UsersLikeItems;
import com.zz.pojo.PagedGridResult;
import com.zz.pojo.ZZJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by caochunpeng on 2019-11-13
 */
@Api(value = "首页",tags = {"房产信息的所有接口"})
@RestController
@RequestMapping("api/item")
public class ItemController extends BaseController {

    @Autowired
    private ItemsService itemsService;
    @Autowired
    private LikeFeignClient likeService;

    @ApiOperation(value = "房产详情页",notes = "根据房产ID获取房产详情信息",httpMethod = "GET")
    @GetMapping("/detail")
    public ZZJSONResult detail(@ApiParam(name = "itemId", value = "房产id", required = false)
                               @RequestParam Integer itemId,
                               @ApiParam(name = "openId", value = "openId", required = false)
                               @RequestParam String openId,
                               @ApiParam(name = "phone", value = "用户手机号", required = false)
                               @RequestParam String phone){
        if (itemId==null){
            return ZZJSONResult.errorMsg("房产id不能为空");
        }
        ItemAll items = itemsService.queryItemById(itemId,openId,phone);

        return ZZJSONResult.ok(items);
    }

    @ApiOperation(value = "指定用户下的房产详情页",notes = "指定用户下的房产详情页",httpMethod = "GET")
    @GetMapping("/like")
    public ZZJSONResult queryLike(@ApiParam(name = "openId", value = "用户id", required = true)
                               @RequestParam String openId,
                               @ApiParam(name = "phone", value = "用户手机号码", required = false)
                               @RequestParam String phone,
                               @ApiParam(name = "page", value = "当前页码", required = false)
                               @RequestParam Integer page,
                                  @ApiParam(name = "pageSize", value = "每页的数据数量", required = false)
                                      @RequestParam Integer pageSize){
        if (openId==null){
            return ZZJSONResult.errorMsg("用户ID不能为空");
        }
        if (page==null){
            page=1;
        }
        if (pageSize==null){
            pageSize = PAGE_SIZE;
        }
        PagedGridResult pagedGridResult = itemsService.queryLike(openId,phone,page,pageSize);

        return ZZJSONResult.ok(pagedGridResult);
    }
    @ApiOperation(value = "查询我的喜爱房产", notes = "查询我的喜爱房产", httpMethod = "GET")
    @GetMapping("/query")
    public ZZJSONResult query(@ApiParam(name = "itemId", value = "房产id", required = true)
                                     @RequestParam String itemId,
                                 @ApiParam(name = "openId", value = "openId", required = true)
                                     @RequestParam String openId,
                                 @ApiParam(name = "phone", value = "用户手机号", required = false)
                                     @RequestParam String phone) {

        if (StringUtils.isBlank(itemId)) {
            return ZZJSONResult.errorMsg(null);
        }
        if (StringUtils.isBlank(openId)) {
            return ZZJSONResult.errorMsg(null);
        }

        UsersLikeItems usersLikeItems = likeService.queryUsersLikeItemsAll(Integer.valueOf(itemId),openId);


        return ZZJSONResult.ok(usersLikeItems);
    }

}
