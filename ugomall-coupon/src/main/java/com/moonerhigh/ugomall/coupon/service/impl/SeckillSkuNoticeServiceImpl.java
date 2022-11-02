package com.moonerhigh.ugomall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moonerhigh.ugomall.common.service.impl.CrudServiceImpl;
import com.moonerhigh.ugomall.coupon.dao.SeckillSkuNoticeDao;
import com.moonerhigh.ugomall.coupon.dto.SeckillSkuNoticeDTO;
import com.moonerhigh.ugomall.coupon.entity.SeckillSkuNoticeEntity;
import com.moonerhigh.ugomall.coupon.service.SeckillSkuNoticeService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Service
public class SeckillSkuNoticeServiceImpl extends CrudServiceImpl<SeckillSkuNoticeDao, SeckillSkuNoticeEntity, SeckillSkuNoticeDTO> implements SeckillSkuNoticeService {

    @Override
    public QueryWrapper<SeckillSkuNoticeEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<SeckillSkuNoticeEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}
