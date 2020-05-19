package com.cyn.gulimall.order.dao;

import com.cyn.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author chenyn
 * @email 775608598@qq.com
 * @date 2020-05-19 22:44:23
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
