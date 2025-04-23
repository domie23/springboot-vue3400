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
 * 演出信息
 *
 * @author 
 * @email
 */
@TableName("yanchuxinxi")
public class YanchuxinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YanchuxinxiEntity() {

	}

	public YanchuxinxiEntity(T t) {
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
     * 演出标题
     */
    @TableField(value = "yanchuxinxi_name")

    private String yanchuxinxiName;


    /**
     * 表演类型
     */
    @TableField(value = "yanchuxinxi_types")

    private Integer yanchuxinxiTypes;


    /**
     * 封面
     */
    @TableField(value = "yanchuxinxi_photo")

    private String yanchuxinxiPhoto;


    /**
     * 主要演员
     */
    @TableField(value = "yanchuxinxi_yanyuan")

    private String yanchuxinxiYanyuan;


    /**
     * 位置数量
     */
    @TableField(value = "yanchuxinxi_kucun_number")

    private Integer yanchuxinxiKucunNumber;


    /**
     * 价格
     */
    @TableField(value = "yanchuxinxi_new_money")

    private Double yanchuxinxiNewMoney;


    /**
     * 演出时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "yanchuxinxi_time")

    private Date yanchuxinxiTime;


    /**
     * 演出详情
     */
    @TableField(value = "yanchuxinxi_content")

    private String yanchuxinxiContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：演出标题
	 */
    public String getYanchuxinxiName() {
        return yanchuxinxiName;
    }
    /**
	 * 获取：演出标题
	 */

    public void setYanchuxinxiName(String yanchuxinxiName) {
        this.yanchuxinxiName = yanchuxinxiName;
    }
    /**
	 * 设置：表演类型
	 */
    public Integer getYanchuxinxiTypes() {
        return yanchuxinxiTypes;
    }
    /**
	 * 获取：表演类型
	 */

    public void setYanchuxinxiTypes(Integer yanchuxinxiTypes) {
        this.yanchuxinxiTypes = yanchuxinxiTypes;
    }
    /**
	 * 设置：封面
	 */
    public String getYanchuxinxiPhoto() {
        return yanchuxinxiPhoto;
    }
    /**
	 * 获取：封面
	 */

    public void setYanchuxinxiPhoto(String yanchuxinxiPhoto) {
        this.yanchuxinxiPhoto = yanchuxinxiPhoto;
    }
    /**
	 * 设置：主要演员
	 */
    public String getYanchuxinxiYanyuan() {
        return yanchuxinxiYanyuan;
    }
    /**
	 * 获取：主要演员
	 */

    public void setYanchuxinxiYanyuan(String yanchuxinxiYanyuan) {
        this.yanchuxinxiYanyuan = yanchuxinxiYanyuan;
    }
    /**
	 * 设置：位置数量
	 */
    public Integer getYanchuxinxiKucunNumber() {
        return yanchuxinxiKucunNumber;
    }
    /**
	 * 获取：位置数量
	 */

    public void setYanchuxinxiKucunNumber(Integer yanchuxinxiKucunNumber) {
        this.yanchuxinxiKucunNumber = yanchuxinxiKucunNumber;
    }
    /**
	 * 设置：价格
	 */
    public Double getYanchuxinxiNewMoney() {
        return yanchuxinxiNewMoney;
    }
    /**
	 * 获取：价格
	 */

    public void setYanchuxinxiNewMoney(Double yanchuxinxiNewMoney) {
        this.yanchuxinxiNewMoney = yanchuxinxiNewMoney;
    }
    /**
	 * 设置：演出时间
	 */
    public Date getYanchuxinxiTime() {
        return yanchuxinxiTime;
    }
    /**
	 * 获取：演出时间
	 */

    public void setYanchuxinxiTime(Date yanchuxinxiTime) {
        this.yanchuxinxiTime = yanchuxinxiTime;
    }
    /**
	 * 设置：演出详情
	 */
    public String getYanchuxinxiContent() {
        return yanchuxinxiContent;
    }
    /**
	 * 获取：演出详情
	 */

    public void setYanchuxinxiContent(String yanchuxinxiContent) {
        this.yanchuxinxiContent = yanchuxinxiContent;
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
        return "Yanchuxinxi{" +
            "id=" + id +
            ", yanchuxinxiName=" + yanchuxinxiName +
            ", yanchuxinxiTypes=" + yanchuxinxiTypes +
            ", yanchuxinxiPhoto=" + yanchuxinxiPhoto +
            ", yanchuxinxiYanyuan=" + yanchuxinxiYanyuan +
            ", yanchuxinxiKucunNumber=" + yanchuxinxiKucunNumber +
            ", yanchuxinxiNewMoney=" + yanchuxinxiNewMoney +
            ", yanchuxinxiTime=" + yanchuxinxiTime +
            ", yanchuxinxiContent=" + yanchuxinxiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
