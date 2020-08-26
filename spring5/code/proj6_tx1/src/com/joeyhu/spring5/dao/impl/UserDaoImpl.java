package com.joeyhu.spring5.dao.impl;

import com.joeyhu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author: huhao
 * @time: 2020/8/13 14:21
 * @desc:
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "UPDATE account set money=money+? WHERE name=?;";
        int i = jdbcTemplate.update(sql, 100, "Adam");
        if (i == 1){
            System.out.println("转入钱成功。");
        }
        else{
            System.out.println("转入钱失败。");
        }
    }

    @Override
    public void reduceMoney() {
        String sql = "UPDATE account set money=money-? WHERE name=?;";
        int i = jdbcTemplate.update(sql, 100, "Bob");
        if (i == 1){
            System.out.println("转出钱成功。");
        }
        else{
            System.out.println("转出钱失败。");
        }

    }
}
