package com.entity.vo;

import com.entity.KaoqinxiangqingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 考勤详情
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("kaoqinxiangqing")
public class KaoqinxiangqingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 考勤通知
     */

    @TableField(value = "kaoqintongzhi_id")
    private Integer kaoqintongzhiId;


    /**
     * 员工
     */

    @TableField(value = "yuangong_id")
    private Integer yuangongId;


    /**
     * 体温
     */

    @TableField(value = "kaoqinxiangqing_tiwen")
    private Double kaoqinxiangqingTiwen;


    /**
     * 考勤时间
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
	 * 设置：考勤通知
	 */
    public Integer getKaoqintongzhiId() {
        return kaoqintongzhiId;
    }


    /**
	 * 获取：考勤通知
	 */

    public void setKaoqintongzhiId(Integer kaoqintongzhiId) {
        this.kaoqintongzhiId = kaoqintongzhiId;
    }
    /**
	 * 设置：员工
	 */
    public Integer getYuangongId() {
        return yuangongId;
    }


    /**
	 * 获取：员工
	 */

    public void setYuangongId(Integer yuangongId) {
        this.yuangongId = yuangongId;
    }
    /**
	 * 设置：体温
	 */
    public Double getKaoqinxiangqingTiwen() {
        return kaoqinxiangqingTiwen;
    }


    /**
	 * 获取：体温
	 */

    public void setKaoqinxiangqingTiwen(Double kaoqinxiangqingTiwen) {
        this.kaoqinxiangqingTiwen = kaoqinxiangqingTiwen;
    }
    /**
	 * 设置：考勤时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：考勤时间
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
