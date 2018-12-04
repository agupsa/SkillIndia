package com.si.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.si.dao.EstablishmentDaoInterface;
import com.si.model.Candidate;
import com.si.model.Establishment;

@Service
@Transactional
public class EstablishmentRegService {


	@Autowired
	EstablishmentDaoInterface esdao;
	

	@Transactional
	public void registerEstablishment(Establishment e,MultipartFile files) {
		System.out.println("in service");
		String fetchcPK = "select gr5_candidate_seq.nextval from dual";
		e.setEstRegNo(esdao.getSeq(fetchcPK));
		e.setFilePath(saveFiles(e, files));

		esdao.registerEstablishment(e);
	}
	
	public String saveFiles(Establishment e, MultipartFile file) {

		String paths;
				

			try {
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "Docs" + File.separator + e.getEstRegNo());
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server

				File serverFile = null;
			
					serverFile = new File(dir.getAbsolutePath() + File.separator + e.getName()+ ".pdf");
				
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				System.out.println("Server File Location=" + serverFile.getAbsolutePath());

				paths =serverFile.getAbsolutePath();

			} catch (Exception ex) {
				System.out.println("You failed to upload  => " + ex.getMessage());
				return null;
			}
			

		
		return paths; // TODO return paths
	}

}
