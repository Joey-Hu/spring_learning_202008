package com.joeyhu.spring5.autowire;

/**
 * @author: huhao
 * @time: 2020/8/11 15:53
 * @desc:
 */
public class Dept {

    private String dName;

    public void setdName(String dName) {
        this.dName = dName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dName='" + dName + '\'' +
                '}';
    }
}
