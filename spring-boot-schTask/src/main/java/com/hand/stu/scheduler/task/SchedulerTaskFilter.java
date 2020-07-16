package com.hand.stu.scheduler.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTaskFilter {

    private static int count = 0;

    @Scheduled(cron = "* * * * * ?")
    public void process(){
        System.out.println("当前执行任务：task"+(count++));
    }

}
