package cn.fx.jlx.springMVC.springMVC.exception;

public class SPasswordErroException extends Exception{
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("商家密码错误");
	}
}
