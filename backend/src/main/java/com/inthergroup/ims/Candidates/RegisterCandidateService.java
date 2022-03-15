package com.inthergroup.ims.Candidates;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class RegisterCandidatesService {

   // private static  final Map<Integer,RegisterCandidates>CANDIDATE_MAP = new HashMap<>();

    private RegisterCandidatesRepository registerCandidatesRepository;

    public RegisterCandidatesService(){

    }
@Autowired
    public RegisterCandidatesService(RegisterCandidatesService registerCandidatesService){
        this.registerCandidatesRepository = registerCandidatesService.registerCandidatesRepository;
}


    }

