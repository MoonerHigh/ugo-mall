package com.moonerhigh.ugomall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moonerhigh.ugomall.common.service.impl.CrudServiceImpl;
import com.moonerhigh.ugomall.coupon.dao.SeckillPromotionDao;
import com.moonerhigh.ugomall.coupon.dto.SeckillPromotionDTO;
import com.moonerhigh.ugomall.coupon.entity.SeckillPromotionEntity;
import com.moonerhigh.ugomall.coupon.service.SeckillPromotionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Service
public class SeckillPromotionServiceImpl extends CrudServiceImpl<SeckillPromotionDao, SeckillPromotionEntity, SeckillPromotionDTO> implements SeckillPromotionService {

    @Override
    public QueryWrapper<SeckillPromotionEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SeckillPromotionEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}
