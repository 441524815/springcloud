package com.zz.like.mapper;

import com.zz.like.pojo.UsersLikeItems;
import com.zz.my.mapper.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UsersLikeItemsMapper extends MyMapper<UsersLikeItems> {

    UsersLikeItems queryUsersLikeItemsAll(@Param("paramsMap") Map<String, Object> map);

    int updateLike(UsersLikeItems usersLikeItems);

}