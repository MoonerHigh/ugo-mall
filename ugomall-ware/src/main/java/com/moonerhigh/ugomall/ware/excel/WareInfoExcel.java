package com.moonerhigh.ugomall.ware.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 仓库信息
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Data
public class WareInfoExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "仓库名")
    private String name;
    @Excel(name = "仓库地址")
    private String address;
    @Excel(name = "区域编码")
    private String areacode;

}
