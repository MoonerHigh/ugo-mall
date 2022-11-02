package com.moonerhigh.ugomall.member.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 会员收货地址
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Data
public class MemberReceiveAddressExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "member_id")
    private Long memberId;
    @Excel(name = "收货人姓名")
    private String name;
    @Excel(name = "电话")
    private String phone;
    @Excel(name = "邮政编码")
    private String postCode;
    @Excel(name = "省份/直辖市")
    private String province;
    @Excel(name = "城市")
    private String city;
    @Excel(name = "区")
    private String region;
    @Excel(name = "详细地址(街道)")
    private String detailAddress;
    @Excel(name = "省市区代码")
    private String areacode;
    @Excel(name = "是否默认")
    private Integer defaultStatus;

}
