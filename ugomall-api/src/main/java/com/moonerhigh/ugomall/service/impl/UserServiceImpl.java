/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.moonerhigh.ugomall.service.impl;

import com.moonerhigh.ugomall.common.exception.ErrorCode;
import com.moonerhigh.ugomall.common.exception.RenException;
import com.moonerhigh.ugomall.common.service.impl.BaseServiceImpl;
import com.moonerhigh.ugomall.common.validator.AssertUtils;
import com.moonerhigh.ugomall.dao.UserDao;
import com.moonerhigh.ugomall.entity.TokenEntity;
import com.moonerhigh.ugomall.entity.UserEntity;
import com.moonerhigh.ugomall.dto.LoginDTO;
import com.moonerhigh.ugomall.service.TokenService;
import com.moonerhigh.ugomall.service.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserDao, UserEntity> implements UserService {
	@Autowired
	private TokenService tokenService;

	@Override
	public UserEntity getByMobile(String mobile) {
		return baseDao.getUserByMobile(mobile);
	}

	@Override
	public UserEntity getUserByUserId(Long userId) {
		return baseDao.getUserByUserId(userId);
	}

	@Override
	public Map<String, Object> login(LoginDTO dto) {
		UserEntity user = getByMobile(dto.getMobile());
		AssertUtils.isNull(user, ErrorCode.ACCOUNT_PASSWORD_ERROR);

		//密码错误
		if(!user.getPassword().equals(DigestUtils.sha256Hex(dto.getPassword()))){
			throw new RenException(ErrorCode.ACCOUNT_PASSWORD_ERROR);
		}

		//获取登录token
		TokenEntity tokenEntity = tokenService.createToken(user.getId());

		Map<String, Object> map = new HashMap<>(2);
		map.put("token", tokenEntity.getToken());
		map.put("expire", tokenEntity.getExpireDate().getTime() - System.currentTimeMillis());

		return map;
	}

}
