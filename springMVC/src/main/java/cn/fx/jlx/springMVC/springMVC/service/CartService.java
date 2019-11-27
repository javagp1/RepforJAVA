package cn.fx.jlx.springMVC.springMVC.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.fx.jlx.springMVC.springMVC.mapper.CartMapper;
import cn.fx.jlx.springMVC.springMVC.mapper.CartMapperEx;
import cn.fx.jlx.springMVC.springMVC.pojo.Cart;
import cn.fx.jlx.springMVC.springMVC.pojo.CartExample;

@Service
public class CartService {
	@Autowired
	private CartMapper cartMapper;
	
	@Autowired
	private CartMapperEx cartMapperEx;
	
	@Transactional
	public void  addToCart(Cart cart){
		CartExample example=new CartExample();
		example.createCriteria().andGdidEqualTo(cart.getGdid()).andGsidEqualTo(cart.getGsid()).andUseridEqualTo(cart.getUserid());
		
		List<Cart> cartItems= cartMapper.selectByExample(example);
		if(cartItems!=null&&cartItems.size()==1){
		
			Cart ct=cartItems.get(0);
			ct.setGdcount(ct.getGdcount()+cart.getGdcount());
			cartMapper.updateByPrimaryKey(ct);
			
		}else{
			cartMapper.insert(cart);
		}
		
	}
	
	@Transactional
	public void changeCountForCart(Cart cart){
		
		if(cart.getGdcount()<=0){
			cartMapper.deleteByPrimaryKey(cart.getCtid());
		}else{
			cartMapper.updateByPrimaryKeySelective(cart);
			
		}
		
		
	}
	
	public List<Map> getCartListByUserID(Integer userid){
		return cartMapperEx.getCartListByUserID(userid);
	}
}
