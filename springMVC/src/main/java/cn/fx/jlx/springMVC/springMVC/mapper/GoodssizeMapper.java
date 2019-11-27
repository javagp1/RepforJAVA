package cn.fx.jlx.springMVC.springMVC.mapper;

import cn.fx.jlx.springMVC.springMVC.pojo.Goodssize;
import cn.fx.jlx.springMVC.springMVC.pojo.GoodssizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodssizeMapper {
    long countByExample(GoodssizeExample example);

    int deleteByExample(GoodssizeExample example);

    int deleteByPrimaryKey(Integer gsid);

    int insert(Goodssize record);

    int insertSelective(Goodssize record);

    List<Goodssize> selectByExampleWithRowbounds(GoodssizeExample example, RowBounds rowBounds);

    List<Goodssize> selectByExample(GoodssizeExample example);

    Goodssize selectByPrimaryKey(Integer gsid);

    int updateByExampleSelective(@Param("record") Goodssize record, @Param("example") GoodssizeExample example);

    int updateByExample(@Param("record") Goodssize record, @Param("example") GoodssizeExample example);

    int updateByPrimaryKeySelective(Goodssize record);

    int updateByPrimaryKey(Goodssize record);
}