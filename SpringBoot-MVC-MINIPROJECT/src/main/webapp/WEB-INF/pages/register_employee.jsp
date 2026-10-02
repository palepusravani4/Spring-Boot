<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="fm" %>

<h1 style="color:red;text-align:center">Register Employee</h1>

<fm:form modelAttribute="emp">
<table align="center" bgcolor="cyan">
<tr>
<td>Employee Name:</td>
<td><fm:input path="ename"/></td>
</tr>
<tr>
<td>Employee desg:</td>
<td><fm:input path="job"/></td>
</tr>
<tr>
<td>Employee salary:</td>
<td><fm:input path="sal"/></td>
</tr>
<tr>
<td>Employee deptno:</td>
<td><fm:input path="deptno"/></td>
</tr>
<tr>
<td><input type="submit" value="submit"></td>
<td><input type="reset" value="cancel"></td>
</tr>




</table>






</fm:form>