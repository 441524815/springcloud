package com.zz.like.mapper;

import com.zz.like.pojo.UsersCollectItems;
import com.zz.my.mapper.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface UsersCollectItemsMapper extends MyMapper<UsersCollectItems> {

    UsersCollectItems queryUsersCollectItemsAll(@Param("paramsMap") Map<String, Object> map);

    int updateCollect(UsersCollectItems usersCollectItems);

}