package com.sqlhero.small.quartz;

import com.sqlhero.small.service.ISysMessageService;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

/**
 * 定时获取详细报告
 *
 * @author ：sqlhero.
 * @date ：Created in 2020/6/12 17:04
 */
@Slf4j
@Component
public class BatchSendMessageQuartz extends QuartzJobBean {

    @Autowired
    private ISysMessageService sysMessageService;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("正在批量发送短信");
        log.info(sysMessageService.list().toString());
    }

}
