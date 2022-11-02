package com.moonerhigh.ugomall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moonerhigh.ugomall.common.service.impl.CrudServiceImpl;
import com.moonerhigh.ugomall.coupon.dao.SpuBoundsDao;
import com.moonerhigh.ugomall.coupon.dto.SpuBoundsDTO;
import com.moonerhigh.ugomall.coupon.entity.SpuBoundsEntity;
import com.moonerhigh.ugomall.coupon.service.SpuBoundsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Service
public class SpuBoundsServiceImpl extends CrudServiceImpl<SpuBoundsDao, SpuBoundsEntity, SpuBoundsDTO> implements SpuBoundsService {

    @Override
    public QueryWrapper<SpuBoundsEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SpuBoundsEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}
