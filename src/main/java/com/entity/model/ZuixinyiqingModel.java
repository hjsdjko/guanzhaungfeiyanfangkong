package com.entity.model;

import com.entity.ZuixinyiqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 最新疫情信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZuixinyiqingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 地区
     */
    private String zuixinyiqingName;


    /**
     * 今日确诊人数
     */
    private Integer xinzengrenshu;


    /**
     * 总确诊人数
     */
    private Integer zongrenshu;


    /**
     * 今日治愈人数
     */
    private Integer zhiyurenshu;


    /**
     * 今日死亡人数
     */
    private Integer siwangrenshu;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：地区
	 */
    public String getZuixinyiqingName() {
        return zuixinyiqingName;
    }


    /**
	 * 设置：地区
	 */
    public void setZuixinyiqingName(String zuixinyiqingName) {
        this.zuixinyiqingName = zuixinyiqingName;
    }
    /**
	 * 获取：今日确诊人数
	 */
    public Integer getXinzengrenshu() {
        return xinzengrenshu;
    }


    /**
	 * 设置：今日确诊人数
	 */
    public void setXinzengrenshu(Integer xinzengrenshu) {
        this.xinzengrenshu = xinzengrenshu;
    }
    /**
	 * 获取：总确诊人数
	 */
    public Integer getZongrenshu() {
        return zongrenshu;
    }


    /**
	 * 设置：总确诊人数
	 */
    public void setZongrenshu(Integer zongrenshu) {
        this.zongrenshu = zongrenshu;
    }
    /**
	 * 获取：今日治愈人数
	 */
    public Integer getZhiyurenshu() {
        return zhiyurenshu;
    }


    /**
	 * 设置：今日治愈人数
	 */
    public void setZhiyurenshu(Integer zhiyurenshu) {
        this.zhiyurenshu = zhiyurenshu;
    }
    /**
	 * 获取：今日死亡人数
	 */
    public Integer getSiwangrenshu() {
        return siwangrenshu;
    }


    /**
	 * 设置：今日死亡人数
	 */
    public void setSiwangrenshu(Integer siwangrenshu) {
        this.siwangrenshu = siwangrenshu;
    }
    /**
	 * 获取：发布日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布日期
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
