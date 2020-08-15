package com.joeyhu.spring5.test;

import com.joeyhu.spring5.aopanno.User;
import com.joeyhu.spring5.aopanno.UserProxy;
import com.joeyhu.spring5.config.ConfigAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: huhao
 * @time: 2020/8/12 11:17
 * @desc:
 */
public class AOPTest {

    @Test
    public void testAopAnnotation() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = context.getBean("user", User.class);
        user.add();
    }
}
