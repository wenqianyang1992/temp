package com.me.skeleton.feign.client;

import com.me.skeleton.feign.dto.GitHubRepoResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="git-hub", url="${rest.clients.git-hub.url}")
public interface GitHubClient {
    
    @GetMapping(name="info", value = "${rest.clients.git-hub.services.info}")
    GitHubRepoResponse info();
}
