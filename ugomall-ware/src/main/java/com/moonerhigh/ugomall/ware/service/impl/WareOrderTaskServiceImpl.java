package com.moonerhigh.ugomall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moonerhigh.ugomall.common.service.impl.CrudServiceImpl;
import com.moonerhigh.ugomall.ware.dao.WareOrderTaskDao;
import com.moonerhigh.ugomall.ware.dto.WareOrderTaskDTO;
import com.moonerhigh.ugomall.ware.entity.WareOrderTaskEntity;
import com.moonerhigh.ugomall.ware.service.WareOrderTaskService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-03
 */
@Service
public class WareOrderTaskServiceImpl extends CrudServiceImpl<WareOrderTaskDao, WareOrderTaskEntity, WareOrderTaskDTO> implements WareOrderTaskService {

    @Override
    public QueryWrapper<WareOrderTaskEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<WareOrderTaskEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}
