require.config({
    baseUrl: '/mp-portal/assets/',
    waitSeconds: 5,
    // urlArgs: 'r=' + (new Date()).getTime(),
    paths: {
        'css': 'lib/requireJs/css.min',
        'bootstrap': 'lib/bootstrap/bootstrap.min',
        'jquery': 'lib/jquery/jquery.min',
        'adminlte': 'lib/adminlte/adminlte.min',

        //配置完成的模块
        'validation': 'modules/jquery.validation/validation',
        'form': 'modules/jquery.ajaxForm/form',
        'tabs': 'modules/bootstrap.tabs/tabs',
        'table': 'modules/bootstrap.table/table',
        'datetimepicker': 'modules/jquery.datetimepicker/datetimepicker',
        'formfill': 'lib/jquery.formfill/jquery.formfill',
        'dialog': 'modules/common.utils/dialog',
        'jquery-mousewheel': 'https://cdn.bootcss.com/jquery-mousewheel/3.1.13/jquery.mousewheel.min',

        'bootstrap.table': 'lib/bootstrap.table/bootstrap-table.min',
        'bootstrap.table.lang': 'lib/bootstrap.table/bootstrap-table-locale-all.min',
        'bootstrap.tabs': 'lib/bootstrap.tabs/multitabs.min',
        'ueditor': 'lib/ueditor/ueditor.all.min',


        'select2': '/static/lib/select2/select2.min',
        'layer': 'lib/layer/layer',
        'app': '/static/modules/cloud/app'
    },
    shim: {
        'adminlte': {
            deps: ['jquery'],
            exports: "$"
        },
        'bootstrap': {
            deps: ['jquery']
        },
        'bootstrap.table': {
            deps: ['css!lib/bootstrap.table/bootstrap-table.min.css', 'jquery', 'bootstrap'],
            exports: '$.fn.bootstrapTable'
        },
        'bootstrap.table.lang': {
            deps: ['bootstrap.table'],
            exports: '$.fn.bootstrapTable.defaults'
        },
        'bootstrap.tabs': {
            deps: ['jquery'],
            exports: '$'
        },
        'layer': {
            deps: ['jquery', 'css!lib/layer/theme/default/layer.css'],
            exports: 'layer'
        },
        'ueditor': {
            deps: ['lib/ueditor/third-party/zeroclipboard/ZeroClipboard.min', 'lib/ueditor/ueditor.config'],
            exports: 'UE',
            init: function (ZeroClipboard) {
                window.ZeroClipboard = ZeroClipboard;
            }
        },


        'select2': {
            deps: ['jquery', 'css!/static/lib/select2/css/select2.min.css', 'css!/static/lib/select2/css/select2-bootstrap.min.css']
        }
    }
});

require(['modules/common.utils/utils', 'layer']);

// require(['jquery'], function ($) {
//     $(document).on('click', 'a[data-role="multitabs"]', function (e) {
//         var that = $(this);
//         console.log(that);
//         e.preventDefault();
//         parent.$(parent.document).data('multitabs').create({
//             iframe: true,
//             title: that.data('title') || 'xxx',
//             url: that.data('url')
//         }, true);
//     })
// });



