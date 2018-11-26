package com.si.service;

import org.springframework.transaction.annotation.Transactional;

import com.si.model.Candidate;

public interface CandidateRegServiceInterface {

	void registerCandidate(Candidate c);

}