package com.zz.item.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "item_lease_img")
public class ItemLeaseImg {
    @Id
    private Integer id;

    /**
     * 租约合同图片地址
     */
    @Column(name = "lease_img")
    private String leaseImg;

    /**
     * 房产项目ID
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
     * 获取租约合同图片地址
     *
     * @return lease_img - 租约合同图片地址
     */
    public String getLeaseImg() {
        return leaseImg;
    }

    /**
     * 设置租约合同图片地址
     *
     * @param leaseImg 租约合同图片地址
     */
    public void setLeaseImg(String leaseImg) {
        this.leaseImg = leaseImg;
    }

    /**
     * 获取房产项目ID
     *
     * @return item_id - 房产项目ID
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 设置房产项目ID
     *
     * @param itemId 房产项目ID
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }
}