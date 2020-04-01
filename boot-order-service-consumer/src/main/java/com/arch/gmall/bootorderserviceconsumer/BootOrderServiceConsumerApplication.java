package com.arch.gmall.bootorderserviceconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

@EnableHystrix
@SpringBootApplication
@ComponentScan(basePackages = {"com.arch.gmall"})
public class BootOrderServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootOrderServiceConsumerApplication.class, args);
    }

}
