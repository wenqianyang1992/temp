package com.me.skeleton.feign.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = {"com.me.skeleton.feign.client"})
public class FeignClientConfig {
}
