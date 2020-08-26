package com.joeyhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: huhao
 * @time: 2020/8/21 16:48
 * @desc:
 */
@Controller
public class MyController {

    @RequestMapping(value = {"/some.do", "/first.do"})  // 斜杠 / 表示 http://localhost:8080/ch01_hello_springmvc
    public ModelAndView doSome() {
        ModelAndView mv = new ModelAndView();

        // 添加数据，框架在请求的最后把数据放入到 request 作用域。相当于 request.setAttribute("msg", "使用 springMVC 进行 web 开发")
        // ModelAndView.addObject(String attributeName, Object attributeValue )
        mv.addObject("msg", "使用 springMVC 进行 web 开发");
        mv.addObject("fun", "执行 doSome 方法");

        // 指定视图，指定视图的完整路径  框架对视图执行 forward 操作，request.getRequestDispatcher("/show.jsp").forward(...)
        // mv.setViewName("/WEB-INF/view/show.jsp");

        // 当配置了视图解析器时，指定视图路径
        // 框架会使用视图解析器的前缀 + 视图名称 + 视图解析器后缀组成完整路径
        mv.setViewName("show");
        return mv;
    }

    @RequestMapping(value = {"/other.do", "/second.do"})
    public ModelAndView doOther() {
        ModelAndView mv = new ModelAndView();


        mv.addObject("msg", "使用 springMVC 进行 web 开发");
        mv.addObject("fun", "执行 doOther 方法");
        mv.setViewName("other");
        return mv;
    }
}
