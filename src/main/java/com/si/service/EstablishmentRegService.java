package com.si.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.si.dao.EstablishmentDaoInterface;
import com.si.model.Establishment;

@Service
@Transactional
public class EstablishmentRegService implements EstablishmentRegServiceInterface {


	@Autowired
	EstablishmentDaoInterface esdao;
	

	@Override
	public void registerEstablishment(Establishment e,MultipartFile files) {
		String fetchcPK = "select gr5_candidate_seq.nextval from dual";
		e.setEstRegNo(esdao.getSeq(fetchcPK));
		e.setFilePath(saveFiles(e, files));

		esdao.registerEstablishment(e);
	}
	
	@Override
	public String saveFiles(Establishment e, MultipartFile file) {

		String paths;
				

			try {
				byte[] bytes = file.getBytes();

				// Creating the directory with establishment reg no to store file
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

				paths =serverFile.getAbsolutePath();

			} catch (Exception ex) {
				return null;
			}
			

		
		return paths;
	}

}
