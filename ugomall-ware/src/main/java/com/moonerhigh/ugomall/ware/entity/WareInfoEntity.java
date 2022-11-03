package com.moonerhigh.ugomall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 仓库信息
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Data
@TableName("wms_ware_info")
public class WareInfoEntity {

    /**
     * id
     */
	private Long id;
    /**
     * 仓库名
     */
	private String name;
    /**
     * 仓库地址
     */
	private String address;
    /**
     * 区域编码
     */
	private String areacode;
}
