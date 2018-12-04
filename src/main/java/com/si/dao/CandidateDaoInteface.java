package com.si.dao;

import com.si.model.Candidate;

public interface CandidateDaoInteface {

	//registration of candidate
	public int registerCandidate(Candidate cr);

	//sequence for candidate registration number(primary key)
	public int getSeq(String fetchcPK);

}
