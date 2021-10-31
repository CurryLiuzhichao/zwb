package com.zwb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zwb.mapper")
public class ZwbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZwbApplication.class, args);
    }

}
