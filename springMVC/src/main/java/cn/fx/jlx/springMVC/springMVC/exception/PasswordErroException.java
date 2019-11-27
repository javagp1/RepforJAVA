package cn.fx.jlx.springMVC.springMVC.exception;

public class PasswordErroException extends Exception{
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("密码错误");
	}
}
