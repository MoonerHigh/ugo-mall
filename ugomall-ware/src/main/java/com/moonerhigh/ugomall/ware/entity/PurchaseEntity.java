package com.moonerhigh.ugomall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 采购信息
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Data
@TableName("wms_purchase")
public class PurchaseEntity {

    /**
     *
     */
	private Long id;
    /**
     *
     */
	private Long assigneeId;
    /**
     *
     */
	private String assigneeName;
    /**
     *
     */
	private String phone;
    /**
     *
     */
	private Integer priority;
    /**
     *
     */
	private Integer status;
    /**
     *
     */
	private Long wareId;
    /**
     *
     */
	private BigDecimal amount;
    /**
     *
     */
	private Date createTime;
    /**
     *
     */
	private Date updateTime;
}
