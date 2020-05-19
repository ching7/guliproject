package com.cyn.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合mybatis-plus
 *   1）依赖导入
 *   2）配置
 *      1 配置数据源
 *          导入数据库驱动
 *          配置数据源,在application.yml
 *      2 配置mybatis-plus
 *          使用mapperScan
 *          sql映射文件位置
 *
 *
 */
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
