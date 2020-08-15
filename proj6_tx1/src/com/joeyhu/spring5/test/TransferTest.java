package com.joeyhu.spring5.test;

import com.joeyhu.spring5.service.UserService;
import com.joeyhu.spring5.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: huhao
 * @time: 2020/8/13 14:52
 * @desc:
 */
public class TransferTest {

    @Test
    public void testDemo1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        UserService userService = context.getBean("userServiceImpl", UserServiceImpl.class);
        userService.transfer();

    }
}
