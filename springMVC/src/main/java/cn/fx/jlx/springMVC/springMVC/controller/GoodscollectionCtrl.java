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
		
		return goodsCollectionService.addcollection(goodscollection);
		
		
		
	}
	@RequestMapping("deletecollection")
	public Object deleteCollection(GoodscollectionKey goodscollection,HttpSession session){
		goodscollection.setUserid(((User)session.getAttribute("user")).getUserid());
		return goodsCollectionService.deleteCollection(goodscollection);
		
		
	}
	
	@RequestMapping("getallcollection")
	public Object getAllCollection(HttpSession session){
		
		return	goodsCollectionService.selectCollection(((User)session.getAttribute("user")).getUserid());
		
	}
	@RequestMapping("countcollection")
	public Object countCollection(Integer gdid){
		
		return goodsCollectionService.countCollection(gdid);
	}
	@RequestMapping("getusercollection")
	public Object getUserCollection(HttpSession session){
		Integer userid = ((User)session.getAttribute("user")).getUserid();
		return goodsCollectionService.getUserCollection(userid);
	}
}
