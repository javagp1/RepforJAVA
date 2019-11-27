package cn.fx.jlx.springMVC.springMVC.mapper;

import java.util.List;
import java.util.Map;

public interface CartMapperEx {
	List<Map>  getCartListByUserID(Integer userid);
}
