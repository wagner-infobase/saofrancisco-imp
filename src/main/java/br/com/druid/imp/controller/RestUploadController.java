package br.com.druid.imp.controller;


import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.druid.imp.domain.FileImport;
import br.com.druid.imp.domain.UploadModel;
import br.com.druid.imp.repository.FileImportRepository;
import br.com.druid.imp.service.OracleCloudService;
import br.com.druid.util.GeneratorLinkOracleCloud;


@RestController
public class RestUploadController {

    private final Logger logger = LoggerFactory.getLogger(RestUploadController.class);

    @Autowired
    private FileImportRepository fileImportRepository;
    
    
    // Multiple file upload
    @RequestMapping(value="/fileConfHistoryRepository/search/upload", method=RequestMethod.POST)
    public ResponseEntity<?> uploadBaseANS(@RequestParam("files") MultipartFile[] uploadfiles) {

        logger.debug("Multiple file upload!");
        //System.out.println("Multiple file upload!");
        
        String uploadedFileName = Arrays.stream(uploadfiles).map(x -> x.getOriginalFilename())
                .filter(x -> !StringUtils.isEmpty(x)).collect(Collectors.joining(" , "));

        if (StringUtils.isEmpty(uploadedFileName)) {
            return new ResponseEntity("please select a file!", HttpStatus.OK);
        }

        try {

        	 String convertToXml = convertToXml(Arrays.asList(uploadfiles));
        	
        	 OracleCloudService oraService = new OracleCloudService(convertToXml);
             oraService.gravar();
             
             String returnLink = GeneratorLinkOracleCloud.returnLink(uploadedFileName);           
             
             System.out.println(">>>>>>>>>>>"+returnLink);
             
             saveFileImport(returnLink, uploadedFileName);

        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity("Successfully uploaded - "
                + uploadedFileName, HttpStatus.OK);

    }
    
    private void saveFileImport(String returnLink, String uploadedFileName)  {
    	
    	try {
        	FileImport fileImport = new FileImport();
            fileImport.setLink(returnLink);
            fileImport.setName(uploadedFileName);
            fileImport.setIncludeDate(new Date());
            
            fileImportRepository.save(fileImport);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }

    // maps html form to a Model
    @PostMapping("/api/upload/multi/model")
    public ResponseEntity<?> multiUploadFileModel(@ModelAttribute UploadModel model) {

        //logger.debug("Multiple file upload! With UploadModel");
        System.out.println("Multiple file upload! With UploadModel");
        
        try {

            saveUploadedFiles(Arrays.asList(model.getFiles()));

        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity("Successfully uploaded!", HttpStatus.OK);

    }

    //save file
    private void saveUploadedFiles(List<MultipartFile> files) throws IOException {

        for (MultipartFile file : files) {

            if (file.isEmpty()) {
                continue; //next pls
            }

            byte[] bytes = file.getBytes();
            //Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            //Files.write(path, bytes);
            
            String xmlRecebido = new String(bytes);
            
            //salva no oracle cloud
            OracleCloudService oraService = new OracleCloudService(xmlRecebido);
            oraService.gravar();
        }
    }
    
    
    //save file
    private String convertToXml(List<MultipartFile> files) throws IOException {
    	byte[] bytes=null;
        for (MultipartFile file : files) {

            if (file.isEmpty()) {
                continue; //next pls
            }

            bytes = file.getBytes();

        }
        
        return new String(bytes);
    }
    
}
