<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="fruits" value="Apple,Orange,Mango" />

<c:forEach var="fruit" items="${fn:split(fruits, ',')}">
    ${fn:toUpperCase(fruit)}<br>
</c:forEach>
