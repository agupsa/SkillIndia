package com.si.service;

import org.springframework.web.multipart.MultipartFile;

import com.si.model.Establishment;

public interface EstablishmentRegServiceInterface {
	public void registerEstablishment(Establishment e,MultipartFile files);
	public String saveFiles(Establishment e, MultipartFile file);

}