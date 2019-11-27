package cn.fx.jlx.springMVC.springMVC.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import cn.fx.jlx.springMVC.springMVC.pojo.GoodsinfoExample;

public interface GoodsinfoMapperEx {
	
	String sql1 = "SELECT gd.gdname,img.gimgurl,gprice.price FROM goodsinfo gd "
			+ "JOIN goodsimage img "
			+ "JOIN goodsprice gprice"
			+ " ON gd.gdid=img.gdid AND gd.gdid=gprice.gdid AND gprice.utid=1  AND img.gimgtype=1 And gd.gdid=#{gdid}";
  
	
	public List<Map> selectAllInfoes(GoodsinfoExample example, RowBounds rowBounds);
	
	@Select("<script>"+sql1+"</script>")
	public Map selectGoodsinfoDetailByGdid(Integer gdid);
	
}
