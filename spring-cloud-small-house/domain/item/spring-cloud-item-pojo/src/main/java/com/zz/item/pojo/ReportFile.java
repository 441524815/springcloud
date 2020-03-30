package com.zz.item.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "report_file")
public class ReportFile {
    @Id
    private Integer id;

    @Column(name = "report_id")
    private String reportId;

    @Column(name = "file_name")
    private String fileName;

    private String path;

    @Column(name = "userId")
    private String userid;

    private String year;

    @Column(name = "report_type")
    private String reportType;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 文件用途，act活动，items房产，information资讯，study学习
     */
    @Column(name = "be_used")
    private String beUsed;

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
     * @return report_id
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * @param reportId
     */
    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    /**
     * @return file_name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * @return userId
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return report_type
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * @param reportType
     */
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取文件用途，act活动，items房产，information资讯，study学习
     *
     * @return be_used - 文件用途，act活动，items房产，information资讯，study学习
     */
    public String getBeUsed() {
        return beUsed;
    }

    /**
     * 设置文件用途，act活动，items房产，information资讯，study学习
     *
     * @param beUsed 文件用途，act活动，items房产，information资讯，study学习
     */
    public void setBeUsed(String beUsed) {
        this.beUsed = beUsed;
    }
}