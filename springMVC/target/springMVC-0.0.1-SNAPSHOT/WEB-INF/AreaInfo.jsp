<%@page isELIgnored="false"  import="cn.fx.jlx.springMVC.springMVC.pojo.Areainfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML >
<html>
  <head>
 
    
    <title>My JSP 'AreaInfo.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="/springMVC/dist/css/bootstrap.min.css">
	 <script type="text/javascript" src="/springMVC/sysjq/jquery-3.3.1.min.js"></script>

  </head>
  
  <body>
     <div class="container">
     <div   style="background-color: rgb(0,255,64);width: 150px;margin: 30px auto;font-size: 15px;border-radius: 8px;padding: 0 10px;height: 50px;line-height: 50px">地区信息管理<a title="添加信息" class="btn glyphicon glyphicon-plus" href="/springMVC/areainfoctrl/editinsert"></a></div>
     	<div style="width: 800px;margin: auto;height: 500px" >
     	<table class="table table-hover text-center table-striped">
     		<thead>
     			<tr style="font-weight: bold;">
     				<td>编号</td>
     				<td style="width: 130px">地区名称</td>
     				<td>行政级别</td>
     				<td>上级地区编号</td>
     				<td>数据维护</td>
     			</tr>
     		</thead>
     		<tbody>
     			
     			<x:forEach items="${requestScope.areas}" var="ai">
     				<tr>
     					<td>${ai.aid}</td>
     					<td  style="text-align: right">${ai.aname}<a class="btn btn-link" href="/springMVC/areainfoctrl/editupdate?aid=${ai.aid}&pagenum=${requestScope.currentpagenum}" title="修改信息"><i class="glyphicon glyphicon-cog"></i> </a></td>
     					<td>${ai.alevel==1?"国家":ai.alevel==2?"省/州/直辖市":"市"}</td>
     					<td>${ai.aparentid!=null?ai.aparentid:""}</td>
     					<td><button btn_self="delete" aid="${ai.aid}" class="btn btn-danger">delete</button></td>
     				</tr>
     				</x:forEach>
     			
     			<tr>
     				<td></td>
     			</tr>
     		</tbody>
     	</table>
     	</div>
     	<div class="text-center">
     	 <a class="btn " href="/springMVC/areainfoctrl/getall?pagenum=1">首页</a>
     	 <x:set var="previous" value="${requestScope.currentpagenum-1}" scope="request"></x:set>
     	 <x:if test="${requestScope.currentpagenum>1}">
     	 	<a class="btn " href="/springMVC/areainfoctrl/getall?pagenum=${previous}">上一页</a>
     	 </x:if>
     	<x:forEach begin="1" end="${requestScope.pagecount}" var="i" step="1">
     		<x:if test="${requestScope.currentpagenum==i}" var="eqi">
     			<button class="btn btn-primary disabled" >${i}</button>
     		</x:if>
     		<x:if test="${not eqi}">
     			<a class="btn " href="/springMVC/areainfoctrl/getall?pagenum=${i}">${i}</a>
     		</x:if>
     	</x:forEach>
     	
     	
     		 <x:set var="next" value="${requestScope.currentpagenum+1}" scope="request"></x:set>
     		  <x:if test="${requestScope.currentpagenum<requestScope.pagecount}">
     	 		<a class="btn " href="/springMVC/areainfoctrl/getall?pagenum=${next}">下一页</a>
     		</x:if>
     		
   			 <a class="btn " href="/springMVC/areainfoctrl/getall?pagenum=${requestScope.pagecount }">尾页</a>
     	</div>
     </div>
  </body>
 
  <script type="text/javascript">
  $("").ready(function(){
  
  	$("[btn_self=delete]").click(function(){
  		
  		if(window.confirm("确定要删除吗？")){
  			window.location.href="/springMVC/areainfoctrl/dodelete?pagenum=${requestScope.currentpagenum}&aid="+$(this).attr("aid");
  		}
  		
  	})
  
  })
  
  </script>
</html>
