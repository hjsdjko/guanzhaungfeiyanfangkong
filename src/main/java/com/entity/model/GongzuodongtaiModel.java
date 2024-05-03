package com.entity.model;

import com.entity.GongzuodongtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 工作动态
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongzuodongtaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 动态标题
     */
    private String gongzuodongtaiName;


    /**
     * 动态类型
     */
    private Integer gongzuodongtaiTypes;


    /**
     * 动态图片
     */
    private String gongzuodongtaiPhoto;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 动态详情
     */
    private String gongzuodongtaiContent;


    /**
     * 创建时间 show1 show2 nameShow
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
	 * 获取：动态标题
	 */
    public String getGongzuodongtaiName() {
        return gongzuodongtaiName;
    }


    /**
	 * 设置：动态标题
	 */
    public void setGongzuodongtaiName(String gongzuodongtaiName) {
        this.gongzuodongtaiName = gongzuodongtaiName;
    }
    /**
	 * 获取：动态类型
	 */
    public Integer getGongzuodongtaiTypes() {
        return gongzuodongtaiTypes;
    }


    /**
	 * 设置：动态类型
	 */
    public void setGongzuodongtaiTypes(Integer gongzuodongtaiTypes) {
        this.gongzuodongtaiTypes = gongzuodongtaiTypes;
    }
    /**
	 * 获取：动态图片
	 */
    public String getGongzuodongtaiPhoto() {
        return gongzuodongtaiPhoto;
    }


    /**
	 * 设置：动态图片
	 */
    public void setGongzuodongtaiPhoto(String gongzuodongtaiPhoto) {
        this.gongzuodongtaiPhoto = gongzuodongtaiPhoto;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：动态详情
	 */
    public String getGongzuodongtaiContent() {
        return gongzuodongtaiContent;
    }


    /**
	 * 设置：动态详情
	 */
    public void setGongzuodongtaiContent(String gongzuodongtaiContent) {
        this.gongzuodongtaiContent = gongzuodongtaiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
