package com.moonerhigh.ugomall.coupon.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品会员价格
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Data
public class MemberPriceExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "sku_id")
    private Long skuId;
    @Excel(name = "会员等级id")
    private Long memberLevelId;
    @Excel(name = "会员等级名")
    private String memberLevelName;
    @Excel(name = "会员对应价格")
    private BigDecimal memberPrice;
    @Excel(name = "可否叠加其他优惠[0-不可叠加优惠，1-可叠加]")
    private Integer addOther;

}
