package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 最新疫情信息
 *
 * @author 
 * @email
 */
@TableName("zuixinyiqing")
public class ZuixinyiqingEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZuixinyiqingEntity() {

	}

	public ZuixinyiqingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 地区
     */
    @TableField(value = "zuixinyiqing_name")

    private String zuixinyiqingName;


    /**
     * 今日确诊人数
     */
    @TableField(value = "xinzengrenshu")

    private Integer xinzengrenshu;


    /**
     * 总确诊人数
     */
    @TableField(value = "zongrenshu")

    private Integer zongrenshu;


    /**
     * 今日治愈人数
     */
    @TableField(value = "zhiyurenshu")

    private Integer zhiyurenshu;


    /**
     * 今日死亡人数
     */
    @TableField(value = "siwangrenshu")

    private Integer siwangrenshu;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：地区
	 */
    public String getZuixinyiqingName() {
        return zuixinyiqingName;
    }
    /**
	 * 获取：地区
	 */

    public void setZuixinyiqingName(String zuixinyiqingName) {
        this.zuixinyiqingName = zuixinyiqingName;
    }
    /**
	 * 设置：今日确诊人数
	 */
    public Integer getXinzengrenshu() {
        return xinzengrenshu;
    }
    /**
	 * 获取：今日确诊人数
	 */

    public void setXinzengrenshu(Integer xinzengrenshu) {
        this.xinzengrenshu = xinzengrenshu;
    }
    /**
	 * 设置：总确诊人数
	 */
    public Integer getZongrenshu() {
        return zongrenshu;
    }
    /**
	 * 获取：总确诊人数
	 */

    public void setZongrenshu(Integer zongrenshu) {
        this.zongrenshu = zongrenshu;
    }
    /**
	 * 设置：今日治愈人数
	 */
    public Integer getZhiyurenshu() {
        return zhiyurenshu;
    }
    /**
	 * 获取：今日治愈人数
	 */

    public void setZhiyurenshu(Integer zhiyurenshu) {
        this.zhiyurenshu = zhiyurenshu;
    }
    /**
	 * 设置：今日死亡人数
	 */
    public Integer getSiwangrenshu() {
        return siwangrenshu;
    }
    /**
	 * 获取：今日死亡人数
	 */

    public void setSiwangrenshu(Integer siwangrenshu) {
        this.siwangrenshu = siwangrenshu;
    }
    /**
	 * 设置：发布日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：发布日期
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zuixinyiqing{" +
            "id=" + id +
            ", zuixinyiqingName=" + zuixinyiqingName +
            ", xinzengrenshu=" + xinzengrenshu +
            ", zongrenshu=" + zongrenshu +
            ", zhiyurenshu=" + zhiyurenshu +
            ", siwangrenshu=" + siwangrenshu +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
