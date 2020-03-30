package com.zz.item.pojo.vo;

/**
 * Created by caochunpeng on 2020-02-22
 */
public class ItemVO {

    private Integer itemId;
    private String itemName;
    private String videoId;
    private String createdTime;
    private Integer catId;
    private String imgUrl;
    private Integer itemsParamId;
    private String area;
    private String tedian;
    private Integer price;
    private String leixing;
    private String mianji;
    //0为点赞   1为没有点赞
    private Integer isLike = 1;
    //0为以收藏  1为没有收藏
    private Integer isCollect = 1;

    private String vrImg;

    private String address;

    private Integer itemType;

    private Integer dianjicishu;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTedian() {
        return tedian;
    }

    public void setTedian(String tedian) {
        this.tedian = tedian;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing;
    }

    public String getMianji() {
        return mianji;
    }

    public void setMianji(String mianji) {
        this.mianji = mianji;
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getItemsParamId() {
        return itemsParamId;
    }

    public void setItemsParamId(Integer itemsParamId) {
        this.itemsParamId = itemsParamId;
    }

    public Integer getIsLike() {
        return isLike;
    }

    public void setIsLike(Integer isLike) {
        this.isLike = isLike;
    }

    public Integer getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(Integer isCollect) {
        this.isCollect = isCollect;
    }

    public String getVrImg() {
        return vrImg;
    }

    public void setVrImg(String vrImg) {
        this.vrImg = vrImg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public Integer getDianjicishu() {
        return dianjicishu;
    }

    public void setDianjicishu(Integer dianjicishu) {
        this.dianjicishu = dianjicishu;
    }
}
