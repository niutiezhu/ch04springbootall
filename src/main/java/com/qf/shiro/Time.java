package com.qf.shiro;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component

public class Time {
    @Scheduled(cron = "0/2 * * * * * ")
    public void time(){
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd ; HH-mm:ss");
        System.out.println(f.format(date));
    }
}
