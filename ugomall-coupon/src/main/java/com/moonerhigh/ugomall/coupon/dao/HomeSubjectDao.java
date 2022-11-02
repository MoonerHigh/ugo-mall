package com.moonerhigh.ugomall.coupon.dao;

import com.moonerhigh.ugomall.common.dao.BaseDao;
import com.moonerhigh.ugomall.coupon.entity.HomeSubjectEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Mapper
public interface HomeSubjectDao extends BaseDao<HomeSubjectEntity> {

}
