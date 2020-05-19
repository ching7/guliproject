package com.cyn.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cyn.common.utils.PageUtils;
import com.cyn.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author chenyn
 * @email 775608598@qq.com
 * @date 2020-05-19 22:22:22
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

