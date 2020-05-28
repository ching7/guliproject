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
 *
 *  2、整合nacos配置中心
 *   1）依赖导入
 *   2）创建bootstrap.properties
 *   3) 配置中心添加对应服务的数据集，应用名.properties
 *   4）应用名.properties添加对应配置
 *   5）启用实时刷新配置注解 @Refresh
 *   6) 相同配置优先使用配置中心
 *
 *   nacos配置中心
 *   1）命名空间
 *     默认public:默认新增的所有配置都在public空间
 *     1> 开发、生产、测试:利用命名空间做相同配置的环境隔离(根据环境隔离)
 *     添加配置 -> spring.cloud.nacos.config.namespace=c418c7e8-69b8-45ef-b6af-98a6937c8211
 *     2> 每个微服务配置自个的命名空间(根据服务隔离)
 *   2）配置集
 *     一个配置文件中，所有配置的集合
 *   3）配置集id
 *     配置文件名
 *   4）配置分组
 *     默认所有的配置集都属于default_group
 *
 *   加载多配置集
 *   1、任何配置信息文件都可以放在配置中心
 *   2、需要在bootstrap.properties说明加载配置中心多那些配置文件即可
 *   3、@value @ConfigurationProperties等spring注解任通用
 *   ## 配置中心有等相同配置优先使用配置中心的
 *
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
