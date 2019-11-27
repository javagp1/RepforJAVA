package cn.fx.jlx.springMVC.springMVC.mapper;

import cn.fx.jlx.springMVC.springMVC.pojo.Orderlist;
import cn.fx.jlx.springMVC.springMVC.pojo.OrderlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrderlistMapper {
    long countByExample(OrderlistExample example);

    int deleteByExample(OrderlistExample example);

    int deleteByPrimaryKey(String olid);

    int insert(Orderlist record);

    int insertSelective(Orderlist record);

    List<Orderlist> selectByExampleWithRowbounds(OrderlistExample example, RowBounds rowBounds);

    List<Orderlist> selectByExample(OrderlistExample example);

    Orderlist selectByPrimaryKey(String olid);

    int updateByExampleSelective(@Param("record") Orderlist record, @Param("example") OrderlistExample example);

    int updateByExample(@Param("record") Orderlist record, @Param("example") OrderlistExample example);

    int updateByPrimaryKeySelective(Orderlist record);

    int updateByPrimaryKey(Orderlist record);
}