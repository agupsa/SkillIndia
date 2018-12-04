package com.si.service;

import java.util.List;

import com.si.model.Establishment;

public interface SearchEstServiceInterface {

	List<Establishment> getEstByName(String establishmentName);

}