package com.cyn.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、整合mybatis-plus
 * 1）依赖导入
 * 2）配置
 * 1 配置数据源
 * 导入数据库驱动
 * 配置数据源,在application.yml
 * 2 配置mybatis-plus
 * 使用mapperScan
 * sql映射文件位置
 * <p>
 * 2、mybatis-plus逻辑删除功能
 * 3.2.0版本以上可以省略
 * 1、配置全局删除逻辑规则
 * 2、配置逻辑删除组件
 * 3、逻辑删除字段需要加上逻辑删除注解
 * <p>
 * 3、JSR303
 * 1、给Bean添加校验注解,javax.validation.constraints，并定义错误提示
 * 2、开启注解，@valid
 * 校验错误时会有默认的图标响应
 * 3、给校验的bean后加一个BindingResult,就可以获取到校验的结果
 * 4、分组校验功能
 * 1、@NotBlank(message = "品牌名必须填写", groups = {AddGroup.class, UpdateGroup.class})
 * 给注解校验标注什么分组情况需要校验
 * 2、public R save(@Validated({AddGroup.class}) @RequestBody BrandEntity brand)
 * controller需要指定分组
 * 加了分组的只校验已加分组的bean属性，没加分组的只校验未分组的bean属性
 * <p>
 * <p>
 * 4、统一的异常处理
 * 1、抽取统一异常处理类使用@ControllerAdvice
 * 2、使用@ExceptionHandler标注方法可以处理的异常
 * <p>
 * 5、自定义校验
 * 1、编写自定义校验注解 @ListValue
 * 2、编写自定义校验器 public class ListValueConstraintValidator implements ConstraintValidator<ListValue, Integer>
 * 3、关联自定义校验器和自定义校验注解 @Constraint(
 * validatedBy = {ListValueConstraintValidator.class}
 * 可以指定多个不同的校验器
 * )
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.cyn.gulimall.product.dao")
public class GulimalProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimalProductApplication.class, args);
    }

}
