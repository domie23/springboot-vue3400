package com.entity.model;

import com.entity.YanchuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 演出信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YanchuxinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 演出标题
     */
    private String yanchuxinxiName;


    /**
     * 表演类型
     */
    private Integer yanchuxinxiTypes;


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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yanchuxinxiTime;


    /**
     * 演出详情
     */
    private String yanchuxinxiContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：演出标题
	 */
    public String getYanchuxinxiName() {
        return yanchuxinxiName;
    }


    /**
	 * 设置：演出标题
	 */
    public void setYanchuxinxiName(String yanchuxinxiName) {
        this.yanchuxinxiName = yanchuxinxiName;
    }
    /**
	 * 获取：表演类型
	 */
    public Integer getYanchuxinxiTypes() {
        return yanchuxinxiTypes;
    }


    /**
	 * 设置：表演类型
	 */
    public void setYanchuxinxiTypes(Integer yanchuxinxiTypes) {
        this.yanchuxinxiTypes = yanchuxinxiTypes;
    }
    /**
	 * 获取：封面
	 */
    public String getYanchuxinxiPhoto() {
        return yanchuxinxiPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setYanchuxinxiPhoto(String yanchuxinxiPhoto) {
        this.yanchuxinxiPhoto = yanchuxinxiPhoto;
    }
    /**
	 * 获取：主要演员
	 */
    public String getYanchuxinxiYanyuan() {
        return yanchuxinxiYanyuan;
    }


    /**
	 * 设置：主要演员
	 */
    public void setYanchuxinxiYanyuan(String yanchuxinxiYanyuan) {
        this.yanchuxinxiYanyuan = yanchuxinxiYanyuan;
    }
    /**
	 * 获取：位置数量
	 */
    public Integer getYanchuxinxiKucunNumber() {
        return yanchuxinxiKucunNumber;
    }


    /**
	 * 设置：位置数量
	 */
    public void setYanchuxinxiKucunNumber(Integer yanchuxinxiKucunNumber) {
        this.yanchuxinxiKucunNumber = yanchuxinxiKucunNumber;
    }
    /**
	 * 获取：价格
	 */
    public Double getYanchuxinxiNewMoney() {
        return yanchuxinxiNewMoney;
    }


    /**
	 * 设置：价格
	 */
    public void setYanchuxinxiNewMoney(Double yanchuxinxiNewMoney) {
        this.yanchuxinxiNewMoney = yanchuxinxiNewMoney;
    }
    /**
	 * 获取：演出时间
	 */
    public Date getYanchuxinxiTime() {
        return yanchuxinxiTime;
    }


    /**
	 * 设置：演出时间
	 */
    public void setYanchuxinxiTime(Date yanchuxinxiTime) {
        this.yanchuxinxiTime = yanchuxinxiTime;
    }
    /**
	 * 获取：演出详情
	 */
    public String getYanchuxinxiContent() {
        return yanchuxinxiContent;
    }


    /**
	 * 设置：演出详情
	 */
    public void setYanchuxinxiContent(String yanchuxinxiContent) {
        this.yanchuxinxiContent = yanchuxinxiContent;
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
