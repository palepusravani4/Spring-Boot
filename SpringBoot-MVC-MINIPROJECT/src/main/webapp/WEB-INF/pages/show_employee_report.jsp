<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<c:choose>
<c:when test="${!empty emptyList}">
<h1 style="color:red;text-align:center">Employees Report</h1>
<h2 style="color:green;text-align:center">${resultMsg}</h2>
<table border="1" align="center" bgcolor="cyan">
<tr style="color:red"><th>empno</th><th>ename</th><th>job</th><th>sal</th>
<th>deptno</th><th>operation</th></tr>
<c:forEach var="emp" items="${empsList}">
<tr style="color:blue">
<td>${emp.empno}</td>
<td>${emp.ename}</td>
<td>${emp.job}</td>
<td>${emp.sal}</td>
<td>${emp.deptno}</td>
<td><a href="emp_edit?no=${emp.empno}">aaaa</a>
<a href="emp_delete?no=${emp.empno}">bbbb</a></td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
  <h1 style="color:red;text-align:center">employee not found</h1>
  </c:otherwise>
</c:choose>

<center>
<a href="emp_add">add employee</a>
<a href="./">home</a>
</center>
