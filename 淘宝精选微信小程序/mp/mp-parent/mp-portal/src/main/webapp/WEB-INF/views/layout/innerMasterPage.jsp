<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<!doctype html>
<html lang="en">
<head>
    <title><rapid:block name="title"></rapid:block></title>
    <meta charset="UTF-8">
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="<%=request.getContextPath()%>/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/assets/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/assets/css/animate.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/assets/css/style.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;${path}/ie.html"/>
    <![endif]-->
    <rapid:block name="head"></rapid:block>
</head>
<rapid:block name="body">
    <body>
    <rapid:block name="content">

    </rapid:block>
    <%@ include file="../common/script.jsp"%>
    <rapid:block name="js">

    </rapid:block>
    </body>
</rapid:block>
</html>
