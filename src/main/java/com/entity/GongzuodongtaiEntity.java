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
 * 工作动态
 *
 * @author 
 * @email
 */
@TableName("gongzuodongtai")
public class GongzuodongtaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongzuodongtaiEntity() {

	}

	public GongzuodongtaiEntity(T t) {
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
     * 动态标题
     */
    @TableField(value = "gongzuodongtai_name")

    private String gongzuodongtaiName;


    /**
     * 动态类型
     */
    @TableField(value = "gongzuodongtai_types")

    private Integer gongzuodongtaiTypes;


    /**
     * 动态图片
     */
    @TableField(value = "gongzuodongtai_photo")

    private String gongzuodongtaiPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 动态详情
     */
    @TableField(value = "gongzuodongtai_content")

    private String gongzuodongtaiContent;


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
	 * 设置：动态标题
	 */
    public String getGongzuodongtaiName() {
        return gongzuodongtaiName;
    }
    /**
	 * 获取：动态标题
	 */

    public void setGongzuodongtaiName(String gongzuodongtaiName) {
        this.gongzuodongtaiName = gongzuodongtaiName;
    }
    /**
	 * 设置：动态类型
	 */
    public Integer getGongzuodongtaiTypes() {
        return gongzuodongtaiTypes;
    }
    /**
	 * 获取：动态类型
	 */

    public void setGongzuodongtaiTypes(Integer gongzuodongtaiTypes) {
        this.gongzuodongtaiTypes = gongzuodongtaiTypes;
    }
    /**
	 * 设置：动态图片
	 */
    public String getGongzuodongtaiPhoto() {
        return gongzuodongtaiPhoto;
    }
    /**
	 * 获取：动态图片
	 */

    public void setGongzuodongtaiPhoto(String gongzuodongtaiPhoto) {
        this.gongzuodongtaiPhoto = gongzuodongtaiPhoto;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：动态详情
	 */
    public String getGongzuodongtaiContent() {
        return gongzuodongtaiContent;
    }
    /**
	 * 获取：动态详情
	 */

    public void setGongzuodongtaiContent(String gongzuodongtaiContent) {
        this.gongzuodongtaiContent = gongzuodongtaiContent;
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
        return "Gongzuodongtai{" +
            "id=" + id +
            ", gongzuodongtaiName=" + gongzuodongtaiName +
            ", gongzuodongtaiTypes=" + gongzuodongtaiTypes +
            ", gongzuodongtaiPhoto=" + gongzuodongtaiPhoto +
            ", insertTime=" + insertTime +
            ", gongzuodongtaiContent=" + gongzuodongtaiContent +
            ", createTime=" + createTime +
        "}";
    }
}
