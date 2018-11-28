package com.si.service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.si.model.Candidate;

public interface CandidateRegServiceInterface {


	void registerCandidate(Candidate c);

}