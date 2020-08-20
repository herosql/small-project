package com.sqlhero.small.quartz;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 定时任务配置
 *
 * @author ：sqlhero.
 * @date ：Created in 2020/7/28 15:11
 */
@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail testQuartz() {
        return JobBuilder.newJob(BatchSendMessageQuartz.class)
                .withIdentity("BatchSendMessageQuartz").storeDurably().build();
    }


    @Bean
    public Trigger testQuartzTrigger2() {
        //cron方式，从早上8点到晚上6点，每5秒触发一次
        return TriggerBuilder.newTrigger().forJob(testQuartz())
                .withIdentity("BatchSendMessageQuartz")
                .withSchedule(CronScheduleBuilder.cronSchedule("0/5 * 8-20 * * ?"))
                .build();
    }


}
