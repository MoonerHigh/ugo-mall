package com.moonerhigh.ugomall.order.dao;

import com.moonerhigh.ugomall.common.dao.BaseDao;
import com.moonerhigh.ugomall.order.entity.OrderSettingEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Mapper
public interface OrderSettingDao extends BaseDao<OrderSettingEntity> {

}
