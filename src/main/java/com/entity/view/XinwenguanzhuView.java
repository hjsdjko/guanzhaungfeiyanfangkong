package com.entity.view;

import com.entity.XinwenguanzhuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 防治知识
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xinwenguanzhu")
public class XinwenguanzhuView extends XinwenguanzhuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 防治知识类型的值
		*/
		private String xinwenguanzhuValue;



	public XinwenguanzhuView() {

	}

	public XinwenguanzhuView(XinwenguanzhuEntity xinwenguanzhuEntity) {
		try {
			BeanUtils.copyProperties(this, xinwenguanzhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 防治知识类型的值
			*/
			public String getXinwenguanzhuValue() {
				return xinwenguanzhuValue;
			}
			/**
			* 设置： 防治知识类型的值
			*/
			public void setXinwenguanzhuValue(String xinwenguanzhuValue) {
				this.xinwenguanzhuValue = xinwenguanzhuValue;
			}










}
