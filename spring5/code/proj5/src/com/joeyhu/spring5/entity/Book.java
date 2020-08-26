package com.joeyhu.spring5.entity;

/**
 * @author: huhao
 * @time: 2020/8/12 16:34
 * @desc:
 */
public class Book {

    private String bNo;
    private String bName;
    private String bAuthor;

    public String getbNo() {
        return bNo;
    }

    public void setbNo(String bNo) {
        this.bNo = bNo;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bNo='" + bNo + '\'' +
                ", bName='" + bName + '\'' +
                ", bAuthor='" + bAuthor + '\'' +
                '}';
    }
}
