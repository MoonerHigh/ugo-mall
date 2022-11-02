/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.moonerhigh.ugomall.modules.job.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.moonerhigh.ugomall.modules.job.dao.ScheduleJobLogDao;
import com.moonerhigh.ugomall.modules.job.dto.ScheduleJobLogDTO;
import com.moonerhigh.ugomall.modules.job.entity.ScheduleJobLogEntity;
import com.moonerhigh.ugomall.modules.job.service.ScheduleJobLogService;
import com.moonerhigh.ugomall.common.constant.Constant;
import com.moonerhigh.ugomall.common.page.PageData;
import com.moonerhigh.ugomall.common.service.impl.BaseServiceImpl;
import com.moonerhigh.ugomall.common.utils.ConvertUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ScheduleJobLogServiceImpl extends BaseServiceImpl<ScheduleJobLogDao, ScheduleJobLogEntity> implements ScheduleJobLogService {

	@Override
	public PageData<ScheduleJobLogDTO> page(Map<String, Object> params) {
		IPage<ScheduleJobLogEntity> page = baseDao.selectPage(
			getPage(params, Constant.CREATE_DATE, false),
			getWrapper(params)
		);
		return getPageData(page, ScheduleJobLogDTO.class);
	}

	private QueryWrapper<ScheduleJobLogEntity> getWrapper(Map<String, Object> params){
		String jobId = (String)params.get("jobId");

		QueryWrapper<ScheduleJobLogEntity> wrapper = new QueryWrapper<>();
		wrapper.eq(StringUtils.isNotBlank(jobId), "job_id", jobId);

		return wrapper;
	}

	@Override
	public ScheduleJobLogDTO get(Long id) {
		ScheduleJobLogEntity entity = baseDao.selectById(id);

		return ConvertUtils.sourceToTarget(entity, ScheduleJobLogDTO.class);
	}

}
