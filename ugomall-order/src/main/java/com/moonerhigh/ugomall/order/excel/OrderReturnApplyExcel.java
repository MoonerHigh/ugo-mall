package com.moonerhigh.ugomall.order.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单退货申请
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Data
public class OrderReturnApplyExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "order_id")
    private Long orderId;
    @Excel(name = "退货商品id")
    private Long skuId;
    @Excel(name = "订单编号")
    private String orderSn;
    @Excel(name = "申请时间")
    private Date createTime;
    @Excel(name = "会员用户名")
    private String memberUsername;
    @Excel(name = "退款金额")
    private BigDecimal returnAmount;
    @Excel(name = "退货人姓名")
    private String returnName;
    @Excel(name = "退货人电话")
    private String returnPhone;
    @Excel(name = "申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]")
    private Integer status;
    @Excel(name = "处理时间")
    private Date handleTime;
    @Excel(name = "商品图片")
    private String skuImg;
    @Excel(name = "商品名称")
    private String skuName;
    @Excel(name = "商品品牌")
    private String skuBrand;
    @Excel(name = "商品销售属性(JSON)")
    private String skuAttrsVals;
    @Excel(name = "退货数量")
    private Integer skuCount;
    @Excel(name = "商品单价")
    private BigDecimal skuPrice;
    @Excel(name = "商品实际支付单价")
    private BigDecimal skuRealPrice;
    @Excel(name = "原因")
    private String reason;
    @Excel(name = "描述")
    private String description述;
    @Excel(name = "凭证图片，以逗号隔开")
    private String descPics;
    @Excel(name = "处理备注")
    private String handleNote;
    @Excel(name = "处理人员")
    private String handleMan;
    @Excel(name = "收货人")
    private String receiveMan;
    @Excel(name = "收货时间")
    private Date receiveTime;
    @Excel(name = "收货备注")
    private String receiveNote;
    @Excel(name = "收货电话")
    private String receivePhone;
    @Excel(name = "公司收货地址")
    private String companyAddress;

}
