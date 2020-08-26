package com.joeyhu.spring5.factorybean;

import com.joeyhu.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author: huhao
 * @time: 2020/8/10 20:48
 * @desc:
 */
public class MyFactoryBean implements FactoryBean<Course>{

    /**
     * 定义 bean 返回类型
     * @return
     * @throws Exception
     */
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("汉语言");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
