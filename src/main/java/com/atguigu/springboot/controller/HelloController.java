package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhangge
 * @date 2019/1/21 - 16:06
 */
@Controller
public class HelloController {

    @GetMapping("/abc")
    public String  hello(){
        return "hello";
    }
}
