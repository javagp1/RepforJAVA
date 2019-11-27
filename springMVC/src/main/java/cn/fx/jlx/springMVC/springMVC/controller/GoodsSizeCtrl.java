package cn.fx.jlx.springMVC.springMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.fx.jlx.springMVC.springMVC.service.GoodsSizeService;

@RestController
@RequestMapping("/goodssizectrl")
public class GoodsSizeCtrl {
	@Autowired
	private GoodsSizeService goodsSizeService;
	
	@RequestMapping("getallgoodssize")
	public Object getAllGoodsSize() {
		
		return goodsSizeService.getAllGoodsSize();
	}
}
