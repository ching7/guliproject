package com.cyn.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
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
 *
 * 2、mybatis-plus逻辑删除功能
 * 3.2.0版本以上可以省略
 *  1、配置全局删除逻辑规则
 *  2、配置逻辑删除组件
 *  3、逻辑删除字段需要加上逻辑删除注解
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.cyn.gulimall.product.dao")
public class GulimalProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimalProductApplication.class, args);
    }

}
