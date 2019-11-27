package cn.fx.jlx.springMVC.springMVC.exception;

public class LognameNotExistException extends Exception{
	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("用户不存在");
	}
	
}
