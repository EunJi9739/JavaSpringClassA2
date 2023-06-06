<%@ page contentType="text/html; charset=utf-8" %>

<%
    pageContext.setAttribute("num", 400);
    request.setAttribute("num",100);
    session.setAttribute("num",200);
    //session.removeAttribute("num");
    application.setAttribute("num",300);
%>
${num}
pageScope : ${pageScope.num}<br>
requestScope : ${requestScope.num}<br>
sessionScope : ${sessionScope.num}<br>
applicationScope : ${applicationScope.num}<br>