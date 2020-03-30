package com.zz.item.pojo.vo;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class ItemDe {
    /**
     * 房产主键id
     */
    @Id
    private Integer id;

    /**
     * 房产项目名称 房产名称
     */
    @Column(name = "item_name")
    private String itemName;

    /**
     * 分类外键id 分类id
     */
    @Column(name = "cat_id")
    private Integer catId;

    /**
     * 上下架状态 上下架状态,1:上架 2:下架
     */
    @Column(name = "on_off_status")
    private Integer onOffStatus;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 更新时间
     */
    @Column(name = "updated_time")
    private Date updatedTime;

    /**
     * 房产视频地址
     */
    @Column(name = "video_id")
    private String videoId;

    /**
     * 房产主图
     */
    @Column(name = "item_img")
    private String itemImg;

    /**
     * 房产主图
     */
    @Column(name = "vr_img")
    private String vrImg;
    /**
     * 商品内容 商品内容
     */
    private String content;

    //0为点赞   1为没有点赞
    private Integer isLike = 1;
    //0为以收藏  1为没有收藏
    private Integer isCollect = 1;

    private Integer itemType;
    private String kaipanshijian;
    private String jiaofangshijian;
    private String zhengtigaikuang;

    private Integer dianjicishu;
    @Column(name = "apt_img")
    private String aptImg;
    /**
     * 获取房产主键id
     *
     * @return id - 房产主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置房产主键id
     *
     * @param id 房产主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取房产项目名称 房产名称
     *
     * @return item_name - 房产项目名称 房产名称
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置房产项目名称 房产名称
     *
     * @param itemName 房产项目名称 房产名称
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 获取分类外键id 分类id
     *
     * @return cat_id - 分类外键id 分类id
     */
    public Integer getCatId() {
        return catId;
    }

    /**
     * 设置分类外键id 分类id
     *
     * @param catId 分类外键id 分类id
     */
    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    /**
     * 获取上下架状态 上下架状态,1:上架 2:下架
     *
     * @return on_off_status - 上下架状态 上下架状态,1:上架 2:下架
     */
    public Integer getOnOffStatus() {
        return onOffStatus;
    }

    /**
     * 设置上下架状态 上下架状态,1:上架 2:下架
     *
     * @param onOffStatus 上下架状态 上下架状态,1:上架 2:下架
     */
    public void setOnOffStatus(Integer onOffStatus) {
        this.onOffStatus = onOffStatus;
    }

    /**
     * 获取创建时间
     *
     * @return created_time - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新时间
     *
     * @return updated_time - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * 获取房产视频地址
     *
     * @return video_id - 房产视频地址
     */
    public String getVideoId() {
        return videoId;
    }

    /**
     * 设置房产视频地址
     *
     * @param videoId 房产视频地址
     */
    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    /**
     * 获取商品内容 商品内容
     *
     * @return content - 商品内容 商品内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置商品内容 商品内容
     *
     * @param content 商品内容 商品内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    public String getItemImg() {
        return itemImg;
    }

    public void setItemImg(String itemImg) {
        this.itemImg = itemImg;
    }

    public String getVrImg() {
        return vrImg;
    }

    public void setVrImg(String vrImg) {
        this.vrImg = vrImg;
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

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public String getKaipanshijian() {
        return kaipanshijian;
    }

    public void setKaipanshijian(String kaipanshijian) {
        this.kaipanshijian = kaipanshijian;
    }

    public String getJiaofangshijian() {
        return jiaofangshijian;
    }

    public void setJiaofangshijian(String jiaofangshijian) {
        this.jiaofangshijian = jiaofangshijian;
    }

    public String getZhengtigaikuang() {
        return zhengtigaikuang;
    }

    public void setZhengtigaikuang(String zhengtigaikuang) {
        this.zhengtigaikuang = zhengtigaikuang;
    }

    public String getAptImg() {
        return aptImg;
    }

    public void setAptImg(String aptImg) {
        this.aptImg = aptImg;
    }

    public Integer getDianjicishu() {
        return dianjicishu;
    }

    public void setDianjicishu(Integer dianjicishu) {
        this.dianjicishu = dianjicishu;
    }

    @Override
    public String toString() {
        return "ItemDe{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", catId=" + catId +
                ", onOffStatus=" + onOffStatus +
                ", createdTime=" + createdTime +
                ", updatedTime=" + updatedTime +
                ", videoId='" + videoId + '\'' +
                ", itemImg='" + itemImg + '\'' +
                ", vrImg='" + vrImg + '\'' +
                ", content='" + content + '\'' +
                ", isLike=" + isLike +
                ", isCollect=" + isCollect +
                ", itemType=" + itemType +
                ", kaipanshijian='" + kaipanshijian + '\'' +
                ", jiaofangshijian='" + jiaofangshijian + '\'' +
                ", zhengtigaikuang='" + zhengtigaikuang + '\'' +
                ", dianjicishu=" + dianjicishu +
                ", aptImg='" + aptImg + '\'' +
                '}';
    }
}