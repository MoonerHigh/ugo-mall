/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.moonerhigh.ugomall.dao;

import com.moonerhigh.ugomall.common.dao.BaseDao;
import com.moonerhigh.ugomall.entity.TokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户Token
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface TokenDao extends BaseDao<TokenEntity> {
    TokenEntity getByToken(String token);

    TokenEntity getByUserId(Long userId);
}