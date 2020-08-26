package com.joeyhu.spring5;

/**
 * @author: huhao
 * @time: 2020/8/12 9:15
 * @desc:
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println(" dao add 方法执行 ... ...");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("dao update 方法执行 ... ...");
        return id;
    }
}
