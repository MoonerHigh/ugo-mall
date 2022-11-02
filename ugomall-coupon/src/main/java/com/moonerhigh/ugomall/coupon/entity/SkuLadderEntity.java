package com.moonerhigh.ugomall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品阶梯价格
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Data
@TableName("sms_sku_ladder")
public class SkuLadderEntity {

    /**
     * id
     */
	private Long id;
    /**
     * spu_id
     */
	private Long skuId;
    /**
     * 满几件
     */
	private Integer fullCount;
    /**
     * 打几折
     */
	private BigDecimal discount;
    /**
     * 折后价
     */
	private BigDecimal price;
    /**
     * 是否叠加其他优惠[0-不可叠加，1-可叠加]
     */
	private Integer addOther;
}