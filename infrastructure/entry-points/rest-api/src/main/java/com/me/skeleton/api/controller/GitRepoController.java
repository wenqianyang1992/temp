package com.me.skeleton.api.controller;

import com.me.skeleton.api.dto.GitRepoResponse;
import com.me.skeleton.api.mapper.GitRepoMapper;
import com.me.skeleton.domain.use_case.GitRepoUseCase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/git-repository")
@RequiredArgsConstructor
public class GitRepoController {
    private final GitRepoUseCase gitRepoUseCase;
    private final GitRepoMapper gitRepoMapper;
    
    @GetMapping
    public GitRepoResponse info(){
        return gitRepoMapper.map(gitRepoUseCase.info());
    }
}
