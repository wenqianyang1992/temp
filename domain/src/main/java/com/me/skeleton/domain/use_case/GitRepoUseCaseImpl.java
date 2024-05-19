package com.me.skeleton.domain.use_case;

import com.me.skeleton.domain.annotation.UseCase;
import com.me.skeleton.domain.driven_port.GitRepoPort;
import com.me.skeleton.domain.model.GitRepo;

import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
public class GitRepoUseCaseImpl implements GitRepoUseCase{
    private final GitRepoPort gitRepoPort;
    public GitRepo info(){
        return gitRepoPort.info();
    }
}
