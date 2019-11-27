package cn.fx.jlx.springMVC.springMVC.mapper;

import cn.fx.jlx.springMVC.springMVC.pojo.Goodscomment;
import cn.fx.jlx.springMVC.springMVC.pojo.GoodscommentExample;
import cn.fx.jlx.springMVC.springMVC.pojo.GoodscommentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodscommentMapper {
    long countByExample(GoodscommentExample example);

    int deleteByExample(GoodscommentExample example);

    int deleteByPrimaryKey(GoodscommentKey key);

    int insert(Goodscomment record);

    int insertSelective(Goodscomment record);

    List<Goodscomment> selectByExampleWithBLOBsWithRowbounds(GoodscommentExample example, RowBounds rowBounds);

    List<Goodscomment> selectByExampleWithBLOBs(GoodscommentExample example);

    List<Goodscomment> selectByExampleWithRowbounds(GoodscommentExample example, RowBounds rowBounds);

    List<Goodscomment> selectByExample(GoodscommentExample example);

    Goodscomment selectByPrimaryKey(GoodscommentKey key);

    int updateByExampleSelective(@Param("record") Goodscomment record, @Param("example") GoodscommentExample example);

    int updateByExampleWithBLOBs(@Param("record") Goodscomment record, @Param("example") GoodscommentExample example);

    int updateByExample(@Param("record") Goodscomment record, @Param("example") GoodscommentExample example);

    int updateByPrimaryKeySelective(Goodscomment record);

    int updateByPrimaryKeyWithBLOBs(Goodscomment record);

    int updateByPrimaryKey(Goodscomment record);
}