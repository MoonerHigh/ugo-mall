package com.moonerhigh.ugomall.ware.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 库存工作单
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Data
public class WareOrderTaskExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "order_id")
    private Long orderId;
    @Excel(name = "order_sn")
    private String orderSn;
    @Excel(name = "收货人")
    private String consignee;
    @Excel(name = "收货人电话")
    private String consigneeTel;
    @Excel(name = "配送地址")
    private String deliveryAddress;
    @Excel(name = "订单备注")
    private String orderComment;
    @Excel(name = "付款方式【 1:在线付款 2:货到付款】")
    private Integer paymentWay;
    @Excel(name = "任务状态")
    private Integer taskStatus;
    @Excel(name = "订单描述")
    private String orderBody;
    @Excel(name = "物流单号")
    private String trackingNo;
    @Excel(name = "create_time")
    private Date createTime;
    @Excel(name = "仓库id")
    private Long wareId;
    @Excel(name = "工作单备注")
    private String taskComment;

}
