package com.moonerhigh.ugomall.order.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 退货原因
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Data
@ApiModel(value = "退货原因")
public class OrderReturnReasonDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "id")
	private Long id;

	@ApiModelProperty(value = "退货原因名")
	private String name;

	@ApiModelProperty(value = "排序")
	private Integer sort;

	@ApiModelProperty(value = "启用状态")
	private Integer status;

	@ApiModelProperty(value = "create_time")
	private Date createTime;


}
