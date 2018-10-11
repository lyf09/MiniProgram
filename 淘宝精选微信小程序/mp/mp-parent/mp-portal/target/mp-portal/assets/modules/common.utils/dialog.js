define(['jquery', 'layer'], function ($, layer) {
        //弹出层公共方法
        function open(title, url, area, onConfirmCallback, onCloseCallback) {
            layer.open({
                type: 2,
                title: title,
                area: area,
                fixed: true,
                maxmin: true,
                content: url,
                btn: ['确定', '取消'],
                yes: onConfirmCallback,
                // closeBtn: 0,
                btn2: onCloseCallback,
                cancel: onCloseCallback
            });
        }

        //获取iframe窗口对象
        function get(dialog) {
            alert();
            try {
                var windowName = dialog.find('iframe[name]').attr('name');
                return eval("window['" + windowName + "']");
            }
            catch (ex) {
                return null;
            }
        }

        return {
            open: open,
            get: get
        };
    }
);