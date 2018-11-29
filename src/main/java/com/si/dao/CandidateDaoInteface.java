package com.si.dao;

import com.si.model.Candidate;

public interface CandidateDaoInteface {

	public int registerCandidate(Candidate cr);

	public int getSeq(String fetchcPK);

}
