package cn.fx.jlx.springMVC.springMVC.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.fx.jlx.springMVC.springMVC.pojo.Goodsinfo;
import cn.fx.jlx.springMVC.springMVC.service.GoodsCollectionService;
import cn.fx.jlx.springMVC.springMVC.service.GoodsInfoService;

@RestController
@RequestMapping("/goodsinfoctrl")

public class GoodsInfoCtrl {
	@Autowired
	private GoodsInfoService goodsInfoService;
	
	@Autowired
	private GoodsCollectionService goodsCollectionService;

	@RequestMapping("doupdate")
	public String doUpdate(Goodsinfo goodsinfo,Integer pagenum,ModelMap map){
		
		goodsInfoService.doUpdate(goodsinfo);
		
		return this.getAll(pagenum, map);
		
	}
	
	@RequestMapping("editupdate")
	public String editUpdate(Integer gdid,Integer pagenum,ModelMap map){
		
		
		
		
		map.put("oldgood", goodsInfoService.getInfoByGdid(gdid));
		map.put("allgoods", goodsInfoService.getAll());
		map.put("currentpage", pagenum);
		return "/WEB-INF/editGoodsUpdate.jsp";
	}
	
	
	@PostMapping("doinsert")
	public String doInsert(Goodsinfo goodsinfo,ModelMap map){
		boolean insert = goodsInfoService.doInsert(goodsinfo);
		Integer pagenum	= goodsInfoService.pageTotalCount(15);
		
		return this.getAll(pagenum, map);
		
	}
	
	@RequestMapping("editinsert")
	public String editInsert(ModelMap map){
		
		map.put("allInfoes", goodsInfoService.getAll());
		
		return "/WEB-INF/editGoodsInsert.jsp";
		
	}
	
	
	
	@RequestMapping("getall")
	public String getAll(Integer pagenum,ModelMap map ){
		
		Integer pageNum = 1;
		if(pagenum!=null){
			pageNum=pagenum;
		}
		Integer infoCount = 15;
		
		Integer pageCount = goodsInfoService.pageTotalCount(infoCount);
		
		List<Map> li = goodsInfoService.getAllInfoes(pageNum, infoCount);
		
		if(li.size()==0){
			return this.getAll(pageNum-1, map);
		}
		
		map.put("goods", li);
		map.put("pagecount", pageCount);
		map.put("currentpagenum", pageNum);
		
		return "/WEB-INF/GoodsInfo.jsp";
		
		
		
	}
	@RequestMapping("dodelete")
	public String doDeleteByGdid(Integer pagenum,Integer gdid,ModelMap map){
		
		goodsInfoService.doDeleteByGdid(gdid);
		return this.getAll(pagenum, map);
		
		
	}
	
	@RequestMapping("getinfoes")
	public Object getInfoes(Integer pagenum){
		
		Integer rowCount=20;
		Integer pageCount = goodsInfoService.pageTotalCount(rowCount);
		List<Map> list = goodsInfoService.getAllInfoes(pagenum, rowCount);
		for (Map map1 : list) {
			map1.put("count",goodsCollectionService.countCollection((Integer)map1.get("gdid")));
		}
		Map result = new HashMap();
		
		result.put("pagecount", pageCount);
		result.put("infoes",list);
		
		return result;
		
	}
	@RequestMapping("gettopten")
	public List<Goodsinfo> getTopTen(String keyword){
		
	return	goodsInfoService.getTopTen("%"+keyword+"%");
	}
	
	@RequestMapping("getgoodsinfodetailbygdid")
	public Map getGoodsinfoDetailByGdid(Integer gdid){
		
		return goodsInfoService.getGoodsinfoDetailByGdid(gdid);
	}
}
