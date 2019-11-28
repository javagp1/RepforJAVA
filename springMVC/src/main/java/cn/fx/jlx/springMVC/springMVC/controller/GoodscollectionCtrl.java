package cn.fx.jlx.springMVC.springMVC.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.fx.jlx.springMVC.springMVC.pojo.GoodscollectionKey;
import cn.fx.jlx.springMVC.springMVC.pojo.User;
import cn.fx.jlx.springMVC.springMVC.service.GoodsCollectionService;

@RestController
@RequestMapping("/goodscollctionctrl")
public class GoodscollectionCtrl {
	@Autowired
	private GoodsCollectionService goodsCollectionService;
	@RequestMapping("addcollection")
	public Object addCollection(GoodscollectionKey goodscollection,HttpSession session){
		goodscollection.setUserid(((User)session.getAttribute("user")).getUserid());
		
		goodsCollectionService.addcollection(goodscollection);
		
		return true;
		
	}
	@RequestMapping("deletecollection")
	public Object deleteCollection(GoodscollectionKey goodscollection,HttpSession session){
		goodscollection.setUserid(((User)session.getAttribute("user")).getUserid());
		goodsCollectionService.deleteCollection(goodscollection);
		
		return true;
	}
	
	@RequestMapping("getallcollection")
	public Object getAllCollection(HttpSession session){
		
		return	goodsCollectionService.selectCollection(((User)session.getAttribute("user")).getUserid());
		
	}
	@RequestMapping("countcollection")
	public Object countCollection(Integer gdid){
		
		return goodsCollectionService.countCollection(gdid);
	}
}
