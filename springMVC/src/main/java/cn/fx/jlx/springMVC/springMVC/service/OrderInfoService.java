package cn.fx.jlx.springMVC.springMVC.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.fx.jlx.springMVC.springMVC.mapper.CartMapper;
import cn.fx.jlx.springMVC.springMVC.mapper.OrderinfoMapper;
import cn.fx.jlx.springMVC.springMVC.mapper.OrderinfoMapperEx;
import cn.fx.jlx.springMVC.springMVC.mapper.OrderlistMapper;
import cn.fx.jlx.springMVC.springMVC.pojo.CartExample;
import cn.fx.jlx.springMVC.springMVC.pojo.Orderinfo;
import cn.fx.jlx.springMVC.springMVC.pojo.OrderinfoExample;
import cn.fx.jlx.springMVC.springMVC.pojo.Orderlist;
import cn.fx.jlx.springMVC.springMVC.pojo.OrderlistExample;

@Service
public class OrderInfoService {
	
	@Autowired
	OrderinfoMapper orderinfoMapper;
	
	@Autowired
	OrderinfoMapperEx orderinfoMapperEx;
	
	@Autowired
	OrderlistMapper orderlistMapper;
	
	@Autowired
	CartMapper cartMapper;
	
	/**
	 * 根据编号 更新订单信息状态 为  “已付款” ，并删除购物车中对应的商品信息项
	 * @param orderInfoID 指定的订单编号
	 */
	@Transactional
	public void paiedDone(String orderInfoID){
		Orderinfo order=orderinfoMapper.selectByPrimaryKey(orderInfoID);	
		order.setOfstate(2);
		orderinfoMapper.updateByPrimaryKeySelective(order);		
		OrderlistExample example=new OrderlistExample();
		example.createCriteria().andOfidEqualTo(orderInfoID);
		List<Orderlist> ol_list= orderlistMapper.selectByExample(example);				
		for (Orderlist ol : ol_list) {
			CartExample cart_example=new CartExample();
			cart_example.createCriteria().andUseridEqualTo(order.getUserid()).andGdidEqualTo(ol.getGdid()).andGsidEqualTo(ol.getGsid());
			cartMapper.deleteByExample(cart_example);					
		}					
	}
	
	
	
	/**
	 * 获取所有商家订单
	 * @param stuserid
	 * @return
	 */
	
	public List<Orderlist> getOrderInformationsByStuserID(Integer stuserid){
		
		OrderlistExample example=new OrderlistExample();
		example.createCriteria().andGdidEqualTo(stuserid);
		return orderlistMapper.selectByExample(example);
	}
	
	
	
	
	@Transactional
	public void payComplate(String ofid){
		
		OrderlistExample example = new OrderlistExample();
		example.createCriteria().andOfidEqualTo(ofid);
		List<Orderlist> list = orderlistMapper.selectByExample(example );
		
		for (Orderlist orderlist : list) {
			orderlist.setOlstatus(2);
			orderlistMapper.updateByPrimaryKeySelective(orderlist);
		}
		Orderinfo orderinfo = orderinfoMapper.selectByPrimaryKey(ofid);
		orderinfo.setOfstate(2);
		
		
	}
	
	public List<Orderinfo> getOrderInformationsByUserID(Integer userid){
		
		OrderinfoExample example=new OrderinfoExample();
		example.createCriteria().andUseridEqualTo(userid);
		
		example.setOrderByClause("ofdate desc");
		
		return orderinfoMapper.selectByExample(example);
	}
	
	@Transactional
	public void creatOrder(Orderinfo orderinfo,List<Integer> ctid){
		
	String ofid = UUID.randomUUID().toString();
	orderinfo.setOfid(ofid);
	
	orderinfo.setOfdate(new Date());
	orderinfo.setOfstate(1);
	

	orderinfoMapper.insert(orderinfo);
	OrderlistExample example = new OrderlistExample();
	example.createCriteria().andOfidEqualTo(ofid);
	
	List<Orderlist> list = orderinfoMapperEx.creatInfolist(ctid);
	for (int i = 0; i < list.size(); i++) {
		list.get(i).setOfid(ofid);
		list.get(i).setOlid(ofid+"_"+(i+1));
		list.get(i).setOlstatus(1);
		orderlistMapper.insert(list.get(i));
		
		
	}
	
	for (Integer id : ctid) {
		
		cartMapper.deleteByPrimaryKey(id);
		
	}
	
	
		
	}
}
