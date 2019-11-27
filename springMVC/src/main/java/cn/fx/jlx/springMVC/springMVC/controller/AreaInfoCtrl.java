package cn.fx.jlx.springMVC.springMVC.controller;



import java.awt.geom.Area;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import cn.fx.jlx.springMVC.springMVC.pojo.Areainfo;
import cn.fx.jlx.springMVC.springMVC.service.AreaInfoService;

@Controller
@RequestMapping("/areainfoctrl")
@SessionAttributes("attrs")
public class AreaInfoCtrl {
	@Autowired
	private AreaInfoService areaInfoService;

	@RequestMapping("doupdate")
	public String doUpdate(Areainfo areainfo,Integer pagenum,ModelMap map){
		
		areaInfoService.doUpdate(areainfo);
		
		return this.getAll(pagenum, map);
		
	}
	
	@RequestMapping("editupdate")
	public String editUpdate(Integer aid,Integer pagenum,ModelMap map){
		
		
		
		
		map.put("oldarea", areaInfoService.getInfoByAid(aid));
		map.put("allinfoes", areaInfoService.getAll());
		map.put("currentpage", pagenum);
		return "/WEB-INF/editUpdate.jsp";
	}
	
	
	@PostMapping("doinsert")
	public String doInsert(Areainfo areainfo,ModelMap map){
		boolean insert = areaInfoService.doInsert(areainfo);
		Integer pagenum	= areaInfoService.pageTotalCount(7);
		
		return this.getAll(pagenum, map);
		
	}
	
	@RequestMapping("editinsert")
	public String editInsert(ModelMap map){
		
		map.put("allInfoes", areaInfoService.getAll());
		
		return "/WEB-INF/editInsert.jsp";
		
	}
	
	
	
	@RequestMapping("getall")
	public String getAll(Integer pagenum,ModelMap map ){
		
		Integer pageNum = 1;
		if(pagenum!=null){
			pageNum=pagenum;
		}
		Integer infoCount = 7;
		
		Integer pageCount = areaInfoService.pageTotalCount(infoCount);
		
		List<Map> li = areaInfoService.getAllInfoes(pageNum, infoCount);
		
		if(li.size()==0){
			return this.getAll(pageNum-1, map);
		}
		
		map.put("areas", li);
		map.put("pagecount", pageCount);
		map.put("currentpagenum", pageNum);
		
		return "/WEB-INF/AreaInfo.jsp";
		
		
		
	}
	@RequestMapping("dodelete")
	public String doDeleteByAid(Integer pagenum,Integer aid,ModelMap map){
		
		areaInfoService.doDeleteByAid(aid);
		return this.getAll(pagenum, map);
		
		
		
		
	}
	
}
