package com.moonerhigh.ugomall.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moonerhigh.ugomall.common.service.impl.CrudServiceImpl;
import com.moonerhigh.ugomall.order.dao.OrderItemDao;
import com.moonerhigh.ugomall.order.dto.OrderItemDTO;
import com.moonerhigh.ugomall.order.entity.OrderItemEntity;
import com.moonerhigh.ugomall.order.service.OrderItemService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Service
public class OrderItemServiceImpl extends CrudServiceImpl<OrderItemDao, OrderItemEntity, OrderItemDTO> implements OrderItemService {

    @Override
    public QueryWrapper<OrderItemEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<OrderItemEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}
