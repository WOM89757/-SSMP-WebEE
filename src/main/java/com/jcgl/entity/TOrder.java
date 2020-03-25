package com.jcgl.entity;

import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 征订期号信息
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 征订编号
     */
    @TableId
    private Integer orderId;

    /**
     * 征订期号
     */
    private Integer orderDnumber;

    /**
     * 年份
     */
    private LocalDate orderYear;

    /**
     * 卷期号
     */
    private Integer orderQihao;

    /**
     * 结算类型
     */
    @TableField("order_JStype")
    private String orderJstype;

    /**
     * 业务类型
     */
    @TableField("order_YWtpye")
    private String orderYwtpye;

    /**
     * 备注
     */
    private String orderComment;

    public TOrder(Integer orderId, Integer orderDnumber) {
        this.orderId = orderId;
        this.orderDnumber = orderDnumber;
    }
}
