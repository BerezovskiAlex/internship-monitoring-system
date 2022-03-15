package com.inthergroup.ims.Candidates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class RegisterCandidateService {

    private RegisterCandidateRepository registerCandidateRepository;

    public RegisterCandidateService(){

    }
@Autowired
    public RegisterCandidateService(RegisterCandidateService registerCandidateService){
        this.registerCandidateRepository = registerCandidateService.registerCandidateRepository;
}


    }

