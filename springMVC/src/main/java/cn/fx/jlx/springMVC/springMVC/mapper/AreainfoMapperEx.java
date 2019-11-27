package cn.fx.jlx.springMVC.springMVC.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import cn.fx.jlx.springMVC.springMVC.pojo.AreainfoExample;



public interface AreainfoMapperEx {
	
	List<Map> selectAllInfoes(AreainfoExample example, RowBounds rowBounds);
		
		
	
	
}
