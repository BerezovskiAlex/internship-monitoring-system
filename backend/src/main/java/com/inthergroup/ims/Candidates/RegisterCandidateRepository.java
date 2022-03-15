package com.inthergroup.ims.Candidates;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterCandidatesRepository extends JpaRepository<RegisterCandidates,Long> {
    //RegisterCandidates findByName
}
