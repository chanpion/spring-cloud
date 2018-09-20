package com.deepoon.eureka;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class HiController {
    @Resource
    private SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
