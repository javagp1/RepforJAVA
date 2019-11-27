package cn.fx.jlx.springMVC.springMVC.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

import cn.fx.jlx.springMVC.springMVC.mapper.AreainfoMapper;
import cn.fx.jlx.springMVC.springMVC.mapper.AreainfoMapperEx;
import cn.fx.jlx.springMVC.springMVC.pojo.Areainfo;
import cn.fx.jlx.springMVC.springMVC.pojo.AreainfoExample;

@Service
public class AreaInfoService {
	@Autowired
	private AreainfoMapper areainfoMapper;
	@Autowired
	private AreainfoMapperEx areainfoMapperEx;
	
	public Areainfo getInfoByAid(Integer aid){
		
		return areainfoMapper.selectByPrimaryKey(aid);
	}
	
	@Transactional
	public boolean doUpdate(Areainfo areainfo){
		
		
		return areainfoMapper.updateByPrimaryKey(areainfo)==1;
	}
	
	@Transactional
	public boolean doInsert(Areainfo areainfo){
		
		
		return areainfoMapper.insert(areainfo)==1;
	}
	
	public List<Areainfo> getAll(){
		
		
		AreainfoExample example = new AreainfoExample();
		return areainfoMapper.selectByExample(example);
	}
	
	
	@Transactional
	public Boolean doDeleteByAid(Integer aid){
		
		return areainfoMapper.deleteByPrimaryKey(aid)==1;
		
	}
	
	
	public Integer pageTotalCount(Integer infoCount){
		
		
		AreainfoExample example = new AreainfoExample();
		int count =(int) areainfoMapper.countByExample(example);
		return count%infoCount==0?count/infoCount : count/infoCount+1;
		
	}
	
	
	public List<Map> getAllInfoes(Integer pageNum,Integer infocount){
		
		
		
		Integer offset = (pageNum-1)*infocount;
		AreainfoExample example = new AreainfoExample();
		RowBounds rowBounds = new RowBounds(offset, infocount);
		return areainfoMapperEx.selectAllInfoes(example, rowBounds);
	}
	
public List<Map> getInfoes(Integer pageNum,Integer infocount){
		
		
		
		Integer offset = (pageNum-1)*infocount;
		AreainfoExample example = new AreainfoExample();
		RowBounds rowBounds = new RowBounds(offset, infocount);
		return areainfoMapperEx.selectAllInfoes(example, rowBounds);
	}
public List<Areainfo> getAllInfoesByAlevel(Integer alevel){
	
	
	

	AreainfoExample example = new AreainfoExample();
	example.createCriteria().andAlevelEqualTo(alevel);
	return areainfoMapper.selectByExample(example);
}

}
