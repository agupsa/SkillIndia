package com.si.service;

/*import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.multipart.MultipartFile;

import com.si.dao.CandidateDaoInteface;
import com.si.model.Candidate;

@Service
@Transactional
public class CandidateRegService {
	
	@Autowired
	CandidateDaoInteface cdao;
	
	@Transactional
	public void registerCandidate(Candidate c) {
		System.out.println("in service");
		/*c.setPath(saveFiles(c));
		System.out.println("saved file and path");*/
		cdao.registerCandidate(c);
	}

	
	/*public String[] saveFiles(Candidate c) {
		MultipartFile[] docs = {c.getPic(),c.getAadhar(),c.getEducert()};
		
		if (docs.length != 3) { // return "Mandatory information missing";
			return null;
		}
		String[] paths = new String[3];
		int i=0;
		for (MultipartFile doc:docs) {
			
			try {
				byte[] bytes = doc.getBytes();

				// Creating the directory to store file
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "Docs" + File.separator + c.getUserId().toString());
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = null; 
				switch(i) {
				case 1:serverFile = new File(dir.getAbsolutePath()
						+ File.separator + c.getName().toLowerCase());
					break;
				case 2:serverFile = new File(dir.getAbsolutePath()
						+ File.separator + c.getAadharNo().toString());
					break;
				case 3:serverFile = new File(dir.getAbsolutePath()
						+ File.separator + c.getName().toLowerCase() + "Edu");
					break;
				}
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				System.out.println("Server File Location="
						+ serverFile.getAbsolutePath());
				
				paths[i++] = serverFile.getAbsolutePath();
			} catch (Exception e) {
				//return "You failed to upload " + name + " => " + e.getMessage();
				return null;
			}
		}

		return paths;
	}*/
}
