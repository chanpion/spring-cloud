package com.deepoon.midleware.sentinel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        helloService.hello();
        return "hello";
    }
}
