package cn.fx.jlx.springMVC.springMVC.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.fx.jlx.springMVC.springMVC.mapper.GoodscollectionMapper;
import cn.fx.jlx.springMVC.springMVC.mapper.GoodscollectionMapperEx;
import cn.fx.jlx.springMVC.springMVC.pojo.GoodscollectionExample;
import cn.fx.jlx.springMVC.springMVC.pojo.GoodscollectionKey;

@Service
public class GoodsCollectionService {
	@Autowired
	private GoodscollectionMapper goodscollectionMapper;
	
	@Autowired
	private GoodscollectionMapperEx goodscollectionmapperex;

	@Transactional
	public boolean addcollection(GoodscollectionKey goodscollection){
		return goodscollectionMapper.insert(goodscollection)==1;
	}
	
	@Transactional
	public boolean deleteCollection(GoodscollectionKey goodscollectionKey){
		return goodscollectionMapper.deleteByPrimaryKey(goodscollectionKey)==1;
	}
	
	
	public List<Map> selectCollection(Integer userid){
	 return	goodscollectionmapperex.getCollections(userid);
	}
	
	public Long countCollection(Integer gdid){
		
		GoodscollectionExample example = new GoodscollectionExample();
		example.createCriteria().andGdidEqualTo(gdid);
		return goodscollectionMapper.countByExample(example);
	}
	
	public List<GoodscollectionKey> getUserCollection(Integer userid){
		GoodscollectionExample example = new GoodscollectionExample();
		example.createCriteria().andUseridEqualTo(userid);
		return goodscollectionMapper.selectByExample(example );
	}
}
