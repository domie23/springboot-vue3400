package com.entity.view;

import com.entity.YanchuxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 演出信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yanchuxinxi")
public class YanchuxinxiView extends YanchuxinxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 表演类型的值
		*/
		private String yanchuxinxiValue;



	public YanchuxinxiView() {

	}

	public YanchuxinxiView(YanchuxinxiEntity yanchuxinxiEntity) {
		try {
			BeanUtils.copyProperties(this, yanchuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 表演类型的值
			*/
			public String getYanchuxinxiValue() {
				return yanchuxinxiValue;
			}
			/**
			* 设置： 表演类型的值
			*/
			public void setYanchuxinxiValue(String yanchuxinxiValue) {
				this.yanchuxinxiValue = yanchuxinxiValue;
			}













}
