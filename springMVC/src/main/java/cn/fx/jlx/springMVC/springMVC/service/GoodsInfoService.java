package cn.fx.jlx.springMVC.springMVC.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.fx.jlx.springMVC.springMVC.mapper.GoodsinfoMapper;
import cn.fx.jlx.springMVC.springMVC.mapper.GoodsinfoMapperEx;
import cn.fx.jlx.springMVC.springMVC.pojo.Goodsinfo;
import cn.fx.jlx.springMVC.springMVC.pojo.GoodsinfoExample;

@Service
public class GoodsInfoService {
	@Autowired
	private GoodsinfoMapper goodsinfoMapper;
	@Autowired
	private GoodsinfoMapperEx goodsinfoMapperEx;
	
	public Goodsinfo getInfoByGdid(Integer gdid){
		
		return goodsinfoMapper.selectByPrimaryKey(gdid);
	}
	
	@Transactional
	public boolean doUpdate(Goodsinfo goodsinfo){
		
		
		return goodsinfoMapper.updateByPrimaryKey(goodsinfo)==1;
	}
	
	@Transactional
	public boolean doInsert(Goodsinfo goodsinfo){
		
		
		return goodsinfoMapper.insert(goodsinfo)==1;
	}
	
	public List<Goodsinfo> getAll(){
		
		
		GoodsinfoExample example = new GoodsinfoExample();
		return goodsinfoMapper.selectByExample(example);
	}
	
	
	@Transactional
	public Boolean doDeleteByGdid(Integer gdid){
		
		return goodsinfoMapper.deleteByPrimaryKey(gdid)==1;
		
	}
	
	
	public Integer pageTotalCount(Integer infoCount){
		
		
		GoodsinfoExample example = new GoodsinfoExample();
		int count =(int) goodsinfoMapper.countByExample(example);
		return count%infoCount==0?count/infoCount : count/infoCount+1;
		
	}
	
	
	public List<Map> getAllInfoes(Integer pageNum,Integer infocount){
		
		
		
		Integer offset = (pageNum-1)*infocount;
		GoodsinfoExample example = new GoodsinfoExample();
		RowBounds rowBounds = new RowBounds(offset, infocount);
		return goodsinfoMapperEx.selectAllInfoes(example, rowBounds );
	}
	
	public List<Goodsinfo> getTopTen(String keyword){
		
		
		
		GoodsinfoExample example = new GoodsinfoExample();
		example.createCriteria().andGdnameLike(keyword);
		example.setOrderByClause("gtdate desc");
		RowBounds rowBounds = new RowBounds(0,10);
		return goodsinfoMapper.selectByExampleWithRowbounds(example, rowBounds);
	}
	
	public Map getGoodsinfoDetailByGdid(Integer gdid){
		
		return goodsinfoMapperEx.selectGoodsinfoDetailByGdid(gdid);
	}
}
