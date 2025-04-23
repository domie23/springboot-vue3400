package com.entity.vo;

import com.entity.KaoqintongzhiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 考勤通知
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kaoqintongzhi")
public class KaoqintongzhiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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

}
