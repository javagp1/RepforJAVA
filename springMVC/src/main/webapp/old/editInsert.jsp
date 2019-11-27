<%@page import="cn.fx.jlx.springMVC.springMVC.pojo.Areainfo"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


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
  <%List<Areainfo> li = (List<Areainfo>)request.getAttribute("allInfoes");%>
 
  <body>
    <form action=/springMVC/areainfoctrl/doinsert" method="post">
    <div class="container">
    <div style="width: 500px;margin: 40px auto">
    	<table style="height: 400px" class="table table-hover table-striped">
    		<tr>
    			<td>地区名称：</td>
    			<td><input type="text" name="aname" required="required" class="form-control"></td>
    		</tr>
    		<tr>
    			<td>行政级别：</td>
    			<td style="text-align: left;"><label><input type="radio" checked="checked" name="alevel" value="1">国家</label>&nbsp;
    				<label><input type="radio" name="alevel" value="2">省/州/直辖市</label>&nbsp;
    				<label><input type="radio" name="alevel" value="3">地级市</label>&nbsp;</td>
    		</tr>
    		<tr>
    			<td>上级地区：</td>
    			<td>
    				<select class="form-control" name="aparentid">
    					<option value="">无</option>
    					<%for(Areainfo a : li){ %>
    					
    						<option value="<%=a.getAid() %>"><%=a.getAname() %></option>
    					
    					<%} %>
    				</select>
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
