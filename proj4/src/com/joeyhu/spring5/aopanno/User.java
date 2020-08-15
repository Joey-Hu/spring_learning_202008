package com.joeyhu.spring5.aopanno;

/**
 * @author: huhao
 * @time: 2020/8/12 10:56
 * @desc:
 */

import org.springframework.stereotype.Component;

/**
 * 被增强类
 */
@Component
public class User {
    public void add() {
//        int i = 10/0;
        System.out.println("add ... ...");
    }
}
