package cn.fx.jlx.springMVC.springMVC.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.fx.jlx.springMVC.springMVC.pojo.Areainfo;
import cn.fx.jlx.springMVC.springMVC.service.AreaInfoService;

@RestController
@RequestMapping("ajaxctrl")
public class AjaxController {

	@Autowired
	private AreaInfoService areaInfoService;
	
	@RequestMapping("dodelete")
	public Object doDeleteByAid(Integer aid){
		
		
		return areaInfoService.doDeleteByAid(aid);
		
		
	}

	@RequestMapping("ajaxgo")
	public Object acceptAjax(Integer pageNum) {

		Integer pageCount = areaInfoService.pageTotalCount(10);
		Integer currentpagenum = 0;
		List<Map> areas;
		if(pageNum<=0){
			 areas = areaInfoService.getInfoes(pageCount, 10);
			 currentpagenum = pageCount;
		}else{
			 areas = areaInfoService.getInfoes(pageNum, 10);
			 currentpagenum = pageNum;
		}
		
		
		
		Map result = new HashMap();

		result.put("infoes", areas);
		result.put("pagecount", pageCount);
		result.put("currentpagenum", currentpagenum);

		return result;

	}
	@RequestMapping("allinfoes")
	public Object allInfoes(){
		
		return areaInfoService.getAll();
				
	}
	@RequestMapping("doinsert")
	public boolean doInsert(Areainfo areainfo){
		
		
		return areaInfoService.doInsert(areainfo);
		
	}
	@RequestMapping("getinfoesbyalevel")
	public Object getInfoesByAlevel(Integer alevel){
		
		return areaInfoService.getAllInfoesByAlevel(alevel);
		
	}
	@RequestMapping("doupdate")
	public Boolean doUpdate(Areainfo areainfo){
		
		return areaInfoService.doInsert(areainfo);
		
	}
	@RequestMapping("getinfobyaid")
	public Areainfo getInfoByAid(Integer aid){
		
		
		return areaInfoService.getInfoByAid(aid);
	}
}
