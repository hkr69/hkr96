package com.kgc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Qin
 * @create 2021-02-07 16:52
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MyConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyConsumerApplication.class,args);
    }
}
