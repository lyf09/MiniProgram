<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                        <li><a href="<%=path%>/user/index">所有用户</a></li>
                        <li class="active"><a href="<%=path%>/user/create">添加用户</a></li>
                    </ul>
                    <div class="tab-content">
                        <div class="tab-pane active">
                            <div class="panel-body">
                                <form method="post" class="form-horizontal custom-form" id="userForm" autocomplete="off" action="<%=path%>/user/update">
                                    <input type="hidden" name="userId"/>
                                    <div class="form-row">
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label"><span class="required">*</span>用户名:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" name="loginAccount" placeholder=""/>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-row">
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label"><span class="required">*</span>昵称:</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" name="nickName" placeholder=""/>
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
        $('#userForm').validate({submitHandler: function (form) {
            $(form).ajaxForm();
        }});

        $('[data-role="datetimepicker"]').datetimepicker({
            lang: 'ch',
            step: 10,
            format: "Y-m-d H:i"
        });

        $('#userForm').autofill(json);
    });
</script>
</body>
</html>

