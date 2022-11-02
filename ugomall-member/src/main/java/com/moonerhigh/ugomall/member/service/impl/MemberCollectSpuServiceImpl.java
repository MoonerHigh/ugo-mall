package com.moonerhigh.ugomall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moonerhigh.ugomall.common.service.impl.CrudServiceImpl;
import com.moonerhigh.ugomall.member.entity.MemberCollectSpuEntity;
import com.moonerhigh.ugomall.member.dao.MemberCollectSpuDao;
import com.moonerhigh.ugomall.member.dto.MemberCollectSpuDTO;
import com.moonerhigh.ugomall.member.service.MemberCollectSpuService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Service
public class MemberCollectSpuServiceImpl extends CrudServiceImpl<MemberCollectSpuDao, MemberCollectSpuEntity, MemberCollectSpuDTO> implements MemberCollectSpuService {

    @Override
    public QueryWrapper<MemberCollectSpuEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<MemberCollectSpuEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}
