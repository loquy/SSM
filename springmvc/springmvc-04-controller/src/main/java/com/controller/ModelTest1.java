package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ModelTest1 {

    @RequestMapping("m1/t1")
    public String test1(Model model) {
        model.addAttribute("msg", "ModelTest1");

        // 没有配视图解析器需要完整路径
        //转发一
        return "/WEB-INF/jsp/test.jsp";
    }

    @RequestMapping("/m1/t2")
    public String test2(Model model){
        model.addAttribute("msg", "ModelTest2");

        //转发二
        return "forward:/WEB-INF/jsp/test.jsp";
    }

    @RequestMapping("/m1/t3")
    public String test3(Model model){
        model.addAttribute("msg", "ModelTest3");

        //重定向
        return "redirect:/index.jsp";
    }

}
