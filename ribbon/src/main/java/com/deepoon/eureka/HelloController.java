package com.deepoon.eureka;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.security.auth.callback.Callback;
import java.util.concurrent.Callable;

@RestController
public class HelloController {

    @Resource
    private HelloService helloService;


    @RequestMapping("/hi")
    public String hi(String name) {
        return helloService.hi(name);
    }


    public Callable<String> hi(){

        return null;
    };

}
