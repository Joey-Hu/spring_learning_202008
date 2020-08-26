package com.joeyhu.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author: huhao
 * @time: 2020/8/12 15:15
 * @desc:
 */
@Component
@Aspect
@Order(1)
public class PriorityProxy {

    @Before(value = "execution(* com.joeyhu.spring5.aopanno.User.add(..))")
    public void before() {
        System.out.println("priority before ... ...");
    }
}
