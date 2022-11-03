package com.moonerhigh.ugomall.order.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Data
public class OrderExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "member_id")
    private Long memberId;
    @Excel(name = "订单号")
    private String orderSn;
    @Excel(name = "使用的优惠券")
    private Long couponId;
    @Excel(name = "create_time")
    private Date createTime;
    @Excel(name = "用户名")
    private String memberUsername;
    @Excel(name = "订单总额")
    private BigDecimal totalAmount;
    @Excel(name = "应付总额")
    private BigDecimal payAmount;
    @Excel(name = "运费金额")
    private BigDecimal freightAmount;
    @Excel(name = "促销优化金额（促销价、满减、阶梯价）")
    private BigDecimal promotionAmount;
    @Excel(name = "积分抵扣金额")
    private BigDecimal integrationAmount;
    @Excel(name = "优惠券抵扣金额")
    private BigDecimal couponAmount;
    @Excel(name = "后台调整订单使用的折扣金额")
    private BigDecimal discountAmount;
    @Excel(name = "支付方式【1->支付宝；2->微信；3->银联； 4->货到付款；】")
    private Integer payType;
    @Excel(name = "订单来源[0->PC订单；1->app订单]")
    private Integer sourceType;
    @Excel(name = "订单状态【0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单】")
    private Integer status;
    @Excel(name = "物流公司(配送方式)")
    private String deliveryCompany;
    @Excel(name = "物流单号")
    private String deliverySn;
    @Excel(name = "自动确认时间（天）")
    private Integer autoConfirmDay;
    @Excel(name = "可以获得的积分")
    private Integer integration;
    @Excel(name = "可以获得的成长值")
    private Integer growth;
    @Excel(name = "发票类型[0->不开发票；1->电子发票；2->纸质发票]")
    private Integer billType;
    @Excel(name = "发票抬头")
    private String billHeader;
    @Excel(name = "发票内容")
    private String billContent;
    @Excel(name = "收票人电话")
    private String billReceiverPhone;
    @Excel(name = "收票人邮箱")
    private String billReceiverEmail;
    @Excel(name = "收货人姓名")
    private String receiverName;
    @Excel(name = "收货人电话")
    private String receiverPhone;
    @Excel(name = "收货人邮编")
    private String receiverPostCode;
    @Excel(name = "省份/直辖市")
    private String receiverProvince;
    @Excel(name = "城市")
    private String receiverCity;
    @Excel(name = "区")
    private String receiverRegion;
    @Excel(name = "详细地址")
    private String receiverDetailAddress;
    @Excel(name = "订单备注")
    private String note;
    @Excel(name = "确认收货状态[0->未确认；1->已确认]")
    private Integer confirmStatus;
    @Excel(name = "删除状态【0->未删除；1->已删除】")
    private Integer deleteStatus;
    @Excel(name = "下单时使用的积分")
    private Integer useIntegration;
    @Excel(name = "支付时间")
    private Date paymentTime;
    @Excel(name = "发货时间")
    private Date deliveryTime;
    @Excel(name = "确认收货时间")
    private Date receiveTime;
    @Excel(name = "评价时间")
    private Date commentTime;
    @Excel(name = "修改时间")
    private Date modifyTime;

}
