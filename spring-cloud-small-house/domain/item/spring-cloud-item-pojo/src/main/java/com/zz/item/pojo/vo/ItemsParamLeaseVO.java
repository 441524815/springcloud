package com.zz.item.pojo.vo;

import com.zz.item.pojo.ItemLeaseImg;

import java.util.Date;
import java.util.List;

/**
 * Created by caochunpeng on 2020-03-06
 */
public class ItemsParamLeaseVO {

    /**
     * 商品房产参数id
     */
    private String id;

    /**
     * 商品房产外键id
     */
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
    private Date createdTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    private String leixing;
    private String mianji;
    private String fangxing;
    private String qita;
    private String hexinmaidian;
    private String zhuangxiumiaoshu;
    private String tudijuxinxi;
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

    private List<ItemLeaseImg> leaseImgList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getTedian() {
        return tedian;
    }

    public void setTedian(String tedian) {
        this.tedian = tedian;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getChaoxiang() {
        return chaoxiang;
    }

    public void setChaoxiang(String chaoxiang) {
        this.chaoxiang = chaoxiang;
    }

    public String getLouceng() {
        return louceng;
    }

    public void setLouceng(String louceng) {
        this.louceng = louceng;
    }

    public Integer getDianti() {
        return dianti;
    }

    public void setDianti(Integer dianti) {
        this.dianti = dianti;
    }

    public String getNiandai() {
        return niandai;
    }

    public void setNiandai(String niandai) {
        this.niandai = niandai;
    }

    public String getZhuangxiu() {
        return zhuangxiu;
    }

    public void setZhuangxiu(String zhuangxiu) {
        this.zhuangxiu = zhuangxiu;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSheshi() {
        return sheshi;
    }

    public void setSheshi(String sheshi) {
        this.sheshi = sheshi;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

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

    public List<ItemLeaseImg> getLeaseImgList() {
        return leaseImgList;
    }

    public void setLeaseImgList(List<ItemLeaseImg> leaseImgList) {
        this.leaseImgList = leaseImgList;
    }

    @Override
    public String toString() {
        return "ItemsParamLeaseVO{" +
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
                ", leaseImgList=" + leaseImgList +
                '}';
    }
}
