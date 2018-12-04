package com.si.service;


import org.springframework.web.multipart.MultipartFile;

import com.si.model.Candidate;

public interface CandidateRegServiceInterface {
	public void registerCandidate(Candidate c, MultipartFile... files);
	public String[] saveFiles(Candidate c, MultipartFile[] files);

}