<%@page import="cn.fx.jlx.springMVC.springMVC.pojo.Areainfo" isELIgnored="false"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE HTML >
<html>
  <head>
    
    
    <title>My JSP 'editUpdate.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="/springMVC/dist/css/bootstrap.min.css">
	

  </head>

  	<x:set var="areas" value="${requestScope.allinfoes}"></x:set>
  	<x:set var="oldarea" value="${requestScope.oldarea}"></x:set>
  	<x:set var="currentpage" value="${requestScope.currentpage}"></x:set>
  <body>
    <form action="/springMVC/areainfoctrl/doupdate?pagenum=${currentpage }" method="post">
    <div class="container">
    <div style="width: 500px;margin: 60px auto;" >
    	<table style="height: 400px" class="table table-hover table-striped">
    	
    		<tr>
    			<td>地区编号：</td>
    			<td>${oldarea.aid}
    				<input type="hidden" name="aid" value="${oldarea.aid}">
    				<input type="hidden"   value="${currentpage }" name="pagenum">
    			</td>
    			
    		</tr>
    		<tr>
    			<td>地区名称：</td>
    			<td><input class="form-control" type="text" name="aname" required="required" value="${oldarea.aname }"></td>
    		</tr>
    		<tr>
    			<td>行政级别：</td>
    			
    			<td><label><input type="radio" ${oldarea.alevel==1?"checked='checked'":""}  name="alevel" value="1">国家</label>&nbsp;
    				<label><input type="radio" ${oldarea.alevel==2?"checked='checked'":""} name="alevel" value="2">省/州/直辖市</label>&nbsp;
    				<label><input type="radio" ${oldarea.alevel==3?"checked='checked'":""} name="alevel" value="3">地级市</label>&nbsp;</td>
    		</tr>
    		<tr>
    			<td>上级地区：</td>
    			<td>
    				<select class="form-control"  name="aparentid">
    					<option value="">无</option>
    					<x:forEach items="${areas}" var="a">
    					
    					
    						<option value="${a.aid}" ${oldarea.aparentid==a.aid?"selected='selected'":""}>${a.aname}</option>
    					
    					</x:forEach>
    				</select>
    			</td>
    		</tr>
    		<tr>
    		<td colspan="2" style="text-align: center;"><button class="btn btn-success">更新</button> &nbsp; &nbsp;&nbsp;<button class="btn btn-primary" type="button">重置</button></td> 
    		
    		
    		</tr>
    	</table>
    	</div>
    	</div>
    </form>
  </body>
</html>
