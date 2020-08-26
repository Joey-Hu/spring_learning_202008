package com.joeyhu.spring5.testdemo;

import com.joeyhu.spring5.Book;
import com.joeyhu.spring5.Order;
import com.joeyhu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: huhao
 * @time: 2020/8/10 10:52
 * @desc: 测试类
 */
public class Spring5Test {

    @Test
    public void testAdd() {

        // 1. 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2. 获取配置文件创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook() {

        // 1. 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2. 获取配置文件创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void testOrder() {

        // 1. 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2. 获取配置文件创建的对象
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
    }
}
