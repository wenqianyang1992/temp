package com.me.skeleton.application;

import com.me.skeleton.feign.config.FeignClientConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication(scanBasePackages = {"com.me.skeleton.*"})
@Import(FeignClientConfig.class)
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
