<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<rapid:override name="title">用户管理</rapid:override>
<rapid:override name="head">

</rapid:override>
<rapid:override name="content">
    <div class="gray-bg">
        <div class="wrapper wrapper-content animated fadeInRight">
            <div class="ibox">
                <div class="ibox-title">
                    <h5>用户管理</h5>
                </div>
                <div class="ibox-content">
                    <div id="toolbar">
                        <div class="btn-toolbar pull-right">
                            <div class="btn-group">
                                <button class="btn btn-white" data-role="refresh"><i class="fa fa-refresh fa-fw"></i>刷新</button>
                                <button class="btn btn-primary" data-role="dialog" data-url="<%=request.getContextPath()%>/user/create" data-width="700px" data-height="600px"><i class="fa fa-plus fa-fw"></i>新增</button>
                                <button class="btn btn-danger" data-role="remove"><i class="fa fa-trash-o fa-fw"></i>删除</button>
                            </div>
                        </div>
                    </div>
                    <table class="table table-bordered"
                           data-url="<%=request.getContextPath()%>/user"
                           data-role="table"
                           data-id-field="userId"
                           data-params='{"userType":"0"}'>
                        <thead>
                        <tr>
                            <th data-checkbox="true"></th>
                            <th data-field="loginAccount" data-sortable="true" data-width="150">用户名</th>
                            <th data-field="nickName" data-sortable="true" data-width="100" data-title-tooltip="value">昵称</th>
                            <th data-field="bindEmail" data-sortable="true" data-width="150">邮箱</th>
                            <th data-field="bindMobile" data-sortable="true" data-width="150" class="text-center">手机号码</th>
                            <th data-field="userState" data-sortable="true" data-width="100" data-formatter="userStateFormat" class="text-center">状态</th>
                            <th data-field="registerTime" data-sortable="true" data-width="150" class="text-center" data-formatter="formatter.date">注册时间</th>
                            <th data-field="operate" data-width="200">操作</th>
                        </tr>
                        </thead>
                    </table>
                </div>
            </div>
        </div>
    </div>
</rapid:override>
<rapid:override name="js">
    <script>

        function userStateFormat(value, row, index) {
            var array = [
                '<span class="badge badge-primary">正常</span>',
                '<span class="badge badge-danger">冻结</span>'
            ];
            return array[value];
        }


        require(['jquery', 'table'], function ($, bootstrapTable, dialog) {
            bootstrapTable('table[data-role="table"]');
        });

    </script>
</rapid:override>
<%@ include file="../layout/innerMasterPage.jsp" %>
