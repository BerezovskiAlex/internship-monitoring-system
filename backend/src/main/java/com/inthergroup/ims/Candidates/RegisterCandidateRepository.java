package com.inthergroup.ims.Candidates;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterCandidateRepository extends JpaRepository<Candidate,Long> {
}
