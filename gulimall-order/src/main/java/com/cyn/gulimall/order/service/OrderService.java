package com.cyn.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cyn.common.utils.PageUtils;
import com.cyn.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author chenyn
 * @email 775608598@qq.com
 * @date 2020-05-19 22:44:23
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

