<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML>
<html>
  <head>
   
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta charset="utf-8">
	
  </head>
  
  <body>
   <h1>考试</h1>
   <table border="1">
      <tr>
			<th>ENAME</th>
			<th>JOB</th>
			<th>DNAME</th>
			<th>LOC</th>
			<th>SAL</th>
		</tr>
		<c:forEach var="staff" items="${staffs}">
			<tr>
				<td>${staff.ename }</td>
				<td>${staff.job }</td>
				<td>${staff.dname }</td>
				<td>${staff.loc }</td>
				<td>${staff.sal }</td>
				
			</tr>
		</c:forEach>
       <tr>
  			<td  colspan="5">
  				当前页：${page }|
  				<a href="staffController_list?rows=5&&page=${page-1 }">上一页</a>|
  				<a href="staffController_list?rows=5&&page=${page+1 }">下一页</a>|
  				总记录数：${total }
  			</td>
  		</tr>
   </table>
  </body>
</html>
