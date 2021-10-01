package com.controller;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/t1")
    // @RequestParam("username")，强制参数为username，传递参数name则失败
    public String test1(@RequestParam("username") String name, Model model) {
        //1.接受前端参数
        System.out.println("接收到前端的参数为：" + name);

        //2.将返回的结果传递给前端
        model.addAttribute("msg", name);

        //3.视图跳转
        return "test";
    }

    // 接收前端的一个对象 http://localhost:8080/user/t3?name=xx&id=1&age=11
    @GetMapping("/t2")
    public String test2(User user) {
        System.out.println(user);
        return "test";
    }

    @GetMapping("/t3")
    public String test3(String name, ModelMap map) {
        //封装要显示到视图中的数据
        //相当于req.setAttribute("name",name);
        map.addAttribute("msg",name);
        System.out.println(name);
        return "test";
    }
}
