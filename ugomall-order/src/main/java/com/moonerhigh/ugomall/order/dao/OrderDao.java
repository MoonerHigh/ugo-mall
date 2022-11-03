package com.moonerhigh.ugomall.order.dao;

import com.moonerhigh.ugomall.common.dao.BaseDao;
import com.moonerhigh.ugomall.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Mapper
public interface OrderDao extends BaseDao<OrderEntity> {

}
