package com.kgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Qin
 * @create 2021-02-07 15:11
 */
@SpringBootApplication
@EnableEurekaServer
public class MyeurekaApplication {
    //hkr 跟新
    public static void main(String[] args) {
        SpringApplication.run(MyeurekaApplication.class,args);
    }
}
