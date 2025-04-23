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
 * 员工疫苗接种情况
 *
 * @author 
 * @email
 */
@TableName("yuangongyimiaojiezhong")
public class YuangongyimiaojiezhongEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YuangongyimiaojiezhongEntity() {

	}

	public YuangongyimiaojiezhongEntity(T t) {
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
     * 接种疫苗
     */
    @TableField(value = "yuangongyimiaojiezhong_name")

    private String yuangongyimiaojiezhongName;


    /**
     * 疫苗类型
     */
    @TableField(value = "yuangongyimiaojiezhong_types")

    private Integer yuangongyimiaojiezhongTypes;


    /**
     * 接种时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "yuangongyimiaojiezhong_time")

    private Date yuangongyimiaojiezhongTime;


    /**
     * 员工
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 备注
     */
    @TableField(value = "yuangongyimiaojiezhong_text")

    private String yuangongyimiaojiezhongText;


    /**
     * 记录时间
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
	 * 设置：接种疫苗
	 */
    public String getYuangongyimiaojiezhongName() {
        return yuangongyimiaojiezhongName;
    }
    /**
	 * 获取：接种疫苗
	 */

    public void setYuangongyimiaojiezhongName(String yuangongyimiaojiezhongName) {
        this.yuangongyimiaojiezhongName = yuangongyimiaojiezhongName;
    }
    /**
	 * 设置：疫苗类型
	 */
    public Integer getYuangongyimiaojiezhongTypes() {
        return yuangongyimiaojiezhongTypes;
    }
    /**
	 * 获取：疫苗类型
	 */

    public void setYuangongyimiaojiezhongTypes(Integer yuangongyimiaojiezhongTypes) {
        this.yuangongyimiaojiezhongTypes = yuangongyimiaojiezhongTypes;
    }
    /**
	 * 设置：接种时间
	 */
    public Date getYuangongyimiaojiezhongTime() {
        return yuangongyimiaojiezhongTime;
    }
    /**
	 * 获取：接种时间
	 */

    public void setYuangongyimiaojiezhongTime(Date yuangongyimiaojiezhongTime) {
        this.yuangongyimiaojiezhongTime = yuangongyimiaojiezhongTime;
    }
    /**
	 * 设置：员工
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：员工
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：备注
	 */
    public String getYuangongyimiaojiezhongText() {
        return yuangongyimiaojiezhongText;
    }
    /**
	 * 获取：备注
	 */

    public void setYuangongyimiaojiezhongText(String yuangongyimiaojiezhongText) {
        this.yuangongyimiaojiezhongText = yuangongyimiaojiezhongText;
    }
    /**
	 * 设置：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：记录时间
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
        return "Yuangongyimiaojiezhong{" +
            "id=" + id +
            ", yuangongyimiaojiezhongName=" + yuangongyimiaojiezhongName +
            ", yuangongyimiaojiezhongTypes=" + yuangongyimiaojiezhongTypes +
            ", yuangongyimiaojiezhongTime=" + yuangongyimiaojiezhongTime +
            ", yonghuId=" + yonghuId +
            ", yuangongyimiaojiezhongText=" + yuangongyimiaojiezhongText +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
