package com.me.skeleton.feign.adapter;

import com.me.skeleton.domain.driven_port.GitRepoPort;
import com.me.skeleton.domain.model.GitRepo;
import com.me.skeleton.feign.client.GitHubClient;
import com.me.skeleton.feign.mapper.GitHubRepoMapper;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class GitRepoAdapter implements GitRepoPort {
    
    private final GitHubClient gitHubClient;
    private final GitHubRepoMapper gitHubRepoMapper;
    @Override
    public GitRepo info() {
        return gitHubRepoMapper.map(gitHubClient.info());
    }
}
