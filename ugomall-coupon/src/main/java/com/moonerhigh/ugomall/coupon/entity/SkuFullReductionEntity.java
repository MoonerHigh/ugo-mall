package com.moonerhigh.ugomall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品满减信息
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Data
@TableName("sms_sku_full_reduction")
public class SkuFullReductionEntity {

    /**
     * id
     */
	private Long id;
    /**
     * spu_id
     */
	private Long skuId;
    /**
     * 满多少
     */
	private BigDecimal fullPrice;
    /**
     * 减多少
     */
	private BigDecimal reducePrice;
    /**
     * 是否参与其他优惠
     */
	private Integer addOther;
}
