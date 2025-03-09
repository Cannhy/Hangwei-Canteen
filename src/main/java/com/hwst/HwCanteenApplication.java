package com.hwst;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hwst.mapper")
@SpringBootApplication
public class HwCanteenApplication {

    public static void main(String[] args) {
        SpringApplication.run(HwCanteenApplication.class, args);
    }

}
