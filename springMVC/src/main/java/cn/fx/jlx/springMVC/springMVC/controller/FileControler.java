package cn.fx.jlx.springMVC.springMVC.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileControler {

	@PostMapping("/filecontrollerupload")
	public Object upload(@RequestParam(value="file1") MultipartFile[] file1 ) throws IOException {
			
		for (MultipartFile f : file1) {
			String old_fileName=f.getOriginalFilename();				
		    //创建放置在服务器本地的文件
		   File localFile = new File("d:"+File.separator+"sysfiles190806"+File.separator+"uploadfiles"+File.separator+file1);
		   //把传上来的文件写到本地文件
	        f.transferTo(localFile);
		}
	    
	    return true;
	}
	
	
}
