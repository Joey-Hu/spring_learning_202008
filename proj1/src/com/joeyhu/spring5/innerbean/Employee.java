package com.joeyhu.spring5.innerbean;

/**
 * @author: huhao
 * @time: 2020/8/10 17:11
 * @desc:
 */
public class Employee {

    private String eName;
    private String eGender;
    private String dept;

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void seteGender(String eGender) {
        this.eGender = eGender;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eName='" + eName + '\'' +
                ", eGender='" + eGender + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
