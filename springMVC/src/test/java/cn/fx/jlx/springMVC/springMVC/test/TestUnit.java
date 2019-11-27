package cn.fx.jlx.springMVC.springMVC.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.fx.jlx.springMVC.springMVC.mapper.OrderinfoMapper;
import cn.fx.jlx.springMVC.springMVC.mapper.OrderinfoMapperEx;
import cn.fx.jlx.springMVC.springMVC.mapper.StuserMapper;
import cn.fx.jlx.springMVC.springMVC.pojo.Orderlist;
import cn.fx.jlx.springMVC.springMVC.pojo.Stuser;
import cn.fx.jlx.springMVC.springMVC.service.AreaInfoService;
import cn.fx.jlx.springMVC.springMVC.service.GoodsInfoService;
import cn.fx.jlx.springMVC.springMVC.service.UserService;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@MapperScan(value="cn.fx.jlx.springMVC.springMVC.mapper")
public class TestUnit{
	@Autowired
	AreaInfoService infoService;
	
	@Autowired
	GoodsInfoService goodsInfoService; 
	
	@Autowired
	OrderinfoMapperEx orderinfoMapperEx;
	
	@Autowired
	UserService userservice;
	
    @Test
    public void test(){
    	
    	Stuser stuser = new Stuser();
    	stuser.setSlogname("sensen");
    	stuser.setSpassword("sensen");
    	stuser.setStid(8);
    	userservice.stregister(stuser);
    	
    }
}
