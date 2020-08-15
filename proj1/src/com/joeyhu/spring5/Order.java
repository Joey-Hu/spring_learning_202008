package com.joeyhu.spring5;

/**
 * @author: huhao
 * @time: 2020/8/10 16:01
 * @desc: 演示有参构造注入属性
 */
public class Order {
    private String oName;
    private String address;

    public Order() { }

    public Order(String oName, String address) {
        this.oName = oName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oName='" + oName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
