package com.gyx.demo.ch3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次：" + simpleDateFormat.format(new Date()));
    }

    @Scheduled(cron="0 * * ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间：" + simpleDateFormat.format(new Date()) + "执行");
    }

}
