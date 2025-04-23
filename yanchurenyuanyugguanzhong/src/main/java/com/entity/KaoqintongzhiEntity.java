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
 * 考勤通知
 *
 * @author 
 * @email
 */
@TableName("kaoqintongzhi")
public class KaoqintongzhiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KaoqintongzhiEntity() {

	}

	public KaoqintongzhiEntity(T t) {
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
     * 通知标题
     */
    @TableField(value = "kaoqintongzhi_name")

    private String kaoqintongzhiName;


    /**
     * 考勤类型
     */
    @TableField(value = "kaoqintongzhi_types")

    private Integer kaoqintongzhiTypes;


    /**
     * 考勤结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "kaoqintongzhi_time")

    private Date kaoqintongzhiTime;


    /**
     * 通知详情
     */
    @TableField(value = "kaoqintongzhi_content")

    private String kaoqintongzhiContent;


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
	 * 设置：通知标题
	 */
    public String getKaoqintongzhiName() {
        return kaoqintongzhiName;
    }
    /**
	 * 获取：通知标题
	 */

    public void setKaoqintongzhiName(String kaoqintongzhiName) {
        this.kaoqintongzhiName = kaoqintongzhiName;
    }
    /**
	 * 设置：考勤类型
	 */
    public Integer getKaoqintongzhiTypes() {
        return kaoqintongzhiTypes;
    }
    /**
	 * 获取：考勤类型
	 */

    public void setKaoqintongzhiTypes(Integer kaoqintongzhiTypes) {
        this.kaoqintongzhiTypes = kaoqintongzhiTypes;
    }
    /**
	 * 设置：考勤结束时间
	 */
    public Date getKaoqintongzhiTime() {
        return kaoqintongzhiTime;
    }
    /**
	 * 获取：考勤结束时间
	 */

    public void setKaoqintongzhiTime(Date kaoqintongzhiTime) {
        this.kaoqintongzhiTime = kaoqintongzhiTime;
    }
    /**
	 * 设置：通知详情
	 */
    public String getKaoqintongzhiContent() {
        return kaoqintongzhiContent;
    }
    /**
	 * 获取：通知详情
	 */

    public void setKaoqintongzhiContent(String kaoqintongzhiContent) {
        this.kaoqintongzhiContent = kaoqintongzhiContent;
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
        return "Kaoqintongzhi{" +
            "id=" + id +
            ", kaoqintongzhiName=" + kaoqintongzhiName +
            ", kaoqintongzhiTypes=" + kaoqintongzhiTypes +
            ", kaoqintongzhiTime=" + kaoqintongzhiTime +
            ", kaoqintongzhiContent=" + kaoqintongzhiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
