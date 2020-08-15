package com.joeyhu.spring5.dao.impl;

import com.joeyhu.spring5.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author: huhao
 * @time: 2020/8/11 19:57
 * @desc:
 */
@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add ... ...");
    }
}
