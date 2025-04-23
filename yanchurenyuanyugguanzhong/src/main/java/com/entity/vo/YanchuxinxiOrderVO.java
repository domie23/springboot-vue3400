package com.entity.vo;

import com.entity.YanchuxinxiOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 购票订单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yanchuxinxi_order")
public class YanchuxinxiOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 订单号
     */

    @TableField(value = "yanchuxinxi_order_uuid_number")
    private String yanchuxinxiOrderUuidNumber;


    /**
     * 演出信息
     */

    @TableField(value = "yanchuxinxi_id")
    private Integer yanchuxinxiId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 购买数量
     */

    @TableField(value = "buy_number")
    private Integer buyNumber;


    /**
     * 实付价格
     */

    @TableField(value = "yanchuxinxi_order_true_price")
    private Double yanchuxinxiOrderTruePrice;


    /**
     * 订单状态
     */

    @TableField(value = "yanchuxinxi_order_types")
    private Integer yanchuxinxiOrderTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3
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
	 * 设置：订单号
	 */
    public String getYanchuxinxiOrderUuidNumber() {
        return yanchuxinxiOrderUuidNumber;
    }


    /**
	 * 获取：订单号
	 */

    public void setYanchuxinxiOrderUuidNumber(String yanchuxinxiOrderUuidNumber) {
        this.yanchuxinxiOrderUuidNumber = yanchuxinxiOrderUuidNumber;
    }
    /**
	 * 设置：演出信息
	 */
    public Integer getYanchuxinxiId() {
        return yanchuxinxiId;
    }


    /**
	 * 获取：演出信息
	 */

    public void setYanchuxinxiId(Integer yanchuxinxiId) {
        this.yanchuxinxiId = yanchuxinxiId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 获取：购买数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getYanchuxinxiOrderTruePrice() {
        return yanchuxinxiOrderTruePrice;
    }


    /**
	 * 获取：实付价格
	 */

    public void setYanchuxinxiOrderTruePrice(Double yanchuxinxiOrderTruePrice) {
        this.yanchuxinxiOrderTruePrice = yanchuxinxiOrderTruePrice;
    }
    /**
	 * 设置：订单状态
	 */
    public Integer getYanchuxinxiOrderTypes() {
        return yanchuxinxiOrderTypes;
    }


    /**
	 * 获取：订单状态
	 */

    public void setYanchuxinxiOrderTypes(Integer yanchuxinxiOrderTypes) {
        this.yanchuxinxiOrderTypes = yanchuxinxiOrderTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
