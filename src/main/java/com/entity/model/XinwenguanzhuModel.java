package com.entity.model;

import com.entity.XinwenguanzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 防治知识
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XinwenguanzhuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 新闻标题
     */
    private String xinwenguanzhuName;


    /**
     * 防治知识类型
     */
    private Integer xinwenguanzhuTypes;


    /**
     * 防治知识图片
     */
    private String xinwenguanzhuPhoto;


    /**
     * 防治知识视频
     */
    private String xinwenguanzhuVideo;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 防治知识详情
     */
    private String xinwenguanzhuContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：新闻标题
	 */
    public String getXinwenguanzhuName() {
        return xinwenguanzhuName;
    }


    /**
	 * 设置：新闻标题
	 */
    public void setXinwenguanzhuName(String xinwenguanzhuName) {
        this.xinwenguanzhuName = xinwenguanzhuName;
    }
    /**
	 * 获取：防治知识类型
	 */
    public Integer getXinwenguanzhuTypes() {
        return xinwenguanzhuTypes;
    }


    /**
	 * 设置：防治知识类型
	 */
    public void setXinwenguanzhuTypes(Integer xinwenguanzhuTypes) {
        this.xinwenguanzhuTypes = xinwenguanzhuTypes;
    }
    /**
	 * 获取：防治知识图片
	 */
    public String getXinwenguanzhuPhoto() {
        return xinwenguanzhuPhoto;
    }


    /**
	 * 设置：防治知识图片
	 */
    public void setXinwenguanzhuPhoto(String xinwenguanzhuPhoto) {
        this.xinwenguanzhuPhoto = xinwenguanzhuPhoto;
    }
    /**
	 * 获取：防治知识视频
	 */
    public String getXinwenguanzhuVideo() {
        return xinwenguanzhuVideo;
    }


    /**
	 * 设置：防治知识视频
	 */
    public void setXinwenguanzhuVideo(String xinwenguanzhuVideo) {
        this.xinwenguanzhuVideo = xinwenguanzhuVideo;
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
	 * 获取：防治知识详情
	 */
    public String getXinwenguanzhuContent() {
        return xinwenguanzhuContent;
    }


    /**
	 * 设置：防治知识详情
	 */
    public void setXinwenguanzhuContent(String xinwenguanzhuContent) {
        this.xinwenguanzhuContent = xinwenguanzhuContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
