package com.joeyhu.spring5.dao.impl;

import com.joeyhu.spring5.dao.IUserDao;

/**
 * @author: huhao
 * @time: 2020/8/10 16:56
 * @desc:
 */
public class UserDao implements IUserDao {
    @Override
    public void update() {
        System.out.println("UserDao update...........");
    }
}
