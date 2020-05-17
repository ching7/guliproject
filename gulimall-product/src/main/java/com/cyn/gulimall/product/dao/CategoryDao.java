package com.cyn.gulimall.product.dao;

import com.cyn.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenyn
 * @email 775608598@qq.com
 * @date 2020-05-17 18:42:29
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
