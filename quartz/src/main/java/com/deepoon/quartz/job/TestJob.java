package com.deepoon.quartz.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Component
@DisallowConcurrentExecution
public class TestJob extends QuartzJobBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestJob.class);

    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        LOGGER.info("executing cron job: " + jobExecutionContext.getJobDetail().getKey().getName());
    }
}
