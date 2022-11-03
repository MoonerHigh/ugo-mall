package com.moonerhigh.ugomall.order.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 订单配置信息
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Data
public class OrderSettingExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "秒杀订单超时关闭时间(分)")
    private Integer flashOrderOvertime;
    @Excel(name = "正常订单超时时间(分)")
    private Integer normalOrderOvertime;
    @Excel(name = "发货后自动确认收货时间（天）")
    private Integer confirmOvertime;
    @Excel(name = "自动完成交易时间，不能申请退货（天）")
    private Integer finishOvertime;
    @Excel(name = "订单完成后自动好评时间（天）")
    private Integer commentOvertime;
    @Excel(name = "会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】")
    private Integer memberLevel;

}
