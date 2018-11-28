package com.si.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/*import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartFile;

import com.si.dao.CandidateDaoInteface;
import com.si.model.Candidate;

@Service
@Transactional
public class CandidateRegService implements CandidateRegServiceInterface {
	
	@Autowired
	CandidateDaoInteface cdao;
	

	@Override
	@Transactional
	public void registerCandidate(Candidate c) {
		/*System.out.println("in service");
		c.setPhoto(saveFiles(c,photo,1));
		if(c.getPhoto()==null) {
			//TODO Exception handling here
		}
		System.out.println("saved file and path: "+c.getPhoto());*/
		cdao.registerCandidate(c);
	}

	
	public String saveFiles(Candidate c,MultipartFile file, int i) {
		
		
			try {
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "Docs" + File.separator + c.getCanRegNo());
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
			
				File serverFile = null; 
				switch(i) {
				case 1:serverFile = new File(dir.getAbsolutePath()
						+ File.separator + c.getName().toLowerCase()+".jpg");
					break;
				case 2:serverFile = new File(dir.getAbsolutePath()
						+ File.separator + c.getAadharNo()+".pdf");
					break;
				case 3:serverFile = new File(dir.getAbsolutePath()
						+ File.separator + c.getName().toLowerCase() +c.getQualification().toLowerCase() + "Certificate.pdf");
					break;
				}
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				System.out.println("Server File Location="
						+ serverFile.getAbsolutePath());
				
				String path = serverFile.getAbsolutePath();
				return path;
			} catch (Exception e) {
				//return "You failed to upload " + name + " => " + e.getMessage();
				return null;
			}

		
	}
}
