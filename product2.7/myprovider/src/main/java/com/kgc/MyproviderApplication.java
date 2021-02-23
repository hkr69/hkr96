package com.kgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Qin
 * @create 2021-02-07 15:38
 */
@SpringBootApplication
@EnableEurekaClient
public class MyproviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyproviderApplication.class,args);
    }
}
