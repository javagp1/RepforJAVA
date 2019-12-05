package cn.fx.jlx.springMVC.springMVC.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileControler {

	@PostMapping("/filecontrollerupload")
	public Object upload(@RequestParam(value="file") MultipartFile file ) throws IOException {
			
		
			String old_fileName=file.getOriginalFilename();				
		    //创建放置在服务器本地的文件
		   File localFile = new File("d:"+File.separator+"sysfiles190806"+File.separator+"uploadfiles"+File.separator+old_fileName);
		   //把传上来的文件写到本地文件
	        file.transferTo(localFile);
		
	    
	    return true;
	}
	
	
}
