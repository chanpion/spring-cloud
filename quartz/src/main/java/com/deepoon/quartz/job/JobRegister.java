package com.deepoon.quartz.job;

import org.quartz.*;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class JobRegister {

    @Resource
    private SchedulerFactoryBean schedulerFactoryBean;

//    public void scheduleJobs() throws SchedulerException {
//        Scheduler scheduler = schedulerFactoryBean.getScheduler();
//
//        JobDataMap jobDataMap = new JobDataMap();
//        jobDataMap.put("jobArg", "world");
//        JobDetail jobDetail = JobBuilder.newJob(TestJob.class)
//                .setJobData(jobDataMap)
//                .withDescription("demo")
//                .withIdentity("demo-job", "demo-group")
//                .build();
//
//        Trigger trigger = TriggerBuilder.newTrigger()
//                .forJob(jobDetail)
//                .withSchedule(cronSchedule("0/5 * * * * ?"))
//                .build();
//        if (!scheduler.checkExists(JobKey.jobKey("demo-job", "demo-group"))) {
//            scheduler.scheduleJob(jobDetail, trigger);
//        }
//        scheduler.start();
//    }
}
