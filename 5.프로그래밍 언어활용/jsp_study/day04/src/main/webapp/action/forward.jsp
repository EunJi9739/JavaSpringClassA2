<%@ page contentType="text/html; charset=utf-8" %>

<h1>forward.jsp</h1>
<jsp:forward page="target.jsp">
    <jsp:param name="param1" value="1111"/>
    <jsp:param name="param2" value="2222"/>
</jsp:forward>