package com.moonerhigh.ugomall.product.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 商品评价回复关系
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Data
public class CommentReplayExcel {
    @Excel(name = "id")
    private Long id;
    @Excel(name = "评论id")
    private Long commentId;
    @Excel(name = "回复id")
    private Long replyId;

}
