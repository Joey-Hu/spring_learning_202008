package com.joeyhu.spring5.autowire;

/**
 * @author: huhao
 * @time: 2020/8/11 15:54
 * @desc:
 */
public class Employee {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept=" + dept +
                '}';
    }
}
