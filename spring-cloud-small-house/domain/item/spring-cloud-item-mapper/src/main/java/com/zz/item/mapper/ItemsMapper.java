package com.zz.item.mapper;

import com.zz.my.mapper.MyMapper;
import com.zz.item.pojo.Items;

public interface ItemsMapper extends MyMapper<Items> {

    int updateItems(Items items);
}