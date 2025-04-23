package com.entity.view;

import com.entity.YanchuxinxiOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 购票订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yanchuxinxi_order")
public class YanchuxinxiOrderView extends YanchuxinxiOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 订单状态的值
		*/
		private String yanchuxinxiOrderValue;



		//级联表 yanchuxinxi
			/**
			* 演出标题
			*/
			private String yanchuxinxiName;
			/**
			* 表演类型
			*/
			private Integer yanchuxinxiTypes;
				/**
				* 表演类型的值
				*/
				private String yanchuxinxiValue;
			/**
			* 封面
			*/
			private String yanchuxinxiPhoto;
			/**
			* 主要演员
			*/
			private String yanchuxinxiYanyuan;
			/**
			* 位置数量
			*/
			private Integer yanchuxinxiKucunNumber;
			/**
			* 价格
			*/
			private Double yanchuxinxiNewMoney;
			/**
			* 演出时间
			*/
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
			@DateTimeFormat
			private Date yanchuxinxiTime;
			/**
			* 演出详情
			*/
			private String yanchuxinxiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public YanchuxinxiOrderView() {

	}

	public YanchuxinxiOrderView(YanchuxinxiOrderEntity yanchuxinxiOrderEntity) {
		try {
			BeanUtils.copyProperties(this, yanchuxinxiOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 订单状态的值
			*/
			public String getYanchuxinxiOrderValue() {
				return yanchuxinxiOrderValue;
			}
			/**
			* 设置： 订单状态的值
			*/
			public void setYanchuxinxiOrderValue(String yanchuxinxiOrderValue) {
				this.yanchuxinxiOrderValue = yanchuxinxiOrderValue;
			}



















				//级联表的get和set yanchuxinxi

					/**
					* 获取： 演出标题
					*/
					public String getYanchuxinxiName() {
						return yanchuxinxiName;
					}
					/**
					* 设置： 演出标题
					*/
					public void setYanchuxinxiName(String yanchuxinxiName) {
						this.yanchuxinxiName = yanchuxinxiName;
					}

					/**
					* 获取： 表演类型
					*/
					public Integer getYanchuxinxiTypes() {
						return yanchuxinxiTypes;
					}
					/**
					* 设置： 表演类型
					*/
					public void setYanchuxinxiTypes(Integer yanchuxinxiTypes) {
						this.yanchuxinxiTypes = yanchuxinxiTypes;
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

					/**
					* 获取： 封面
					*/
					public String getYanchuxinxiPhoto() {
						return yanchuxinxiPhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setYanchuxinxiPhoto(String yanchuxinxiPhoto) {
						this.yanchuxinxiPhoto = yanchuxinxiPhoto;
					}

					/**
					* 获取： 主要演员
					*/
					public String getYanchuxinxiYanyuan() {
						return yanchuxinxiYanyuan;
					}
					/**
					* 设置： 主要演员
					*/
					public void setYanchuxinxiYanyuan(String yanchuxinxiYanyuan) {
						this.yanchuxinxiYanyuan = yanchuxinxiYanyuan;
					}

					/**
					* 获取： 位置数量
					*/
					public Integer getYanchuxinxiKucunNumber() {
						return yanchuxinxiKucunNumber;
					}
					/**
					* 设置： 位置数量
					*/
					public void setYanchuxinxiKucunNumber(Integer yanchuxinxiKucunNumber) {
						this.yanchuxinxiKucunNumber = yanchuxinxiKucunNumber;
					}

					/**
					* 获取： 价格
					*/
					public Double getYanchuxinxiNewMoney() {
						return yanchuxinxiNewMoney;
					}
					/**
					* 设置： 价格
					*/
					public void setYanchuxinxiNewMoney(Double yanchuxinxiNewMoney) {
						this.yanchuxinxiNewMoney = yanchuxinxiNewMoney;
					}

					/**
					* 获取： 演出时间
					*/
					public Date getYanchuxinxiTime() {
						return yanchuxinxiTime;
					}
					/**
					* 设置： 演出时间
					*/
					public void setYanchuxinxiTime(Date yanchuxinxiTime) {
						this.yanchuxinxiTime = yanchuxinxiTime;
					}

					/**
					* 获取： 演出详情
					*/
					public String getYanchuxinxiContent() {
						return yanchuxinxiContent;
					}
					/**
					* 设置： 演出详情
					*/
					public void setYanchuxinxiContent(String yanchuxinxiContent) {
						this.yanchuxinxiContent = yanchuxinxiContent;
					}







				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}









}
