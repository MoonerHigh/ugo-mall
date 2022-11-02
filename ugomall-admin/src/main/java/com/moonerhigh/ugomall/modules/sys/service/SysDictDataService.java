/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.moonerhigh.ugomall.modules.sys.service;

import com.moonerhigh.ugomall.modules.sys.entity.SysDictDataEntity;
import com.moonerhigh.ugomall.common.page.PageData;
import com.moonerhigh.ugomall.common.service.BaseService;
import com.moonerhigh.ugomall.modules.sys.dto.SysDictDataDTO;

import java.util.Map;

/**
 * 数据字典
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysDictDataService extends BaseService<SysDictDataEntity> {

    PageData<SysDictDataDTO> page(Map<String, Object> params);

    SysDictDataDTO get(Long id);

    void save(SysDictDataDTO dto);

    void update(SysDictDataDTO dto);

    void delete(Long[] ids);

}
