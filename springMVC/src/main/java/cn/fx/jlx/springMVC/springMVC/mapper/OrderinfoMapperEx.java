package cn.fx.jlx.springMVC.springMVC.mapper;

import java.util.List;
import java.util.Map;

import cn.fx.jlx.springMVC.springMVC.pojo.Orderlist;

public interface OrderinfoMapperEx {
	
	List<Orderlist> creatInfolist(List<Integer> ctid);
	
	
	Double totalPrice(String ofid);
}
