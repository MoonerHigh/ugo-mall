package com.moonerhigh.ugomall.member.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 成长值变化历史记录
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Data
public class GrowthChangeHistoryExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "member_id")
    private Long memberId;
    @Excel(name = "create_time")
    private Date createTime;
    @Excel(name = "改变的值（正负计数）")
    private Integer changeCount;
    @Excel(name = "备注")
    private String note;
    @Excel(name = "积分来源[0-购物，1-管理员修改]")
    private Integer sourceType;

}
