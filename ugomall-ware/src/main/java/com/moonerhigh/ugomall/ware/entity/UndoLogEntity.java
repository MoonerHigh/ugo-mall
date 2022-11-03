package com.moonerhigh.ugomall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 *
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Data
@TableName("undo_log")
public class UndoLogEntity {

    /**
     *
     */
	private Long id;
    /**
     *
     */
	private Long branchId;
    /**
     *
     */
	private String xid;
    /**
     *
     */
	private String context;
    /**
     *
     */
	private byte[] rollbackInfo;
    /**
     *
     */
	private Integer logStatus;
    /**
     *
     */
	private Date logCreated;
    /**
     *
     */
	private Date logModified;
    /**
     *
     */
	private String ext;
}
