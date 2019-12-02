package cn.fx.jlx.springMVC.springMVC.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.fx.jlx.springMVC.springMVC.mapper.CartMapper;
import cn.fx.jlx.springMVC.springMVC.mapper.OrderinfoMapper;
import cn.fx.jlx.springMVC.springMVC.mapper.OrderinfoMapperEx;
import cn.fx.jlx.springMVC.springMVC.mapper.OrderlistMapper;
import cn.fx.jlx.springMVC.springMVC.mapper.OrderlistMapperEx;
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
	OrderlistMapperEx orderlistMapperEx;
	
	@Autowired
	CartMapper cartMapper;
	

	/**商家修改订单状态
	 * 根据编号 更新订单信息状态 为  “完成” 
	 * @param orderInfoID 指定的订单编号
	 */
	@Transactional
	public boolean modifystate(String olid){
		Orderlist order=orderlistMapper.selectByPrimaryKey(olid);	
		order.setOlstatus(6);
		return orderlistMapper.updateByPrimaryKeySelective(order)==1;		
				
	}

	/**

	 * 获取商家登录的订单
	 * @param stid
	 * @return
	 */
	public List<Orderlist> getOrderInformationsByStuserID(Integer stuserid){	
		OrderlistExample example=new OrderlistExample();
		example.createCriteria().andGdidEqualTo(stuserid).andOlstatusEqualTo(2);
		return orderlistMapperEx.getallstorderlist(stuserid);
	}
	

	
	@Transactional
	public void payComplate(String ofid){
		
		OrderlistExample example = new OrderlistExample();
		example.createCriteria().andOfidEqualTo(ofid);
		List<Orderlist> list = orderlistMapper.selectByExample(example );
		
		for (Orderlist orderlist : list) {
			orderlist.setOlstatus(4);
			orderlistMapper.updateByPrimaryKeySelective(orderlist);
		}
		Orderinfo orderinfo = orderinfoMapper.selectByPrimaryKey(ofid);
		orderinfo.setOfstate(2);
		orderinfoMapper.updateByPrimaryKeySelective(orderinfo);
		
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
