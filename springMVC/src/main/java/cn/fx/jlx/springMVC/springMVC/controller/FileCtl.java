package cn.fx.jlx.springMVC.springMVC.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileCtl {
	
	@PostMapping("/filectl")
	public String file(@RequestParam(value="file1") MultipartFile[] file ) throws  IOException{
		for (MultipartFile f : file) {
			String ff=f.getOriginalFilename();
			StringBuffer fff=new StringBuffer(UUID.randomUUID().toString());
			fff.append(ff.substring(ff.lastIndexOf(".")));
			File fi=new File("e:"+File.separator+"web1"+File.separator+fff);
		    f.transferTo(fi);
		}
		
		
		
		
		return "";
	}

}