package cn.fx.jlx.springMVC.springMVC.mapper;

import cn.fx.jlx.springMVC.springMVC.pojo.Usertype;
import cn.fx.jlx.springMVC.springMVC.pojo.UsertypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UsertypeMapper {
    long countByExample(UsertypeExample example);

    int deleteByExample(UsertypeExample example);

    int deleteByPrimaryKey(Integer utid);

    int insert(Usertype record);

    int insertSelective(Usertype record);

    List<Usertype> selectByExampleWithRowbounds(UsertypeExample example, RowBounds rowBounds);

    List<Usertype> selectByExample(UsertypeExample example);

    Usertype selectByPrimaryKey(Integer utid);

    int updateByExampleSelective(@Param("record") Usertype record, @Param("example") UsertypeExample example);

    int updateByExample(@Param("record") Usertype record, @Param("example") UsertypeExample example);

    int updateByPrimaryKeySelective(Usertype record);

    int updateByPrimaryKey(Usertype record);
}