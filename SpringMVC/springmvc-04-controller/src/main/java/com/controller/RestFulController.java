package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {

    // 原来的：http://localhost:8080/add?a=1&b=2
    // RestFul http://localhost:8080/add/1/2

//    @RequestMapping"/add/{a}/{b}")
//    @RequestMapping(name="/add/{a}/{b}")
//    @RequestMapping(value="/add/{a}/{b}")
//    @RequestMapping(path="/add/{a}/{b}")
//    @RequestMapping(value="/add/{a}/{b}", method = RequestMethod.GET)
//    @RequestMapping(path="/add/{a}/{b}", method = RequestMethod.POST)

//    @GetMapping
//    @PostMapping
//    @PutMapping
//    @DeleteMapping
//    @PatchMapping

    @GetMapping ("/add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果为" + res);
        return "test";
    }

    @PostMapping ("/add/{a}/{b}")
    public String test2(@PathVariable String a, @PathVariable String b, Model model) {
        String res = a + b;
        model.addAttribute("msg", "结果为" + res);
        return "test";
    }
}
