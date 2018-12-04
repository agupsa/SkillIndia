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
	//This Method sets file path in candidate object and calls dao to save data in table
	public void registerCandidate(Candidate c, MultipartFile... files) {
		String fetchcPK = "select gr5_candidate_seq.nextval from dual";
		c.setCanRegNo(cdao.getSeq(fetchcPK));	//Fetching Primary key for folder name where to save data
		c.setFilePath(saveFiles(c, files));		//calls other method to save files on server and sets file paths in candidate object

		cdao.registerCandidate(c);
	}

	//This method saves file on Server and and returns file path as string array
	@Override
	public String[] saveFiles(Candidate c, MultipartFile[] files) {
		int i = 0;
		String[] paths = new String[files.length];
		for (MultipartFile file : files) {
			

			try {
				byte[] bytes = file.getBytes();

				// Creating the directory with candidate reg no to store that candidates files
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "Docs" + File.separator + c.getCanRegNo());
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server

				File serverFile = null;
				//Sets File name 
				switch (i) {
				case 0:
					serverFile = new File(dir.getAbsolutePath() + File.separator + c.getName().toLowerCase() + ".jpg");
					break;
				case 1:
					serverFile = new File(dir.getAbsolutePath() + File.separator + c.getAadharNo() + ".pdf");
					break;
				case 2:
					serverFile = new File(dir.getAbsolutePath() + File.separator + c.getQualification().toLowerCase() + ".pdf");
					break;
				}
				//writes Byte on server Side to save file
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();


				paths[i] =serverFile.getAbsolutePath();

			} catch (Exception e) {
				return null;
			}
			finally {
					++i;
			}

		}
		return paths; 
	}
}
