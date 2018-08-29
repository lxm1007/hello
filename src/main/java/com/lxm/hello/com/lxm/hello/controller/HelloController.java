package com.lxm.hello.com.lxm.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public  String hello(){
    return "现在的时间是："+this.helloService.foormatDate(new Date());
    }

    @RequestMapping("/time")
    public String toHello(){
        return "现在的时间是 "+this.helloService.foormatDate(new Date());
    }

}
