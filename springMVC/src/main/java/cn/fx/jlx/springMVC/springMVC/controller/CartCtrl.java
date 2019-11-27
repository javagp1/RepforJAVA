package cn.fx.jlx.springMVC.springMVC.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.fx.jlx.springMVC.springMVC.pojo.Cart;
import cn.fx.jlx.springMVC.springMVC.pojo.User;
import cn.fx.jlx.springMVC.springMVC.service.CartService;

@RestController
@RequestMapping("/cartctrl")
public class CartCtrl {
	
	@Autowired
	private CartService cartService;
	
	@RequestMapping("addtocart")
	public Object addToCart(Cart cart,HttpSession session){
		
		User user=(User) session.getAttribute("user");
		
		cart.setUserid(user.getUserid());
		
		cartService.addToCart(cart);
		
		return true;
	}
	
	@RequestMapping("getcartlist")
	public Object getCartList(HttpSession session){
		
		User user=(User) session.getAttribute("user");
		
		return cartService.getCartListByUserID(user.getUserid());
		
		
	}
	@RequestMapping("changecountforcart")
	public Object changeCountForCart(Cart cart){
		
		 cartService.changeCountForCart(cart);
		 return true;
		
	}
}
