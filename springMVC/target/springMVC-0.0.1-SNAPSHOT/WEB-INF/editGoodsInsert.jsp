<%@page import="cn.fx.jlx.springMVC.springMVC.pojo.Areainfo" isELIgnored="false"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE HTML >
<html>
  <head>
    
    
    <title>My JSP 'editInsert.jsp' starting page</title>
    <style type="text/css">
    	td{ 
    		height: 100px;
    		line-height: 100px;
    		text-align: center;
    	}
    </style>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="/springMVC/dist/css/bootstrap.min.css">
	

  </head>
  
 
  <body>
  	
  	
    <form action="/springMVC/goodsinfoctrl/doinsert" method="post">
    <div class="container">
    <div style="width: 500px;margin: 40px auto">
    	<table style="height: 400px" class="table table-hover table-striped">
    		<tr>
    			<td>商品名称：</td>
    			<td><input type="text" name="gdname" required="required" class="form-control"></td>
    		</tr>
    		<tr>
    			<td>店铺编号：</td>
    			<td style="text-align: left;">
    			<select name=stid>
    			<x:forEach begin="1" end="8" var="i">
    			<option>${i}</option>
    			</x:forEach>
    			</select>
    			</td>
    		</tr>
    		<tr>
    			<td>标签：</td>
    			<td>
    			<input type="text" name="gtkeywords" class="form-control">
    			</td>
    		</tr>
    		<tr>
    			<td>日期：</td>
    			<td>
    			<input type="text" name="gtdate" class="form-control" placeholder="格式如：2005-11-06">
    			</td>
    		</tr>
    		<tr>
    		<td colspan="2"><button class="btn btn-success">添加</button> &nbsp; &nbsp;&nbsp;<button type="reset" class="btn btn-primary">重置</button></td> 
    		
    		
    		</tr>
    	</table>
    	</div>
    	</div>
    </form>
  </body>
  <script type="text/javascript" src="/springMVC/sysjq/jquery-3.3.1.min.js"></script>
  <script type="text/javascript">
  	
  
  	
  	
  </script>
</html>
