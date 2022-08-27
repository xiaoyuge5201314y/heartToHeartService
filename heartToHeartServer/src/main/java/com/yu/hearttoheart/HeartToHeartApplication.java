package com.yu.hearttoheart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.yu.hearttoheart.dao")
public class HeartToHeartApplication {
    public static void main(String[] args) {
        SpringApplication.run(HeartToHeartApplication.class, args);
    }
}
