package com.me.skeleton.feign.dto;

import lombok.Data;

@Data
public class GitHubRepoResponse {
    private String name;
    private String fullName;
    private GitHubRepoOwnerReponse owner;
}
