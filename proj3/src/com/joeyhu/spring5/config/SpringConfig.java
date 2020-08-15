package com.joeyhu.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: huhao
 * @time: 2020/8/11 20:30
 * @desc: 测试完全注解开发
 */

@Configuration  //作为配置类，替代xml配置文件
@ComponentScan(basePackages = {"com.joeyhu.spring5"})  // 等价于<context:component-scan base-package="com.joeyhu.spring5"></context:component-scan>
public class SpringConfig {
}
