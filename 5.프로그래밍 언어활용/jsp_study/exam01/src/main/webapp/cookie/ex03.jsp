<%@ page contentType="text/html; charset=utf-8" %>
<%
    Cookie cookie = new Cookie("key1", "Value1");
    cookie.setPath(request.getCookies());
    cookie.setMaxAge(0);
    response.addCookie(cookie);
%>