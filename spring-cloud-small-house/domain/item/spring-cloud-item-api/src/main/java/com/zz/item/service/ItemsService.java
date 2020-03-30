package com.zz.item.service;

import com.zz.item.pojo.vo.ItemAll;
import com.zz.pojo.PagedGridResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Created by caochunpeng on 2020-02-21
 */
@FeignClient("ITEM-SERVICE")
@RequestMapping("item-api")
public interface ItemsService {

    /**
     * 根据商品房产ID查询详情
     * @param itemId
     * @return
     */
    @GetMapping("item")
    public ItemAll queryItemById(@RequestParam("itemId") Integer itemId, @RequestParam("openId")String openId,@RequestParam("String phone")String phone);

    @GetMapping("queryLike")
    PagedGridResult queryLike(@RequestParam("openId")String openId, @RequestParam("phone")String phone, @RequestParam("page")Integer page,
                              @RequestParam("pageSize")Integer pageSize);
    @GetMapping("queryCollect")
    PagedGridResult queryCollect(@RequestParam("openId")String openId, @RequestParam("phone")String phone, @RequestParam("page")Integer page,
                                 @RequestParam("pageSize")Integer pageSize);
    @GetMapping("queryItem")
    ItemAll queryItem(@RequestParam("itemId") Integer itemId, @RequestParam("openId")String openId,@RequestParam("String phone")String phone);
}
