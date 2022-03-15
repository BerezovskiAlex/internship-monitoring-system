package com.inthergroup.ims.Candidates;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RegisterCandidatesController {

    RegisterCandidatesController(RegisterCandidatesRepository repository) {
    }
    @GetMapping("/register-candidate")
    public String getRegisterCandidate(){
        return "candidate is registered";
    }
}
