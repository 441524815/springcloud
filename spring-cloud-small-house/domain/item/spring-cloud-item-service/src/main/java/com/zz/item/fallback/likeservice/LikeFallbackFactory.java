package com.zz.item.fallback.likeservice;

import com.zz.like.pojo.UsersCollectItems;
import com.zz.like.pojo.UsersLikeItems;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by caochunpeng on 2020-03-17
 */
@Component
public class LikeFallbackFactory implements FallbackFactory<LikeFeignClient> {
    @Override
    public LikeFeignClient create(Throwable throwable) {
        return new LikeFeignClient() {
            @Override
            public int insertLike(Integer itemsId, String openId, String phone) {
                System.out.println("like服务异常关闭"+throwable.getLocalizedMessage());
                return 0;
            }

            @Override
            public boolean isLike(Integer itemsId, String openId, String phone) {
                System.out.println("like服务异常关闭"+throwable.getLocalizedMessage());
                return false;
            }

            @Override
            public int insertCollect(Integer itemsId, String openId, String phone) {
                System.out.println("like服务异常关闭"+throwable.getLocalizedMessage());
                return 0;
            }

            @Override
            public boolean isCollect(Integer itemsId, String openId, String phone) {
                System.out.println("like服务异常关闭"+throwable.getLocalizedMessage());
                return false;
            }

            @Override
            public int updateLike(Integer itemsId, String openId, String phone) {
                System.out.println("like服务异常关闭"+throwable.getLocalizedMessage());
                return 0;
            }

            @Override
            public int updateCollect(Integer itemsId, String openId, String phone) {
                System.out.println("like服务异常关闭"+throwable.getLocalizedMessage());
                return 0;
            }

            @Override
            public UsersLikeItems queryUsersLikeItemsAll(Integer itemsId, String openId) {
                System.out.println("like服务异常关闭"+throwable.getLocalizedMessage());
                UsersLikeItems usersLikeItems = new UsersLikeItems();
                usersLikeItems.setPhone("加载中");
                return usersLikeItems;
            }

            @Override
            public UsersCollectItems queryUsersCollectItemsAll(Integer itemsId, String openId) {

                System.out.println("like服务异常关闭"+throwable.getLocalizedMessage());
                return null;
            }

            @Override
            public List<UsersLikeItems> usersLikeItemsAll(String openId) {
                System.out.println("like服务异常关闭"+throwable.getLocalizedMessage());
                return null;
            }

            @Override
            public List<UsersCollectItems> usersCollectAll(UsersCollectItems usersCollectItems) {
                System.out.println("like服务异常关闭"+throwable.getLocalizedMessage());
                return null;
            }
        };
    }
}
