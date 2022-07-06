package com.example.demosatoken;

import cn.dev33.satoken.stp.StpUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;
import java.util.List;

@EnableScheduling
@SpringBootApplication
public class DemoSatokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSatokenApplication.class, args);
    }

    @Scheduled(fixedRate = 1000L * 3)
    public void updateTestUsers() {

        StpUtil.kickout(1);
        StpUtil.disable(1, -1);

        System.out.println(1);
    }
}
