package cn.fx.jlx.springMVC.springMVC.mapper;

import cn.fx.jlx.springMVC.springMVC.pojo.Stuser;
import cn.fx.jlx.springMVC.springMVC.pojo.StuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StuserMapper {
    long countByExample(StuserExample example);

    int deleteByExample(StuserExample example);

    int deleteByPrimaryKey(Integer stuserid);

    int insert(Stuser record);

    int insertSelective(Stuser record);

    List<Stuser> selectByExampleWithRowbounds(StuserExample example, RowBounds rowBounds);

    List<Stuser> selectByExample(StuserExample example);

    Stuser selectByPrimaryKey(Integer stuserid);

    int updateByExampleSelective(@Param("record") Stuser record, @Param("example") StuserExample example);

    int updateByExample(@Param("record") Stuser record, @Param("example") StuserExample example);

    int updateByPrimaryKeySelective(Stuser record);

    int updateByPrimaryKey(Stuser record);
}