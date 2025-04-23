package com.entity.model;

import com.entity.KaoqintongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 考勤通知
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KaoqintongzhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 通知标题
     */
    private String kaoqintongzhiName;


    /**
     * 考勤类型
     */
    private Integer kaoqintongzhiTypes;


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


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：通知标题
	 */
    public String getKaoqintongzhiName() {
        return kaoqintongzhiName;
    }


    /**
	 * 设置：通知标题
	 */
    public void setKaoqintongzhiName(String kaoqintongzhiName) {
        this.kaoqintongzhiName = kaoqintongzhiName;
    }
    /**
	 * 获取：考勤类型
	 */
    public Integer getKaoqintongzhiTypes() {
        return kaoqintongzhiTypes;
    }


    /**
	 * 设置：考勤类型
	 */
    public void setKaoqintongzhiTypes(Integer kaoqintongzhiTypes) {
        this.kaoqintongzhiTypes = kaoqintongzhiTypes;
    }
    /**
	 * 获取：考勤结束时间
	 */
    public Date getKaoqintongzhiTime() {
        return kaoqintongzhiTime;
    }


    /**
	 * 设置：考勤结束时间
	 */
    public void setKaoqintongzhiTime(Date kaoqintongzhiTime) {
        this.kaoqintongzhiTime = kaoqintongzhiTime;
    }
    /**
	 * 获取：通知详情
	 */
    public String getKaoqintongzhiContent() {
        return kaoqintongzhiContent;
    }


    /**
	 * 设置：通知详情
	 */
    public void setKaoqintongzhiContent(String kaoqintongzhiContent) {
        this.kaoqintongzhiContent = kaoqintongzhiContent;
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
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
