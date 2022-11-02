package com.moonerhigh.ugomall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moonerhigh.ugomall.common.service.impl.CrudServiceImpl;
import com.moonerhigh.ugomall.coupon.dao.SeckillSessionDao;
import com.moonerhigh.ugomall.coupon.dto.SeckillSessionDTO;
import com.moonerhigh.ugomall.coupon.entity.SeckillSessionEntity;
import com.moonerhigh.ugomall.coupon.service.SeckillSessionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Service
public class SeckillSessionServiceImpl extends CrudServiceImpl<SeckillSessionDao, SeckillSessionEntity, SeckillSessionDTO> implements SeckillSessionService {

    @Override
    public QueryWrapper<SeckillSessionEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SeckillSessionEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}
