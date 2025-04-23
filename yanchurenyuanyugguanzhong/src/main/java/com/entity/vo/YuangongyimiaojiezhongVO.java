package com.entity.vo;

import com.entity.YuangongyimiaojiezhongEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 员工疫苗接种情况
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yuangongyimiaojiezhong")
public class YuangongyimiaojiezhongVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

}
