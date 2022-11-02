package com.moonerhigh.ugomall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moonerhigh.ugomall.common.service.impl.CrudServiceImpl;
import com.moonerhigh.ugomall.member.dao.MemberStatisticsInfoDao;
import com.moonerhigh.ugomall.member.dto.MemberStatisticsInfoDTO;
import com.moonerhigh.ugomall.member.entity.MemberStatisticsInfoEntity;
import com.moonerhigh.ugomall.member.service.MemberStatisticsInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Service
public class MemberStatisticsInfoServiceImpl extends CrudServiceImpl<MemberStatisticsInfoDao, MemberStatisticsInfoEntity, MemberStatisticsInfoDTO> implements MemberStatisticsInfoService {

    @Override
    public QueryWrapper<MemberStatisticsInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<MemberStatisticsInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}
