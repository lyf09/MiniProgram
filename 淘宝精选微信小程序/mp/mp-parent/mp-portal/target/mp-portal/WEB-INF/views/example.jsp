<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<%
    request.setAttribute("path", request.getContextPath());
%>

<rapid:override name="title">${path}</rapid:override>
<rapid:override name="head">

</rapid:override>
<rapid:override name="content">

</rapid:override>
<rapid:override name="js">

</rapid:override>
<%@ include file="layout/masterPage.jsp" %>
