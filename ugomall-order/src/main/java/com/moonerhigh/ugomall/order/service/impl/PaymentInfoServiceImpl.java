package com.moonerhigh.ugomall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moonerhigh.ugomall.common.service.impl.CrudServiceImpl;
import com.moonerhigh.ugomall.order.dao.PaymentInfoDao;
import com.moonerhigh.ugomall.order.dto.PaymentInfoDTO;
import com.moonerhigh.ugomall.order.entity.PaymentInfoEntity;
import com.moonerhigh.ugomall.order.service.PaymentInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Service
public class PaymentInfoServiceImpl extends CrudServiceImpl<PaymentInfoDao, PaymentInfoEntity, PaymentInfoDTO> implements PaymentInfoService {

    @Override
    public QueryWrapper<PaymentInfoEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<PaymentInfoEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}
