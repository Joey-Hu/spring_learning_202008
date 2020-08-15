package com.joeyhu.spring5.dao;

/**
 * @author: huhao
 * @time: 2020/8/13 14:21
 * @desc:
 */
public interface UserDao {
    /**
     * 转入钱
     */
    public void addMoney();

    /**
     * 转出钱
     */
    public void reduceMoney();
}
