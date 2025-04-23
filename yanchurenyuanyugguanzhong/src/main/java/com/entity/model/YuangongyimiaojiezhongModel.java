package com.entity.model;

import com.entity.YuangongyimiaojiezhongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 员工疫苗接种情况
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YuangongyimiaojiezhongModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 接种疫苗
     */
    private String yuangongyimiaojiezhongName;


    /**
     * 疫苗类型
     */
    private Integer yuangongyimiaojiezhongTypes;


    /**
     * 接种时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date yuangongyimiaojiezhongTime;


    /**
     * 员工
     */
    private Integer yonghuId;


    /**
     * 备注
     */
    private String yuangongyimiaojiezhongText;


    /**
     * 记录时间
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
	 * 获取：接种疫苗
	 */
    public String getYuangongyimiaojiezhongName() {
        return yuangongyimiaojiezhongName;
    }


    /**
	 * 设置：接种疫苗
	 */
    public void setYuangongyimiaojiezhongName(String yuangongyimiaojiezhongName) {
        this.yuangongyimiaojiezhongName = yuangongyimiaojiezhongName;
    }
    /**
	 * 获取：疫苗类型
	 */
    public Integer getYuangongyimiaojiezhongTypes() {
        return yuangongyimiaojiezhongTypes;
    }


    /**
	 * 设置：疫苗类型
	 */
    public void setYuangongyimiaojiezhongTypes(Integer yuangongyimiaojiezhongTypes) {
        this.yuangongyimiaojiezhongTypes = yuangongyimiaojiezhongTypes;
    }
    /**
	 * 获取：接种时间
	 */
    public Date getYuangongyimiaojiezhongTime() {
        return yuangongyimiaojiezhongTime;
    }


    /**
	 * 设置：接种时间
	 */
    public void setYuangongyimiaojiezhongTime(Date yuangongyimiaojiezhongTime) {
        this.yuangongyimiaojiezhongTime = yuangongyimiaojiezhongTime;
    }
    /**
	 * 获取：员工
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：员工
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：备注
	 */
    public String getYuangongyimiaojiezhongText() {
        return yuangongyimiaojiezhongText;
    }


    /**
	 * 设置：备注
	 */
    public void setYuangongyimiaojiezhongText(String yuangongyimiaojiezhongText) {
        this.yuangongyimiaojiezhongText = yuangongyimiaojiezhongText;
    }
    /**
	 * 获取：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：记录时间
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
