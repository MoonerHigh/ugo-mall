package com.moonerhigh.ugomall.member.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 会员登录记录
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Data
@ApiModel(value = "会员登录记录")
public class MemberLoginLogDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "id")
	private Long id;

	@ApiModelProperty(value = "member_id")
	private Long memberId;

	@ApiModelProperty(value = "创建时间")
	private Date createTime;

	@ApiModelProperty(value = "ip")
	private String ip;

	@ApiModelProperty(value = "city")
	private String city;

	@ApiModelProperty(value = "登录类型[1-web，2-app]")
	private Integer loginType;


}
