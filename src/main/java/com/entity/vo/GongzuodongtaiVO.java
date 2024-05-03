package com.entity.vo;

import com.entity.GongzuodongtaiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 工作动态
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongzuodongtai")
public class GongzuodongtaiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 动态详情
     */

    @TableField(value = "gongzuodongtai_content")
    private String gongzuodongtaiContent;


    /**
     * 创建时间 show1 show2 nameShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
