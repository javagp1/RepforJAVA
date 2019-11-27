package cn.fx.jlx.springMVC.springMVC.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alipay.api.AlipayApiException;

import cn.fx.jlx.springMVC.springMVC.service.AliPayService;
import cn.fx.jlx.springMVC.springMVC.service.OrderInfoService;

@Controller
public class AliPayCtrl {
	
	@Autowired
	AliPayService aliPayService;
	
	@Autowired
	OrderInfoService orderInfoService;
	
	@RequestMapping("/ali/pay")
	public void ali(HttpServletResponse response,String ofid) throws IOException, AlipayApiException {
		aliPayService.ali(response, ofid);
	}
	
	@RequestMapping("/ali/paycomplate")
	public String payComplate(HttpServletRequest request){
		
		String ofid=request.getParameter("out_trade_no");
		
		orderInfoService.payComplate(ofid);
		
		return "/paied_ok.html";
		
	}

}
