package cn.fx.jlx.springMVC.springMVC.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.fx.jlx.springMVC.springMVC.exception.LognameNotExistException;
import cn.fx.jlx.springMVC.springMVC.exception.PasswordErroException;
import cn.fx.jlx.springMVC.springMVC.exception.SLognameNotExistException;
import cn.fx.jlx.springMVC.springMVC.exception.SPasswordErroException;
import cn.fx.jlx.springMVC.springMVC.exception.SStatusException;
import cn.fx.jlx.springMVC.springMVC.exception.StatusException;
import cn.fx.jlx.springMVC.springMVC.pojo.Stuser;
import cn.fx.jlx.springMVC.springMVC.pojo.User;
import cn.fx.jlx.springMVC.springMVC.service.UserService;

@RestController
@RequestMapping("/userctrl")
public class UserCtrl {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("doregister")
	public Object doregister(User user){
		
		return userService.register(user);
		
	}
	
	@RequestMapping("lognameisok")
	public Object lognameIsOK(String logname) {
		
		return !userService.userNameAlreadyUsed(logname);
	}
	@RequestMapping("validisok")
	public Object validIsOK(String keycode,HttpSession session) {
		
		String keycode_app=(String) session.getAttribute("vrifyCode");
		
		
		return keycode.equals(keycode_app); 
		
	}
	
	@RequestMapping("login")
	public Object login(String logname,String password,HttpSession session){
		
		try {
			User user = userService.login(logname, password);
			session.setAttribute("user", user);
			return 1;
		} catch (LognameNotExistException e) {
			
			return 2;
		} catch (PasswordErroException e) {
			
			return 3;
		} catch (StatusException e) {
			
			return 4;
		}
	}
	
	

	/**
	 * 商家登录
	 * @param slogname
	 * @param spassword
	 * @param session
	 * @return
	 */
	@RequestMapping("slogin")
	public Object slogin(String slogname,String spassword,HttpSession session){
		
		try {
			Stuser stuser=userService.slogin(slogname, spassword);
			session.setAttribute("stuser", stuser);
			return 1;
		} catch (SLognameNotExistException e) {
			return 2;
		} catch (SPasswordErroException e) {
			return 3;
		} catch (SStatusException e) {
			return 4;
		}
		
	}
	
	
	
	
	
	@RequestMapping("logout")
	public Object logout(HttpSession session){
		if(session.getAttribute("user")!=null){
			
			session.removeAttribute("user");
		}
		
		
		return true;
	}
	
	
	
	@RequestMapping("stlogout")
	public Object stlogout(HttpSession session){
		if(session.getAttribute("stuser")!=null){
			
			session.removeAttribute("stuser");
		}
		
		
		return true;
	}
	
	@RequestMapping("useronline")
	public Object isUserOnline(HttpSession session){
		
		return session.getAttribute("user");
		
	}
	@RequestMapping("stuseronline")
	public Object stisUserOnline(HttpSession session){
		
		return session.getAttribute("stuser");
		
	}

}
