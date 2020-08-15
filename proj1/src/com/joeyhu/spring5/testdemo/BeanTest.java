package com.joeyhu.spring5.testdemo;

import com.joeyhu.spring5.innerbean.Employee;
import com.joeyhu.spring5.service.impl.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: huhao
 * @time: 2020/8/10 17:00
 * @desc:
 */
public class BeanTest {

    @Test
    public void testUpdate(){

        // 1. 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        // 2. 获取配置文件创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();


    }

    @Test
    public void testEmp(){

        // 1. 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        // 2. 获取配置文件创建的对象
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);


    }


}
