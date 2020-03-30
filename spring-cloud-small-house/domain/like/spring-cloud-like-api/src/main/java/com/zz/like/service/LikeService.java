package com.zz.like.service;

import com.zz.like.pojo.UsersCollectItems;
import com.zz.like.pojo.UsersLikeItems;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by caochunpeng on 2020-03-03
 */
@FeignClient("LIKE-SERVICE")//1.feign生产端 引入feign依赖，添加feignClient注解
@RequestMapping("like-api")
public interface LikeService {

    @RequestMapping(value = "like",method = RequestMethod.POST)
    int insertLike(@RequestParam(value ="itemsId" ,required = false) Integer itemsId, @RequestParam(value = "openId",required = false) String openId,@RequestParam(value = "phone",required = false) String phone);

    @RequestMapping(value = "islike",method = RequestMethod.GET)
    boolean isLike(@RequestParam("itemsId") Integer itemsId, @RequestParam("openId") String openId,@RequestParam("phone") String phone);
    @RequestMapping(value = "collect",method = RequestMethod.POST)
    int insertCollect(@RequestParam("itemsId") Integer itemsId, @RequestParam("openId") String openId,@RequestParam("phone") String phone);

    @RequestMapping(value = "iscollect",method = RequestMethod.GET)
    boolean isCollect(@RequestParam("itemsId") Integer itemsId, @RequestParam("openId") String openId,@RequestParam("phone") String phone);
    @RequestMapping(value = "updateLike",method = RequestMethod.GET)
    int updateLike(@RequestParam("itemsId") Integer itemsId, @RequestParam("openId") String openId,@RequestParam("phone") String phone);
    @RequestMapping(value = "updateCollect",method = RequestMethod.GET)
    int updateCollect(@RequestParam("itemsId") Integer itemsId, @RequestParam("openId") String openId,@RequestParam("phone") String phone);
    @RequestMapping(value = "likeAll",method = RequestMethod.GET)
    UsersLikeItems queryUsersLikeItemsAll(@RequestParam(value = "itemsId",required = false) Integer itemsId, @RequestParam(value = "openId",required = false) String openId);
    @RequestMapping(value = "colAll",method = RequestMethod.GET)
    UsersCollectItems queryUsersCollectItemsAll(@RequestParam("itemsId") Integer itemsId, @RequestParam("openId") String openId);
    @RequestMapping(value = "usersLikeItemsAll",method = RequestMethod.GET)
    List<UsersLikeItems> usersLikeItemsAll(@RequestParam(value = "openId") String openId);
    @RequestMapping(value = "usersCollectAll",method = RequestMethod.GET)
    List<UsersCollectItems> usersCollectAll(@RequestBody UsersCollectItems usersCollectItems);
}
