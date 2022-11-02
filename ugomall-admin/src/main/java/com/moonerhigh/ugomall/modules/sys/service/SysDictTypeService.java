/**
 * Copyright (c) 2018 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.moonerhigh.ugomall.modules.sys.service;

import com.moonerhigh.ugomall.modules.sys.entity.SysDictTypeEntity;
import com.moonerhigh.ugomall.common.page.PageData;
import com.moonerhigh.ugomall.common.service.BaseService;
import com.moonerhigh.ugomall.modules.sys.dto.SysDictTypeDTO;
import com.moonerhigh.ugomall.modules.sys.entity.DictType;

import java.util.List;
import java.util.Map;

/**
 * 数据字典
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysDictTypeService extends BaseService<SysDictTypeEntity> {

    PageData<SysDictTypeDTO> page(Map<String, Object> params);

    SysDictTypeDTO get(Long id);

    void save(SysDictTypeDTO dto);

    void update(SysDictTypeDTO dto);

    void delete(Long[] ids);

    /**
     * 获取所有字典
     */
    List<DictType> getAllList();

}
