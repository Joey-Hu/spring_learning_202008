package com.joeyhu.spring5.collectiontype;

/**
 * @author: huhao
 * @time: 2020/8/10 20:18
 * @desc:
 */
public class Course {

    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
