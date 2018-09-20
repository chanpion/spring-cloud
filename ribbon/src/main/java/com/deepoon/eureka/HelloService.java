package com.deepoon.eureka;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class HelloService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")})
    public String hi(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }

    public String error(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
