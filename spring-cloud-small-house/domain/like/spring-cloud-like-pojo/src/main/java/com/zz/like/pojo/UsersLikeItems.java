package com.zz.like.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users_like_items")
public class UsersLikeItems {
    @Id
    private Integer id;

    @Column(name = "items_id")
    private Integer itemsId;

    @Column(name = "open_id")
    private String openId;

    private String phone;

    private Integer cishu;

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
     * @return items_id
     */
    public Integer getItemsId() {
        return itemsId;
    }

    /**
     * @param itemsId
     */
    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getCishu() {
        return cishu;
    }

    public void setCishu(Integer cishu) {
        this.cishu = cishu;
    }
}