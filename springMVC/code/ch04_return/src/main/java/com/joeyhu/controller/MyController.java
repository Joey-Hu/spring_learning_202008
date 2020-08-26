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


    // 返回String类型的请求处理方法
    @RequestMapping(value = "/returnString.do")
    public String doReturnString(HttpServletRequest request, Student student) {
        request.setAttribute("myStudent", student);
        return "show";
//        return "/WEB-INF/view/show.jsp";
    }
}
