package com.joeyhu.spring5.service;

import com.joeyhu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: huhao
 * @time: 2020/8/11 17:03
 * @desc: 测试注解方式创建对象
 */

//在注解里面value属性值可以省略不写，
// 默认值是类名称，首字母小写
// UserService -- userService

@Service(value = "userService")
public class UserService {
    //定义dao类型属性
    // 不需要添加set方法
    // 添加注入属性注解
    @Autowired  // 根据类型进行注入
    @Qualifier(value = "userDaoImpl1")  //根据名称进行注入
    private UserDao userDao;

    @Value(value = "abc")
    private String name;

    public void add() {
        System.out.println("service add ... ..." + name);
        userDao.add();
    }
}
