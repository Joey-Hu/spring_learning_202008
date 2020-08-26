package com.joeyhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: huhao
 * @time: 2020/8/21 16:48
 * @desc: 测试RequestMapping放在类上面
 */
@RequestMapping(value = "/test")
@Controller
public class MyController {

    // 指定some.do 使用 get 请求方式
    @RequestMapping(value = "/some.do", method = RequestMethod.GET)
    public ModelAndView doSome() {
        ModelAndView mv = new ModelAndView();

        mv.addObject("msg", "使用 springMVC 进行 web 开发");
        mv.addObject("fun", "执行 doSome 方法");

        mv.setViewName("show");
        return mv;
    }

    // 指定other.do 使用 post 请求方式
    @RequestMapping(value = "/other.do", method = RequestMethod.POST)
    public ModelAndView doOther() {
        ModelAndView mv = new ModelAndView();

        mv.addObject("msg", "使用 springMVC 进行 web 开发");
        mv.addObject("fun", "执行 doOther 方法");
        mv.setViewName("other");
        return mv;
    }

    // 不指定请求提交方式
    @RequestMapping(value = "/first.do")
    public ModelAndView doFirst(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        ModelAndView mv = new ModelAndView();

        mv.addObject("msg", "使用 springMVC 进行 web 开发" + request.getParameter("name") + "||" + response + "||" + session);
        mv.addObject("fun", "执行 doFirst 方法");
        mv.setViewName("other");
        return mv;
    }
}
