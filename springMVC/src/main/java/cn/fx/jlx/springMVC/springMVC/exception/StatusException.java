package cn.fx.jlx.springMVC.springMVC.exception;

public class StatusException extends Exception{
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		System.out.println("该账户已被限制");
	}
}
