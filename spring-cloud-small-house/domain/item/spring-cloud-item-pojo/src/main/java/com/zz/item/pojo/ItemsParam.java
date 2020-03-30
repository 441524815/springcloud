package com.zz.item.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "items_param")
public class ItemsParam {
    /**
     * 商品房产参数id
     */
    @Id
    private String id;

    /**
     * 商品房产外键id
     */
    @Column(name = "item_id")
    private Integer itemId;

    /**
     * 特点，优势
     */
    private String tedian;

    /**
     * 位置，地点
     */
    private String address;

    /**
     * 价格
     */
    private String price;

    /**
     * 朝向
     */
    private String chaoxiang;

    /**
     * 楼层
     */
    private String louceng;

    /**
     * 是否有电梯：0，有；1，无
     */
    private Integer dianti;

    /**
     * 房屋年代
     */
    private String niandai;

    /**
     * 装修类型，精装修，一般装修等
     */
    private String zhuangxiu;

    /**
     * 所在区域
     */
    private String area;

    /**
     * 房产周边设施
     */
    private String sheshi;

    /**
     * 房产详情，核心卖点，户型价格，装修描述
     */
    private String detail;

    /**
     * 创建时间
     */
    @Column(name = "created_time")
    private Date createdTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    private String leixing;
    private String mianji;
    private String fangxing;
    private String qita;
    private String hexinmaidian;
    private String zhuangxiumiaoshu;
    private String tudijuxinxi;
    private String zuyuehetong;
    private String huxingjieshao;
    private String xiangmujieshao;
    private String jiaotong;
    private String jiaoyu;
    private String yiliao;
    private String shangye;
    private String dongtai;
    private String huxing1;
    private String huxing2;
    private String huxing3;
    private String huxing4;
    private String zuyue;

    /**
     * 获取商品房产参数id
     *
     * @return id - 商品房产参数id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置商品房产参数id
     *
     * @param id 商品房产参数id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取商品房产外键id
     *
     * @return item_id - 商品房产外键id
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 设置商品房产外键id
     *
     * @param itemId 商品房产外键id
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取特点，优势
     *
     * @return tedian - 特点，优势
     */
    public String getTedian() {
        return tedian;
    }

    /**
     * 设置特点，优势
     *
     * @param tedian 特点，优势
     */
    public void setTedian(String tedian) {
        this.tedian = tedian;
    }

    /**
     * 获取位置，地点
     *
     * @return address - 位置，地点
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置位置，地点
     *
     * @param address 位置，地点
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public String getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * 获取朝向
     *
     * @return chaoxiang - 朝向
     */
    public String getChaoxiang() {
        return chaoxiang;
    }

    /**
     * 设置朝向
     *
     * @param chaoxiang 朝向
     */
    public void setChaoxiang(String chaoxiang) {
        this.chaoxiang = chaoxiang;
    }

    /**
     * 获取楼层
     *
     * @return louceng - 楼层
     */
    public String getLouceng() {
        return louceng;
    }

    /**
     * 设置楼层
     *
     * @param louceng 楼层
     */
    public void setLouceng(String louceng) {
        this.louceng = louceng;
    }

    /**
     * 获取是否有电梯：0，有；1，无
     *
     * @return dianti - 是否有电梯：0，有；1，无
     */
    public Integer getDianti() {
        return dianti;
    }

    /**
     * 设置是否有电梯：0，有；1，无
     *
     * @param dianti 是否有电梯：0，有；1，无
     */
    public void setDianti(Integer dianti) {
        this.dianti = dianti;
    }

    /**
     * 获取房屋年代
     *
     * @return niandai - 房屋年代
     */
    public String getNiandai() {
        return niandai;
    }

    /**
     * 设置房屋年代
     *
     * @param niandai 房屋年代
     */
    public void setNiandai(String niandai) {
        this.niandai = niandai;
    }

    /**
     * 获取装修类型，精装修，一般装修等
     *
     * @return zhuangxiu - 装修类型，精装修，一般装修等
     */
    public String getZhuangxiu() {
        return zhuangxiu;
    }

    /**
     * 设置装修类型，精装修，一般装修等
     *
     * @param zhuangxiu 装修类型，精装修，一般装修等
     */
    public void setZhuangxiu(String zhuangxiu) {
        this.zhuangxiu = zhuangxiu;
    }

    /**
     * 获取所在区域
     *
     * @return area - 所在区域
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置所在区域
     *
     * @param area 所在区域
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取房产周边设施
     *
     * @return sheshi - 房产周边设施
     */
    public String getSheshi() {
        return sheshi;
    }

    /**
     * 设置房产周边设施
     *
     * @param sheshi 房产周边设施
     */
    public void setSheshi(String sheshi) {
        this.sheshi = sheshi;
    }

    /**
     * 获取房产详情，核心卖点，户型价格，装修描述
     *
     * @return detail - 房产详情，核心卖点，户型价格，装修描述
     */
    public String getDetail() {
        return detail;
    }

    /**
     * 设置房产详情，核心卖点，户型价格，装修描述
     *
     * @param detail 房产详情，核心卖点，户型价格，装修描述
     */
    public void setDetail(String detail) {
        this.detail = detail;
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
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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

    public String getFangxing() {
        return fangxing;
    }

    public void setFangxing(String fangxing) {
        this.fangxing = fangxing;
    }

    public String getQita() {
        return qita;
    }

    public void setQita(String qita) {
        this.qita = qita;
    }

    public String getHexinmaidian() {
        return hexinmaidian;
    }

    public void setHexinmaidian(String hexinmaidian) {
        this.hexinmaidian = hexinmaidian;
    }

    public String getZhuangxiumiaoshu() {
        return zhuangxiumiaoshu;
    }

    public void setZhuangxiumiaoshu(String zhuangxiumiaoshu) {
        this.zhuangxiumiaoshu = zhuangxiumiaoshu;
    }

    public String getTudijuxinxi() {
        return tudijuxinxi;
    }

    public void setTudijuxinxi(String tudijuxinxi) {
        this.tudijuxinxi = tudijuxinxi;
    }

    public String getZuyuehetong() {
        return zuyuehetong;
    }

    public void setZuyuehetong(String zuyuehetong) {
        this.zuyuehetong = zuyuehetong;
    }

    public String getHuxingjieshao() {
        return huxingjieshao;
    }

    public void setHuxingjieshao(String huxingjieshao) {
        this.huxingjieshao = huxingjieshao;
    }

    public String getXiangmujieshao() {
        return xiangmujieshao;
    }

    public void setXiangmujieshao(String xiangmujieshao) {
        this.xiangmujieshao = xiangmujieshao;
    }

    public String getJiaotong() {
        return jiaotong;
    }

    public void setJiaotong(String jiaotong) {
        this.jiaotong = jiaotong;
    }

    public String getJiaoyu() {
        return jiaoyu;
    }

    public void setJiaoyu(String jiaoyu) {
        this.jiaoyu = jiaoyu;
    }

    public String getYiliao() {
        return yiliao;
    }

    public void setYiliao(String yiliao) {
        this.yiliao = yiliao;
    }

    public String getShangye() {
        return shangye;
    }

    public void setShangye(String shangye) {
        this.shangye = shangye;
    }

    public String getDongtai() {
        return dongtai;
    }

    public void setDongtai(String dongtai) {
        this.dongtai = dongtai;
    }

    public String getHuxing1() {
        return huxing1;
    }

    public void setHuxing1(String huxing1) {
        this.huxing1 = huxing1;
    }

    public String getHuxing2() {
        return huxing2;
    }

    public void setHuxing2(String huxing2) {
        this.huxing2 = huxing2;
    }

    public String getHuxing3() {
        return huxing3;
    }

    public void setHuxing3(String huxing3) {
        this.huxing3 = huxing3;
    }

    public String getHuxing4() {
        return huxing4;
    }

    public void setHuxing4(String huxing4) {
        this.huxing4 = huxing4;
    }

    public String getZuyue() {
        return zuyue;
    }

    public void setZuyue(String zuyue) {
        this.zuyue = zuyue;
    }

    @Override
    public String toString() {
        return "ItemsParam{" +
                "id='" + id + '\'' +
                ", itemId=" + itemId +
                ", tedian='" + tedian + '\'' +
                ", address='" + address + '\'' +
                ", price='" + price + '\'' +
                ", chaoxiang='" + chaoxiang + '\'' +
                ", louceng='" + louceng + '\'' +
                ", dianti=" + dianti +
                ", niandai='" + niandai + '\'' +
                ", zhuangxiu='" + zhuangxiu + '\'' +
                ", area='" + area + '\'' +
                ", sheshi='" + sheshi + '\'' +
                ", detail='" + detail + '\'' +
                ", createdTime=" + createdTime +
                ", updateTime=" + updateTime +
                ", leixing='" + leixing + '\'' +
                ", mianji='" + mianji + '\'' +
                ", fangxing='" + fangxing + '\'' +
                ", qita='" + qita + '\'' +
                ", hexinmaidian='" + hexinmaidian + '\'' +
                ", zhuangxiumiaoshu='" + zhuangxiumiaoshu + '\'' +
                ", tudijuxinxi='" + tudijuxinxi + '\'' +
                ", zuyuehetong='" + zuyuehetong + '\'' +
                ", huxingjieshao='" + huxingjieshao + '\'' +
                ", xiangmujieshao='" + xiangmujieshao + '\'' +
                ", jiaotong='" + jiaotong + '\'' +
                ", jiaoyu='" + jiaoyu + '\'' +
                ", yiliao='" + yiliao + '\'' +
                ", shangye='" + shangye + '\'' +
                ", dongtai='" + dongtai + '\'' +
                ", huxing1='" + huxing1 + '\'' +
                ", huxing2='" + huxing2 + '\'' +
                ", huxing3='" + huxing3 + '\'' +
                ", huxing4='" + huxing4 + '\'' +
                ", zuyue='" + zuyue + '\'' +
                '}';
    }
}