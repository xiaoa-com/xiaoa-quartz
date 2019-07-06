package com.xiaoa.quartz;

/**
 * @author wanmeng;
 * @description 测试类
 * @date 2019-07-06
 */
public class QuartzStart {
    public static void main(String[] args) {
        //简单任务调度，每隔多少时间执行一次，执行n次
        SchedulerUtil.handleSimpleTrigger("44033", "3333", "44033", "3333", MyJob.class, 1, 8);
        //复杂调度，每天的什么时候执行任务
//        SchedulerUtil.hadleCronTrigger("44033", "3333", "44033", "3333", MyJob.class, "0 19 19 * * ? *");
    }
}
