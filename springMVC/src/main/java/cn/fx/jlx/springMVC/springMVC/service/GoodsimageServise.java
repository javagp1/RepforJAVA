package cn.fx.jlx.springMVC.springMVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.fx.jlx.springMVC.springMVC.mapper.GoodsimageMapper;
import cn.fx.jlx.springMVC.springMVC.pojo.Goodsimage;

@Service
public class GoodsimageServise {
	
	@Autowired
	private GoodsimageMapper goodsimageMapper;
	
	@Transactional
	public boolean addGdimg(Goodsimage goodsimage ){
		
		return goodsimageMapper.insert(goodsimage)==1;
	}
}
