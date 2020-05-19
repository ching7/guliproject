package com.cyn.gulimall.coupon.dao;

import com.cyn.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenyn
 * @email 775608598@qq.com
 * @date 2020-05-19 22:22:22
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
