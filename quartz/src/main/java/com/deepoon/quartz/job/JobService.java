package com.deepoon.quartz.job;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Component
public class JobService {

    @Resource
    private Scheduler scheduler;


    @PostConstruct
    public void listJob() throws SchedulerException {
        for (String name : scheduler.getJobGroupNames()) {
            System.out.println(name);
        }
    }
}
