package com.joeyhu.spring5.service.impl;

import com.joeyhu.spring5.dao.UserDao;
import com.joeyhu.spring5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: huhao
 * @time: 2020/8/13 14:21
 * @desc:
 */
//@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void transfer() {

        userDao.reduceMoney();

        int i = 10 / 0;

        userDao.addMoney();
    }
}
