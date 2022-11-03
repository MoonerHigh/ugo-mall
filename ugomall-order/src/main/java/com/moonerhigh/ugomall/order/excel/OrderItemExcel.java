package com.moonerhigh.ugomall.order.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单项信息
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Data
public class OrderItemExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "order_id")
    private Long orderId;
    @Excel(name = "order_sn")
    private String orderSn;
    @Excel(name = "spu_id")
    private Long spuId;
    @Excel(name = "spu_name")
    private String spuName;
    @Excel(name = "spu_pic")
    private String spuPic;
    @Excel(name = "品牌")
    private String spuBrand;
    @Excel(name = "商品分类id")
    private Long categoryId;
    @Excel(name = "商品sku编号")
    private Long skuId;
    @Excel(name = "商品sku名字")
    private String skuName;
    @Excel(name = "商品sku图片")
    private String skuPic;
    @Excel(name = "商品sku价格")
    private BigDecimal skuPrice;
    @Excel(name = "商品购买的数量")
    private Integer skuQuantity;
    @Excel(name = "商品销售属性组合（JSON）")
    private String skuAttrsVals;
    @Excel(name = "商品促销分解金额")
    private BigDecimal promotionAmount;
    @Excel(name = "优惠券优惠分解金额")
    private BigDecimal couponAmount;
    @Excel(name = "积分优惠分解金额")
    private BigDecimal integrationAmount;
    @Excel(name = "该商品经过优惠后的分解金额")
    private BigDecimal realAmount;
    @Excel(name = "赠送积分")
    private Integer giftIntegration;
    @Excel(name = "赠送成长值")
    private Integer giftGrowth;

}
