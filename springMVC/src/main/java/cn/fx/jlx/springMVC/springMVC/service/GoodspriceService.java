package cn.fx.jlx.springMVC.springMVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.fx.jlx.springMVC.springMVC.mapper.GoodspriceMapper;
import cn.fx.jlx.springMVC.springMVC.pojo.Goodsprice;

@Service
public class GoodspriceService {
	
	@Autowired
	private GoodspriceMapper goodspriceMapper;
	
	@Transactional
	public boolean addGoodsPrice(Goodsprice goodsPrice){
		
		return goodspriceMapper.insert(goodsPrice)==1;
	}
}
