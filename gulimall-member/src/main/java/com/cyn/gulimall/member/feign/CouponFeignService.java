package com.cyn.gulimall.member.feign;

import com.cyn.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chenyanan
 * Created by chenyanan on 2020/5/21
 *
 * feign 的声明式调用
 *
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
