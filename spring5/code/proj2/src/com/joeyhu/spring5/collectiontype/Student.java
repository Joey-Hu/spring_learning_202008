package com.joeyhu.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author: huhao
 * @time: 2020/8/10 19:34
 * @desc: 测试集合类型属性注入
 */
public class Student {

    /**
     * 1. 数组类型属性
     */
    private String[] courses;

    /**
     * 2. List 类型属性
     */
    private List<String> lists;

    /**
     * 3. map 类型属性
     */
    private Map<String, String> maps;

    /**
     * 4. set 类型属性
     */
    private Set<String> sets;

    /**
     * 对象类型属性
     */
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", lists=" + lists +
                ", maps=" + maps +
                ", sets=" + sets +
                ", courseList=" + courseList +
                '}';
    }
}
