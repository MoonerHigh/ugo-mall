package com.moonerhigh.ugomall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Data
@TableName("wms_purchase_detail")
public class PurchaseDetailEntity {

    /**
     *
     */
	private Long id;
    /**
     * 采购单id
     */
	private Long purchaseId;
    /**
     * 采购商品id
     */
	private Long skuId;
    /**
     * 采购数量
     */
	private Integer skuNum;
    /**
     * 采购金额
     */
	private BigDecimal skuPrice;
    /**
     * 仓库id
     */
	private Long wareId;
    /**
     * 状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
     */
	private Integer status;
}
