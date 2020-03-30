package com.zz.like.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zz.controller.BaseController;
import com.zz.like.service.LikeService;
import com.zz.pojo.ZZJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by caochunpeng on 2019-11-13
 */
@Api(value = "首页",tags = {"房产信息的所有接口"})
@RestController
@RequestMapping("api/likes")
public class LikeController extends BaseController {

    @Autowired
    private LikeService likeService;


    @ApiOperation(value = "我的关注功能",notes = "根据房产ID，用户名称，手机号添加关注",httpMethod = "POST")
    @PostMapping("/like")
    @HystrixCommand(
            commandKey = "likeFail", // 全局唯一的标识服务，默认函数名称
            groupKey = "like", // 全局服务分组，用于组织仪表盘，统计信息。默认：类名
            fallbackMethod = "likeFail", //同一个类里，public private都可以
            // 在列表中的exception，不会触发降级
//            ignoreExceptions = {IllegalArgumentException.class}
            // 线程有关的属性
            // 线程组, 多个服务可以共用一个线程组
            threadPoolKey = "threadPoolA",
            threadPoolProperties = {
                    // 核心线程数
                    @HystrixProperty(name = "coreSize", value = "10"),
                    // size > 0, LinkedBlockingQueue -> 请求等待队列
                    // 默认-1 , SynchronousQueue -> 不存储元素的阻塞队列（建议读源码，学CAS应用）
                    @HystrixProperty(name = "maxQueueSize", value = "40"),
                    // 在maxQueueSize=-1的时候无效，队列没有达到maxQueueSize依然拒绝
                    @HystrixProperty(name = "queueSizeRejectionThreshold", value = "15"),
                    // （线程池）统计窗口持续时间
                    @HystrixProperty(name = "metrics.rollingStats.timeInMilliseconds", value = "2024"),
                    // （线程池）窗口内桶子的数量
                    @HystrixProperty(name = "metrics.rollingStats.numBuckets", value = "18"),
            }
    )
    public ZZJSONResult like(@ApiParam(name = "itemId", value = "房产id", required = false)
                             @RequestParam Integer itemId,
                             @ApiParam(name = "openId", value = "微信openID", required = false)
                             @RequestParam String openId,
                             @ApiParam(name = "phone", value = "用户手机号", required = false)
                             @RequestParam String phone){

        //我的关注的数据添加
        if (itemId==null){
            return ZZJSONResult.errorMsg("房产信息不能为空");
        }
        if (openId==null){
            return ZZJSONResult.errorMsg("用户openId不能为空");
        }
        boolean flag = likeService.isLike(itemId,openId,phone);
        System.out.println(10/0);
        if (flag){

            likeService.updateLike(itemId,openId,phone);
            return ZZJSONResult.ok("此用户已经关注成功");
        }
        int result  =likeService.insertLike(itemId,openId,phone);

        if (result>0){
            return ZZJSONResult.ok();
        }
        return ZZJSONResult.errorMsg("我的关注失败");
    }
    @ApiOperation(value = "用户分享功能",notes = "根据房产ID，用户名称，手机号添加分享",httpMethod = "POST")
    @PostMapping("/share")
    public ZZJSONResult collect(@ApiParam(name = "itemId", value = "房产id", required = false)
                                @RequestParam Integer itemId,
                                @ApiParam(name = "openId", value = "微信openId", required = false)
                                @RequestParam String openId,
                                @ApiParam(name = "phone", value = "用户手机号", required = false)
                                @RequestParam String phone){

        //分享数据添加
        if (itemId==null){
            return ZZJSONResult.errorMsg("房产ID不能为空");
        }
        if (openId==null){
            return ZZJSONResult.errorMsg("微信openId不能为空");
        }
        boolean flag = likeService.isCollect(itemId,openId,phone);
        if (flag){
            likeService.updateCollect(itemId,openId,phone);
            return ZZJSONResult.ok("用户分享成功");
        }
        int result  =likeService.insertCollect(itemId,openId,phone);

        if (result>0){
            return ZZJSONResult.ok();
        }
        return ZZJSONResult.errorMsg("用户分享失败");
    }
    public ZZJSONResult likeFail(@RequestParam Integer itemId,@RequestParam String openId,
                             @RequestParam String phone,Throwable throwable) throws Exception{
        return ZZJSONResult.errorMsg("验证码输错了（模仿12306）" + throwable.getLocalizedMessage());
    }

}
