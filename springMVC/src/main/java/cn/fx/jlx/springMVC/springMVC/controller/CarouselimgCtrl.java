package cn.fx.jlx.springMVC.springMVC.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import cn.fx.jlx.springMVC.springMVC.pojo.Carouselimg;
import cn.fx.jlx.springMVC.springMVC.service.CarouselimgService;

@RestController
@RequestMapping("/carouselimgctrl")
public class CarouselimgCtrl {

	@Autowired
	private CarouselimgService carouselimgService;
	
	@RequestMapping("getallcarouseimg")
	public Object getAllCarouseImg(){
		return carouselimgService.getallCarouseImg();
	}
	
	@RequestMapping("addcarouseimg")
	public Object addCarouseImg(Carouselimg carouselimg){
		return carouselimgService.addCarouseImg(carouselimg);
	}
	
	@RequestMapping("deletecarouseimg")
	public Object deleteCarouseImg(Integer cimgid){
		return carouselimgService.deleteCarouseImg(cimgid);
	}
	
	@RequestMapping("getcarouseimg")
	public Object getCarouseImg(){
		return carouselimgService.getCarouseImg();
	}
	@RequestMapping("uploadimg")
	public Object uploadCarouseimg(@RequestParam(value="file") MultipartFile file ) throws  IOException{
		
		
		
		
		return carouselimgService.uploadcimg(file);
	}
}
