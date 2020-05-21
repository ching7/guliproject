package com.cyn.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

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
 *  2、整合nacos配置中心
 *   1）依赖导入
 *   2）创建bootstrap.properties
 *   3) 配置中心添加对应服务的数据集，应用名.properties
 *   4）应用名.properties添加对应配置
 *   5）启用实时刷新配置注解 @Refresh
 *   6) 相同配置优先使用配置中心
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
