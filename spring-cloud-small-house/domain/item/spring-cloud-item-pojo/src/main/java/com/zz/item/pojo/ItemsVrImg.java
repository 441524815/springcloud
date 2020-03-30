package com.zz.item.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "items_vr_img")
public class ItemsVrImg {
    @Id
    private Integer id;

    /**
     * VR图片地址
     */
    @Column(name = "item_vr_img")
    private String itemVrImg;

    /**
     * 房产ID
     */
    @Column(name = "item_id")
    private Integer itemId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取VR图片地址
     *
     * @return item_vr_img - VR图片地址
     */
    public String getItemVrImg() {
        return itemVrImg;
    }

    /**
     * 设置VR图片地址
     *
     * @param itemVrImg VR图片地址
     */
    public void setItemVrImg(String itemVrImg) {
        this.itemVrImg = itemVrImg;
    }

    /**
     * 获取房产ID
     *
     * @return item_id - 房产ID
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 设置房产ID
     *
     * @param itemId 房产ID
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
}