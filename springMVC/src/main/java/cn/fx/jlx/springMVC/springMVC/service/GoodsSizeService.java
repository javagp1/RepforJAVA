package cn.fx.jlx.springMVC.springMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cn.fx.jlx.springMVC.springMVC.mapper.GoodssizeMapper;
import cn.fx.jlx.springMVC.springMVC.pojo.Goodssize;
import cn.fx.jlx.springMVC.springMVC.pojo.GoodssizeExample;

@Service
public class GoodsSizeService {
	
	@Autowired
	private GoodssizeMapper goodssizeMapper;
	

	public List<Goodssize> getAllGoodsSize() {

		GoodssizeExample example = new GoodssizeExample();
		return goodssizeMapper.selectByExample(example);
	}
}
