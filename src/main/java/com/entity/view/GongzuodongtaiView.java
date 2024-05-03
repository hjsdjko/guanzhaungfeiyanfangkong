package com.entity.view;

import com.entity.GongzuodongtaiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 工作动态
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("gongzuodongtai")
public class GongzuodongtaiView extends GongzuodongtaiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 动态类型的值
		*/
		private String gongzuodongtaiValue;



	public GongzuodongtaiView() {

	}

	public GongzuodongtaiView(GongzuodongtaiEntity gongzuodongtaiEntity) {
		try {
			BeanUtils.copyProperties(this, gongzuodongtaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 动态类型的值
			*/
			public String getGongzuodongtaiValue() {
				return gongzuodongtaiValue;
			}
			/**
			* 设置： 动态类型的值
			*/
			public void setGongzuodongtaiValue(String gongzuodongtaiValue) {
				this.gongzuodongtaiValue = gongzuodongtaiValue;
			}










}
