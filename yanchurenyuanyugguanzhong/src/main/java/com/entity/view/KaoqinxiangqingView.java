package com.entity.view;

import com.entity.KaoqinxiangqingEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 考勤详情
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("kaoqinxiangqing")
public class KaoqinxiangqingView extends KaoqinxiangqingEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 kaoqintongzhi
			/**
			* 通知标题
			*/
			private String kaoqintongzhiName;
			/**
			* 考勤类型
			*/
			private Integer kaoqintongzhiTypes;
				/**
				* 考勤类型的值
				*/
				private String kaoqintongzhiValue;
			/**
			* 考勤结束时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			private Date kaoqintongzhiTime;
			/**
			* 通知详情
			*/
			private String kaoqintongzhiContent;

		//级联表 yuangong
			/**
			* 员工姓名
			*/
			private String yuangongName;
			/**
			* 头像
			*/
			private String yuangongPhoto;
			/**
			* 手机号
			*/
			private String yuangongPhone;
			/**
			* 电子邮箱
			*/
			private String yuangongEmail;
			/**
			* 假删
			*/
			private Integer yuangongDelete;

	public KaoqinxiangqingView() {

	}

	public KaoqinxiangqingView(KaoqinxiangqingEntity kaoqinxiangqingEntity) {
		try {
			BeanUtils.copyProperties(this, kaoqinxiangqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set kaoqintongzhi

					/**
					* 获取： 通知标题
					*/
					public String getKaoqintongzhiName() {
						return kaoqintongzhiName;
					}
					/**
					* 设置： 通知标题
					*/
					public void setKaoqintongzhiName(String kaoqintongzhiName) {
						this.kaoqintongzhiName = kaoqintongzhiName;
					}

					/**
					* 获取： 考勤类型
					*/
					public Integer getKaoqintongzhiTypes() {
						return kaoqintongzhiTypes;
					}
					/**
					* 设置： 考勤类型
					*/
					public void setKaoqintongzhiTypes(Integer kaoqintongzhiTypes) {
						this.kaoqintongzhiTypes = kaoqintongzhiTypes;
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

					/**
					* 获取： 考勤结束时间
					*/
					public Date getKaoqintongzhiTime() {
						return kaoqintongzhiTime;
					}
					/**
					* 设置： 考勤结束时间
					*/
					public void setKaoqintongzhiTime(Date kaoqintongzhiTime) {
						this.kaoqintongzhiTime = kaoqintongzhiTime;
					}

					/**
					* 获取： 通知详情
					*/
					public String getKaoqintongzhiContent() {
						return kaoqintongzhiContent;
					}
					/**
					* 设置： 通知详情
					*/
					public void setKaoqintongzhiContent(String kaoqintongzhiContent) {
						this.kaoqintongzhiContent = kaoqintongzhiContent;
					}






















				//级联表的get和set yuangong

					/**
					* 获取： 员工姓名
					*/
					public String getYuangongName() {
						return yuangongName;
					}
					/**
					* 设置： 员工姓名
					*/
					public void setYuangongName(String yuangongName) {
						this.yuangongName = yuangongName;
					}

					/**
					* 获取： 头像
					*/
					public String getYuangongPhoto() {
						return yuangongPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYuangongPhoto(String yuangongPhoto) {
						this.yuangongPhoto = yuangongPhoto;
					}

					/**
					* 获取： 手机号
					*/
					public String getYuangongPhone() {
						return yuangongPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYuangongPhone(String yuangongPhone) {
						this.yuangongPhone = yuangongPhone;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYuangongEmail() {
						return yuangongEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYuangongEmail(String yuangongEmail) {
						this.yuangongEmail = yuangongEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYuangongDelete() {
						return yuangongDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYuangongDelete(Integer yuangongDelete) {
						this.yuangongDelete = yuangongDelete;
					}






}
