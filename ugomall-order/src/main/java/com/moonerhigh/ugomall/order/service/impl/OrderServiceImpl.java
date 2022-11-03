package com.moonerhigh.ugomall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moonerhigh.ugomall.common.service.impl.CrudServiceImpl;
import com.moonerhigh.ugomall.order.dao.OrderDao;
import com.moonerhigh.ugomall.order.dto.OrderDTO;
import com.moonerhigh.ugomall.order.entity.OrderEntity;
import com.moonerhigh.ugomall.order.service.OrderService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 订单
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Service
public class OrderServiceImpl extends CrudServiceImpl<OrderDao, OrderEntity, OrderDTO> implements OrderService {

    @Override
    public QueryWrapper<OrderEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<OrderEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}
