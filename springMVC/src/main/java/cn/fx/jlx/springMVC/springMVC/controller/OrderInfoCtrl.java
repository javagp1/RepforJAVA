package cn.fx.jlx.springMVC.springMVC.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.fx.jlx.springMVC.springMVC.pojo.Orderinfo;
import cn.fx.jlx.springMVC.springMVC.pojo.Orderlist;
import cn.fx.jlx.springMVC.springMVC.pojo.Stuser;
import cn.fx.jlx.springMVC.springMVC.pojo.User;
import cn.fx.jlx.springMVC.springMVC.service.OrderInfoService;

@RestController
@RequestMapping("/orderinfoctrl")
public class OrderInfoCtrl {   
	
	@Autowired
	private OrderInfoService orderInfoService;
	

	@RequestMapping("getsendgoods")
	public Object getsendgoods(String olid){
		return orderInfoService.modifystate(olid);
		
	}
	
	
	/**
	 * 商家生成订单
	 * @param session
	 * @return
	 */
	@RequestMapping("getorderInfoesbystuser")
	public Object getOrderInfoesBystuser(HttpSession session){
		Stuser stuser=(Stuser) session.getAttribute("stuser");
		return orderInfoService.getOrderInformationsByStuserID(stuser.getStuserid());
		
	}
	
	@RequestMapping("creatorder")
	public Object creatOrder(Orderinfo orderinfo,@RequestParam(value="ctid") List<Integer> ctid,HttpSession session){
		
		orderinfo.setUserid(((User)session.getAttribute("user")).getUserid());
		orderInfoService.creatOrder(orderinfo, ctid);
		
		return true;
		 
	}
	
	@RequestMapping("getorderinfoes")
	public Object getOrderInfoes(HttpSession session){
		User user=(User) session.getAttribute("user");
		
		return orderInfoService.getOrderInformationsByUserID(user.getUserid());
		
	}
}
