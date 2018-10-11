<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<%
    request.setAttribute("path", request.getContextPath());
%>

<rapid:override name="title">登录</rapid:override>
<rapid:override name="head">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/login.css">
</rapid:override>
<rapid:override name="content">
    <div class="signin">
        <div class="signinpanel">
            <div class="row">
                <div class="col-sm-6 col-sm-offset-3">
                    <div class="login-box">
                        <div class="login-box-body">
                            <form action="<%=request.getContextPath()%>/login" method="post" id="loginForm" data-params='{"x":"xxx"}'>
                                <p class="login-box-msg">登录管理中心</p>
                                <div class="form-group has-feedback">
                                    <input type="text" class="form-control" placeholder="请输入登录帐号" name="loginAccount" required data-msg-required="请填写">
                                    <span class="fa fa-user form-control-feedback"></span>
                                </div>
                                <div class="form-group has-feedback">
                                    <input type="password" class="form-control" placeholder="请输入密码" name="loginPassword" required>
                                    <span class="fa fa-lock form-control-feedback"></span>
                                </div>
                         <%--       <div class="form-group has-captcha row">
                                    <div class="col-xs-7 ">
                                        <input type="text" class="form-control" placeholder="请输入验证码" name="captcha"
                                               required data-msg-required="请填写验证码"
                                               data-rule-number="true" data-msg-number="验证码为数字"
                                               minlength="4" data-msg-minlength="最少四位"
                                               maxlength="4" data-msg-maxlength="最多四位">
                                        <span class="fa fa-lock form-control-feedback"></span>
                                    </div>
                                    <div class="col-xs-5">
                                        <img id="captcha" src="<%=request.getContextPath()%>/captcha" alt="验证码" data-src="<%=request.getContextPath()%>/captcha" class="captcha" title="点击切换验证码" onclick="captcha();"/>
                                    </div>
                                </div>--%>
                                <div class="row">
                                    <div class="col-xs-8">
                                        <div class="checkbox">
                                            <label>
                                                <input type="checkbox" name="remember" checked value="1">记住登录
                                            </label>
                                        </div>
                                    </div>
                                    <div class="col-xs-4">
                                        <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <div class="signup-footer">
                <div class="pull-left">&copy; 2018</div>
            </div>
        </div>

    </div>
</rapid:override>
<rapid:override name="js">
<script>
    //表单验证提交
    require(['validation', 'form'], function ($) {
        $('#loginForm').validate({
            submitHandler: function (form) {
                $(form).ajaxForm();
            }
        });
    });

    //切换验证码
    function captcha(response) {
        var that = $('#captcha');
        var src = that.data('src') + '?random=' + Math.random();
        that.attr('src', src);
    }
</script>
</rapid:override>
<%@ include file="layout/masterPage.jsp" %>
