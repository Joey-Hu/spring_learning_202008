package com.joeyhu.spring5.testdemo;


import com.joeyhu.spring5.config.SpringConfig;
import com.joeyhu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: huhao
 * @time: 2020/8/11 17:06
 * @desc:
 */
public class Spring5Test {

    @Test
    public void testCreateObjectWithAnnotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();

    }

    @Test
    public void testAnnotation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);  // 不同
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();

    }
}
