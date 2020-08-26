package com.joeyhu.spring5.beanlifecycle;

/**
 * @author: huhao
 * @time: 2020/8/11 15:00
 * @desc: 测试 bean 生命周期
 */
public class Order {

    private String oName;

    public Order() {
        System.out.println("第一步：通过无参构造创建 bean 实例");
    }

    public void setoName(String oName) {
        this.oName = oName;
        System.out.println("第二步：为 bean 注入属性");
    }

    /**
     * bean 初始化方法
     */
    public void initMethod() {
        System.out.println("第三步：调用bean的初始化的方法");

    }

    /**
     * bean 销毁方法
     */
    public void destroyMethod() {
        System.out.println("第五步：调用bean的销毁方法");
    }
}
