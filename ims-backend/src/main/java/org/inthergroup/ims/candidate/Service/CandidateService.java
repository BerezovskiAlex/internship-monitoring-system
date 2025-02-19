package org.inthergroup.ims.candidate.Service;

import org.inthergroup.ims.candidate.model.Candidate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CandidateService {

    List<Candidate> get();

    void save(Candidate candidate);


    Candidate getCandidate(Long id);
}

