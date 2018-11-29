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
	public void registerCandidate(Candidate c, MultipartFile... files) {
		System.out.println("in service");
		String fetchcPK = "select gr5_candidate_seq.nextval from dual";
		c.setCanRegNo(cdao.getSeq(fetchcPK));
		c.setFilePath(saveFiles(c, files));

		cdao.registerCandidate(c);
	}

	public String[] saveFiles(Candidate c, MultipartFile[] files) {
		int i = 0;
		String[] paths = new String[3];
		for (MultipartFile file : files) {
			

			try {
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "Docs" + File.separator + c.getCanRegNo());
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server

				File serverFile = null;
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
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				System.out.println("Server File Location=" + serverFile.getAbsolutePath());

				paths[i] =serverFile.getAbsolutePath();

			} catch (Exception e) {
				System.out.println("You failed to upload  => " + e.getMessage());
				return null;
			}
			finally {
					++i;
			}

		}
		return paths; // TODO return paths
	}
}
