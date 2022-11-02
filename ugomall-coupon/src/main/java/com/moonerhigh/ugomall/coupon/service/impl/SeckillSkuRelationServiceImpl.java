package com.moonerhigh.ugomall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moonerhigh.ugomall.common.service.impl.CrudServiceImpl;
import com.moonerhigh.ugomall.coupon.dao.SeckillSkuRelationDao;
import com.moonerhigh.ugomall.coupon.dto.SeckillSkuRelationDTO;
import com.moonerhigh.ugomall.coupon.entity.SeckillSkuRelationEntity;
import com.moonerhigh.ugomall.coupon.service.SeckillSkuRelationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Service
public class SeckillSkuRelationServiceImpl extends CrudServiceImpl<SeckillSkuRelationDao, SeckillSkuRelationEntity, SeckillSkuRelationDTO> implements SeckillSkuRelationService {

    @Override
    public QueryWrapper<SeckillSkuRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SeckillSkuRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}
