package com.si.dao;

import java.util.List;

import com.si.model.Contract;

public interface AdminContrFetchDaoInterface {

	// Returns Lists of Contracts that have been finalized by both candidate and Establishment for final approval by admin
	List<Contract> getUnverifiedContr();

}