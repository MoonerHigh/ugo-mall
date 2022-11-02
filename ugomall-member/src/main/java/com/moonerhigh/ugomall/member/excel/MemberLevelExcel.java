package com.moonerhigh.ugomall.member.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 会员等级
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Data
public class MemberLevelExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "等级名称")
    private String name;
    @Excel(name = "等级需要的成长值")
    private Integer growthPoint;
    @Excel(name = "是否为默认等级[0->不是；1->是]")
    private Integer defaultStatus;
    @Excel(name = "免运费标准")
    private BigDecimal freeFreightPoint;
    @Excel(name = "每次评价获取的成长值")
    private Integer commentGrowthPoint;
    @Excel(name = "是否有免邮特权")
    private Integer priviledgeFreeFreight;
    @Excel(name = "是否有会员价格特权")
    private Integer priviledgeMemberPrice;
    @Excel(name = "是否有生日特权")
    private Integer priviledgeBirthday;
    @Excel(name = "备注")
    private String note;

}
