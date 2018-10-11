<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<rapid:override name="title">添加用户</rapid:override>
<rapid:override name="head">

</rapid:override>
<rapid:override name="content">
    <div class="gray-bg">
        <div class="wrapper wrapper-content animated fadeInRight">
            <div class="ibox">
                <div class="ibox-title">
                    <h5>添加用户</h5>
                </div>
                <div class="ibox-content no-padding">
                    <form method="post" class="form-horizontal custom-form" id="userForm" autocomplete="off"
                          action="<%=request.getContextPath()%>/user/create">
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
                                <label class="col-sm-2 control-label"><span class="required">*</span>密码:</label>
                                <div class="col-sm-10">
                                    <input type="password" class="form-control" name="loginPassword" id="loginPassword"/>
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
                                    <input type="text" class="form-control" name="bindEmail"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">手机号码:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="bindMobile"/>
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="form-group">
                                <label class="col-sm-2 control-label">注册时间:</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="registerTime" data-role="datetimepicker"/>
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

</rapid:override>
<rapid:override name="js">
    <script>
        //表单验证提交
        require(['validation', 'form', 'datetimepicker'], function ($) {
            $('#userForm').validate({
                submitHandler: function (form) {
                    $(form).ajaxForm();
                }
            });

            $('[data-role="datetimepicker"]').datetimepicker({
                lang: 'ch',
                step: 10,
                format: "Y-m-d H:i"
            });
        });
    </script>
</rapid:override>
<%@ include file="../layout/innerMasterPage.jsp" %>

