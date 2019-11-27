package cn.fx.jlx.springMVC.springMVC.mapper;

import cn.fx.jlx.springMVC.springMVC.pojo.Carouselimg;
import cn.fx.jlx.springMVC.springMVC.pojo.CarouselimgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CarouselimgMapper {
    long countByExample(CarouselimgExample example);

    int deleteByExample(CarouselimgExample example);

    int deleteByPrimaryKey(Integer cimgid);

    int insert(Carouselimg record);

    int insertSelective(Carouselimg record);

    List<Carouselimg> selectByExampleWithRowbounds(CarouselimgExample example, RowBounds rowBounds);

    List<Carouselimg> selectByExample(CarouselimgExample example);

    Carouselimg selectByPrimaryKey(Integer cimgid);

    int updateByExampleSelective(@Param("record") Carouselimg record, @Param("example") CarouselimgExample example);

    int updateByExample(@Param("record") Carouselimg record, @Param("example") CarouselimgExample example);

    int updateByPrimaryKeySelective(Carouselimg record);

    int updateByPrimaryKey(Carouselimg record);
}