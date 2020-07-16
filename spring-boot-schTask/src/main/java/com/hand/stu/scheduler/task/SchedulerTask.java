package com.hand.stu.scheduler.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SchedulerTask {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime(){
        System.out.println(sdf.format(new Date()));
    }
}
