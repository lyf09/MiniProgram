<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <title></title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
    <link href="<%=path%>/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=path%>/assets/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=path%>/assets/css/animate.css" rel="stylesheet">
    <link href="<%=path%>/assets/css/style.css" rel="stylesheet">

</head>

<body class="gray-bg">
<div class="wrapper wrapper-content">
    <div class="row">
        <div class="col-sm-12 animated fadeInRight">
            <div class="ibox ibox-content">
                <div class="tabs-container">
                    <ul class="nav nav-tabs">
                        <li><a href="<%=path%>/product/index">所有商品</a></li>
                        <li class="active"><a href="<%=path%>/product/create">添加商品</a></li>
                    </ul>
                    <div class="tab-content">
                        <div class="tab-pane active">
                            <div class="panel-body">
                                <form method="post" class="form-horizontal custom-form" id="productForm" autocomplete="off" action="<%=path%>/product/update">
                                    <input type="hidden" name="productId"/>
                                    <div class="form-row">
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label"><span class="required">*</span>商品名称:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" name="productTitle" placeholder=""/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-row">
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label"><span class="required">*</span>商品分类:</label>
                                            <div class="col-sm-10">
                                                <div class="col-sm-10">
                                                    <c:forEach items="${cates}" var="c">
                                                        <label class="checkbox-inline"><input name="categoryId" type="checkbox" value="${c.cateId}">${c.title}</label>
                                                    </c:forEach>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-row">
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">邮箱:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" name="bindEmail" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-row">
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">手机号码:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" name="bindMobile" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-row">
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">注册时间:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" name="registerTime" data-role="datetimepicker" />
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group text-center">
                                        <button type="submit" class="btn btn-primary"><i class="fa fa-check"></i> 保 存</button>
                                        <button type="button" class="btn btn-danger"><i class="fa fa-reply-all"></i>关 闭</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="<%=path%>/assets/require.min.js"></script>
<script src="<%=path%>/assets/require.config.js"></script>
<script>

    var json = ${json};
    //表单验证提交
    require(['validation', 'form', 'datetimepicker','formfill'], function ($) {
        $('#productForm').validate({submitHandler: function (form) {
            $(form).ajaxForm();
        }});

        $('[data-role="datetimepicker"]').datetimepicker({
            lang: 'ch',
            step: 10,
            format: "Y-m-d H:i"
        });

        $('#productForm').autofill(json, {before:function (data) {
//            data.categoryId =  data.categoryId.split(',');
            data.categoryId = [];
            for (index in data.category){
                data.categoryId.push(data.category[index].cateId);
            }
            return data;
        }});
    });
</script>
</body>
</html>

