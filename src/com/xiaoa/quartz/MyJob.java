package com.xiaoa.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanmeng
 * @description 自定义任务类
 * @date 2019-07-04
 */
public class MyJob implements Job {

    private static Logger log = LoggerFactory.getLogger(MyJob.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//        log.info("启动任务了！");
        System.out.println("任务启动了！");
    }
}
