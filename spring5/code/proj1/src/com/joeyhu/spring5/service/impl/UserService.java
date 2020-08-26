package com.joeyhu.spring5.service.impl;

import com.joeyhu.spring5.dao.impl.UserDao;
import com.joeyhu.spring5.service.IUserService;

/**
 * @author: huhao
 * @time: 2020/8/10 16:53
 * @desc:
 */
public class UserService implements IUserService{

    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("UserService add ...");
        userDao.update();
    }
}
