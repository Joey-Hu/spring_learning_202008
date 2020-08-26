package com.joeyhu.spring5.test;

import com.joeyhu.spring5.autowire.Employee;
import com.joeyhu.spring5.beanlifecycle.Order;
import com.joeyhu.spring5.collectiontype.Book;
import com.joeyhu.spring5.collectiontype.Course;
import com.joeyhu.spring5.collectiontype.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: huhao
 * @time: 2020/8/10 19:53
 * @desc:
 */
public class BeanTest {

    @Test
    public void testCollection() {

        // 1. 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2. 获取配置创建的对象
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void testFactoryBean() {

        // 1. 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        // 2. 获取配置创建的对象
        // 注意getBean里面的class和String不一样，注意返回类型
        Course myFactoryBean = context.getBean("myFactoryBean", Course.class);
        System.out.println(myFactoryBean);
    }

    @Test
    public void testScope() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);

        System.out.println(book1);
        System.out.println(book2);
    }

    @Test
    public void testLifecycle() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        Order order = context.getBean("order", Order.class);
        System.out.println("第四步：获取到bean");
        System.out.println(order);

        ((ClassPathXmlApplicationContext)context).close();
    }

    @Test
    public void testAutowire() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");

        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
