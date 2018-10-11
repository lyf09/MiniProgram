define(['jquery', 'bootstrap.table', 'bootstrap.table.lang', 'modules/bootstrap.table/formatter'], function($) {
        var defaults = {
            height: 720,          //表格高度
            search: true,         //开启搜索
            undefinedText: '',    //空列显示字符
            striped: true,        //隔行变色
            buttonsAlign: 'left',     //按钮组所在位置
            toolbar: '#toolbar',      //工具栏选择器
            method: 'GET',          //请求方式
            cache: false,           //ajax请求缓存
            pagination: true,       //分页条
            paginationLoop: false,   //循环分页
            sidePagination: 'server', //服务端分页
            pageSize: 15,              //默认分页大小
            pageList: [15, 30, 50, 100],  //分页大小选择
            escape: true,             //转义
            searchOnEnterKey: true,   //回车搜索
            trimOnSearch: true,        //去掉搜索前后空格
            showRefresh: false,         //显示刷新按钮
            showColumn: false,        //列选择显示
            sortName: 'createTime',     //默认排序列
            sortable: true,
            sortOrder: 'desc',      //默认排序规则
            locale: 'zh-CN',
            selectItemName: 'id',
            paginationPreText: '上一页',
            paginationNextText: '下一页',
            responseHandler: function (res) {
                return {
                    rows: res.results,
                    total: res.totalCount
                };
            },
            queryParams: function (params) {
                var queryParams = {
                    pageIndex: parseInt(params.offset / params.limit) + 1,
                    keywords: params.search,
                    pageSize: params.limit,
                    orderBy: params.sort,
                    sort: params.order
                };

                if($.isPlainObject(this.params)){
                    queryParams = $.extend(queryParams, this.params);
                }
                return queryParams;
            }
        };
        //列默认配置
        var columnDefaults = {
            valign: 'middle',   //垂直居中
            sortable: false,      //开启排序
            order: 'desc',      //默认降序排列
            escape: true,       //开启转义
        };
        //合并配置
        $.extend(true, $.fn.bootstrapTable.defaults, defaults);
        $.extend($.fn.bootstrapTable.columnDefaults, columnDefaults, columnDefaults);
        $.extend($.fn.bootstrapTable.locales[defaults.locale]);




        function bootstrapTable(e) {
            var table =  $(e).bootstrapTable();
            //刷新按钮事件
            $(defaults.toolbar).on('click', '[data-role="refresh"]', function () {
                table.bootstrapTable('refresh');
            });

            //添加按钮事件
            $(defaults.toolbar).on('click', '[data-role="dialog"]', function () {
                var options = $(this).data();
                console.log(options);
                require(['dialog'], function (dialog) {
                    dialog.open(options.title, options.url, [options.width, options.height], function (index, d) {

                        console.log(d);
                        console.log(dialog.get(d));

                        // top.layer.close(index);
                    }, function () {
                        table.bootstrapTable('refresh');
                    });
                })
            });

            //删除按钮事件
            $(defaults.toolbar).on('click', '[data-role="remove"]', function () {
                table.bootstrapTable('refresh');
            });

            return table;
        }

        return bootstrapTable;
    }
);