package com.zz.item.pojo.vo;

import com.zz.item.pojo.ItemsAptImg;
import com.zz.item.pojo.ItemsImg;
import com.zz.item.pojo.ItemsVrImg;

import java.util.List;

/**
 * Created by caochunpeng on 2020-02-22
 */
public class ItemAll {

    private ItemDe items;

    private ItemsParamLeaseVO itemsParamLeaseVO;

    private List<ItemsImg> itemsImgList;

    private List<ItemsAptImg> itemsAptImgList;

    private List<ItemsVrImg> itemsVrImgList;

    public ItemDe getItems() {
        return items;
    }

    public void setItems(ItemDe items) {
        this.items = items;
    }

    public ItemsParamLeaseVO getItemsParamLeaseVO() {
        return itemsParamLeaseVO;
    }

    public void setItemsParamLeaseVO(ItemsParamLeaseVO itemsParamLeaseVO) {
        this.itemsParamLeaseVO = itemsParamLeaseVO;
    }

    public List<ItemsImg> getItemsImgList() {
        return itemsImgList;
    }

    public void setItemsImgList(List<ItemsImg> itemsImgList) {
        this.itemsImgList = itemsImgList;
    }

    public List<ItemsAptImg> getItemsAptImgList() {
        return itemsAptImgList;
    }

    public void setItemsAptImgList(List<ItemsAptImg> itemsAptImgList) {
        this.itemsAptImgList = itemsAptImgList;
    }

    public List<ItemsVrImg> getItemsVrImgList() {
        return itemsVrImgList;
    }

    public void setItemsVrImgList(List<ItemsVrImg> itemsVrImgList) {
        this.itemsVrImgList = itemsVrImgList;
    }

    @Override
    public String toString() {
        return "ItemAll{" +
                "items=" + items +
                ", itemsParamLeaseVO=" + itemsParamLeaseVO +
                ", itemsImgList=" + itemsImgList +
                ", itemsAptImgList=" + itemsAptImgList +
                ", itemsVrImgList=" + itemsVrImgList +
                '}';
    }
}
