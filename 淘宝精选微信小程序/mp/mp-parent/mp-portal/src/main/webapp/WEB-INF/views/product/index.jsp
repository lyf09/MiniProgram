<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="rapid" uri="http://www.rapid-framework.org.cn/rapid" %>
<rapid:override name="title"> </rapid:override>
<rapid:override name="head">

</rapid:override>
<rapid:override name="content">
    <div class="gray-bg">
        <div class="wrapper wrapper-content animated fadeInRight">
            <div class="ibox">
                <div class="ibox-title">
                    <h5>商品管理</h5>
                </div>
                <div class="ibox-content">
                    <div id="toolbar">
                        <div class="btn-toolbar pull-right">
                            <div class="btn-group">
                                <button class="btn btn-white" data-role="refresh"><i class="fa fa-refresh fa-fw"></i>刷新</button>
                                <button class="btn btn-primary" data-role="dialog" data-url="<%=request.getContextPath()%>/product/create" data-width="700px" data-height="600px"><i class="fa fa-plus fa-fw"></i>新增</button>
                                <button class="btn btn-danger" data-role="remove"><i class="fa fa-trash-o fa-fw"></i>删除</button>
                            </div>
                        </div>
                    </div>
                    <table class="table table-bordered"
                           data-url="<%=request.getContextPath()%>/product"
                           data-role="table"
                           data-id-field="productId">
                        <thead>
                        <tr>
                            <th data-checkbox="true"></th>
                            <th data-field="productTitle" data-sortable="true" data-width="300"
                                data-id="productId">商品标题
                            </th>
                            <th class="text-right" data-field="marketPrice" data-sortable="true" data-width="80" data-formatter="formatter.currency">市场价</th>
                            <th class="text-right" data-field="finalPrice" data-sortable="true" data-width="80" data-formatter="formatter.currency">折扣价</th>
                            <th data-field="categoryTitle" data-sortable="true" data-width="150">分类
                            </th>
                            <th data-field="shopTitle" data-sortable="true" data-width="100">店铺名称
                            </th>
                            <th data-field="volume" data-sortable="true" data-width="80">月销量</th>
                            <th data-field="itemUrl" data-sortable="true" data-width="150" data-formatter="formatter.link">宝贝地址</th>
                            <th class="text-center" data-field="createTime" data-sortable="true" data-width="150" data-formatter="formatter.date">添加时间
                            </th>
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
        function categoryFormat(value, row, index) {

            var array = [];
            for (index in value) {
                array.push('<span class="badge badge-primary">' + value[index].title + '</span>');
            }
            return array.join('');
        }

        function linkFormat(value, row, index) {
            var array = [
                '<a href="' + this.prefix + row[this.id] + '">' + value + '</a>'
            ];
            return array.join('');
        }

        require(['jquery', 'table'], function ($, bootstrapTable, dialog) {
            bootstrapTable('table[data-role="table"]');
        });
    </script>
</rapid:override>
<%@ include file="../layout/innerMasterPage.jsp" %>
