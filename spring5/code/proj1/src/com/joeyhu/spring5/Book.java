package com.joeyhu.spring5;

/**
 * @author: huhao
 * @time: 2020/8/10 15:44
 * @desc: 演示set方法注入属性
 */
public class Book {

    private String bName;
    private String bAuthor;
    private String bPublisher;

    public void setbPublisher(String bPublisher) {
        this.bPublisher = bPublisher;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bName='" + bName + '\'' +
                ", bAuthor='" + bAuthor + '\'' +
                ", bPublisher='" + bPublisher + '\'' +
                '}';
    }
}
