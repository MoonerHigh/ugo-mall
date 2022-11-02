package com.moonerhigh.ugomall.member.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 会员统计信息
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Data
public class MemberStatisticsInfoExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "会员id")
    private Long memberId;
    @Excel(name = "累计消费金额")
    private BigDecimal consumeAmount;
    @Excel(name = "累计优惠金额")
    private BigDecimal couponAmount;
    @Excel(name = "订单数量")
    private Integer orderCount;
    @Excel(name = "优惠券数量")
    private Integer couponCount;
    @Excel(name = "评价数")
    private Integer commentCount;
    @Excel(name = "退货数量")
    private Integer returnOrderCount;
    @Excel(name = "登录次数")
    private Integer loginCount;
    @Excel(name = "关注数量")
    private Integer attendCount;
    @Excel(name = "粉丝数量")
    private Integer fansCount;
    @Excel(name = "收藏的商品数量")
    private Integer collectProductCount;
    @Excel(name = "收藏的专题活动数量")
    private Integer collectSubjectCount;
    @Excel(name = "收藏的评论数量")
    private Integer collectCommentCount;
    @Excel(name = "邀请的朋友数量")
    private Integer inviteFriendCount;

}
