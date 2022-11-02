package com.moonerhigh.ugomall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moonerhigh.ugomall.common.service.impl.CrudServiceImpl;
import com.moonerhigh.ugomall.coupon.dao.HomeAdvDao;
import com.moonerhigh.ugomall.coupon.dto.HomeAdvDTO;
import com.moonerhigh.ugomall.coupon.entity.HomeAdvEntity;
import com.moonerhigh.ugomall.coupon.service.HomeAdvService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Service
public class HomeAdvServiceImpl extends CrudServiceImpl<HomeAdvDao, HomeAdvEntity, HomeAdvDTO> implements HomeAdvService {

    @Override
    public QueryWrapper<HomeAdvEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<HomeAdvEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}
