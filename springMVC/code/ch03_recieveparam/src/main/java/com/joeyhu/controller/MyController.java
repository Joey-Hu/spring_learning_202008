package com.joeyhu.controller;

import com.joeyhu.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: huhao
 * @time: 2020/8/21 16:48
 * @desc: 测试逐个接收用户参数
 */
@Controller
public class MyController {
    // 指定other.do 使用 post 请求方式
    @RequestMapping(value = "/other.do", method = RequestMethod.POST)
    public ModelAndView doOther(String name, Integer age) {
        ModelAndView mv = new ModelAndView();

        mv.addObject("MyName", name);
        mv.addObject("MyAge", age);
        mv.setViewName("other");
        return mv;
    }

    // 请求中参数名和处理器方法的形参名不一样
    @RequestMapping(value = "/recieveParam.do")
    public ModelAndView recieveParam(@RequestParam(value = "hname", required = false) String name, @RequestParam(value = "hage", required = false) Integer age) {
        ModelAndView mv = new ModelAndView();

        mv.addObject("MyName", name);
        mv.addObject("MyAge", age);
        mv.setViewName("other");
        return mv;
    }

    // 使用java对象接收请求参数
    @RequestMapping(value = "/recieveObject.do")
    public ModelAndView recieveObject(Student student) {
        ModelAndView mv = new ModelAndView();

        mv.addObject("MyName", student.getName());
        mv.addObject("MyAge", student.getAge());
        mv.addObject("MyStudent", student);
        mv.setViewName("other");
        return mv;
    }
}
