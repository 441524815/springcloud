package com.zz.item.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "items_apt_img")
public class ItemsAptImg {
    @Id
    private Integer id;

    /**
     * 户型图地址
     */
    @Column(name = "img_url")
    private String imgUrl;

    /**
     * 房品Id
     */
    @Column(name = "item_id")
    private Integer itemId;

    /**
     * 创建时间
     */
    @Column(name = "createdTime")
    private Date createdtime;

    /**
     * 结束时间
     */
    @Column(name = "endTime")
    private Date endtime;

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
     * 获取户型图地址
     *
     * @return img_url - 户型图地址
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 设置户型图地址
     *
     * @param imgUrl 户型图地址
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 获取房品Id
     *
     * @return item_id - 房品Id
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 设置房品Id
     *
     * @param itemId 房品Id
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取创建时间
     *
     * @return createdTime - 创建时间
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * 设置创建时间
     *
     * @param createdtime 创建时间
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * 获取结束时间
     *
     * @return endTime - 结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置结束时间
     *
     * @param endtime 结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}