package com.moonerhigh.ugomall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moonerhigh.ugomall.common.service.impl.CrudServiceImpl;
import com.moonerhigh.ugomall.product.dao.CategoryDao;
import com.moonerhigh.ugomall.product.dto.CategoryDTO;
import com.moonerhigh.ugomall.product.entity.CategoryEntity;
import com.moonerhigh.ugomall.product.service.CategoryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 商品三级分类
 *
 * @author MoonerHigh Maozilox@gmail.com
 * @since 1.0.0 2022-11-02
 */
@Service
public class CategoryServiceImpl extends CrudServiceImpl<CategoryDao, CategoryEntity, CategoryDTO> implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public QueryWrapper<CategoryEntity> getWrapper(Map<String, Object> params) {
        String id = (String) params.get("id");

        QueryWrapper<CategoryEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


    @Override
    public List<CategoryDTO> categoryTree() {
        //1. 查出所有分类
        List<CategoryEntity> categoryEntities = categoryDao.selectList(null);
        //2. 组装树型结构
        List<CategoryDTO> categoryDTOList = new ArrayList<>();
        for (CategoryEntity categoryEntity : categoryEntities) {
            if (0 == categoryEntity.getParentCid().longValue()) {
                CategoryDTO categoryDTO = new CategoryDTO();
                BeanUtils.copyProperties(categoryEntity, categoryDTO);
                categoryDTO.setSubList(getSubList(categoryDTO, categoryEntities));
                categoryDTOList.add(categoryDTO);
            }
        }
        // 排序
        categoryDTOList.sort(Comparator.comparing(CategoryDTO::getCatLevel));
        return categoryDTOList;
    }

    private List<CategoryDTO> getSubList(CategoryDTO categoryDTO, List<CategoryEntity> categoryEntities) {
        ArrayList<CategoryDTO> categoryList = new ArrayList<>();
        categoryEntities.forEach(item -> {
            if (item.getParentCid().longValue() == categoryDTO.getCatId().longValue()) {
                CategoryDTO temp = new CategoryDTO();
                BeanUtils.copyProperties(item,temp);
                temp.setSubList(getSubList(temp,categoryEntities));
                categoryList.add(temp);
            }
        });
        return categoryList;
    }
}
