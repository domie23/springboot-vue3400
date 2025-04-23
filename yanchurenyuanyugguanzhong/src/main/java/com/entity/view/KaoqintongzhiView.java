package com.entity.view;

import com.entity.KaoqintongzhiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 考勤通知
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kaoqintongzhi")
public class KaoqintongzhiView extends KaoqintongzhiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 考勤类型的值
		*/
		private String kaoqintongzhiValue;



	public KaoqintongzhiView() {

	}

	public KaoqintongzhiView(KaoqintongzhiEntity kaoqintongzhiEntity) {
		try {
			BeanUtils.copyProperties(this, kaoqintongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 考勤类型的值
			*/
			public String getKaoqintongzhiValue() {
				return kaoqintongzhiValue;
			}
			/**
			* 设置： 考勤类型的值
			*/
			public void setKaoqintongzhiValue(String kaoqintongzhiValue) {
				this.kaoqintongzhiValue = kaoqintongzhiValue;
			}













}
