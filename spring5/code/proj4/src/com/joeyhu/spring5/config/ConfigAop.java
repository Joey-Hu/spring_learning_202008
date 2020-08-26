package com.joeyhu.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: huhao
 * @time: 2020/8/12 15:29
 * @desc:
 */
@Configuration
@ComponentScan(basePackages = {"com.joeyhu.spring5"})  // 等价于<context:component-scan base-package="com.joeyhu.spring5.aopanno"></context:component-scan>
@EnableAspectJAutoProxy(proxyTargetClass = true)  // 等价于 <aop:aspectj-autoproxy></aop:aspectj-autoproxy>
public class ConfigAop {
}
