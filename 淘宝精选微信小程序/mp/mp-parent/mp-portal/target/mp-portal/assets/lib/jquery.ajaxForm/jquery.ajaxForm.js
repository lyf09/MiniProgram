;(function (factory) {
    if (typeof define === "function" && define.amd) {
        // AMD模式
        define(["jquery", "layer"], factory);
    } else {
        // 全局模式
        factory(jQuery);
    }
}(function ($, layer) {

    if (typeof layer === 'undefined') {
        throw new Error('The plugins "layer" must be included first!');
    }


    function AjaxForm(el, options) {
        this.el = $(el);
        this.layerIndex = null;
        var defaults = {
            url: '',　　　　　　       //form提交数据的地址
            type: 'POST',　　　           //form提交的方式(method:post/get)
            before: function () {
            },　　  //提交前执行的回调函数
            success: function () {
            },　　 //提交成功后执行的回调函数
            error: function () {
            },       //提交失败执行的函数
            complete: function () {
            },     //请求完成回调函数
            dataType: 'json',　　　　　　//服务器返回数据类型
            timeout: 6000,　　　　　 　 //设置请求时间，超过该时间后，自动退出请求，单位(毫秒)。　　
            params: {},
            errorMsg: "服务器开小差了,请稍后再试."
        };
        var dataOptions = this.el.data();
        this.options = $.extend(defaults, dataOptions, options);
        this.request();
    }


    //发起请求
    AjaxForm.prototype.request = function () {
        var that = this;
        var options = that.options;
        var $form = that.el;
        var postData = $.param(options.params) ? $form.serialize() + '&' + $.param(options.params) : $form.serialize();
        var ajaxOptions = {
            url: options.url || $form.attr('action'),
            type: options.type || $form.attr('method'),
            data: postData,
            cache: false,
            dataType: options.dataType,
            timeout: options.timeout,
            //准备发送请求
            beforeSend: function () {
                if (options.before.call() !== false) {
                    that.layerIndex = layer.load(1);
                }
            },
            //请求成功
            success: function (response) {
                if (options.success.call(this, response) !== false) {
                    that.handleJsonResponse(response);
                }
            },
            //请求错误 弹出错误提示
            error: function (response) {
                //只有在回调函数返回false时才会停止默认的提示操作
                if (options.error.call(this, response) !== false) {
                    layer.alert(options.errorMsg, {icon: 5});
                }
            },
            //请求完成 关闭loading
            complete: function (xhr, statusText) {
                if (options.complete.call(this, xhr, statusText) !== false) {
                    layer.close(that.layerIndex);
                }
            }
        };

        $.ajax(ajaxOptions);
    };

    //默认的JSON回调函数
    AjaxForm.prototype.handleJsonResponse = function (response) {
        if ($.isPlainObject(response)) {
            switch (response.code) {
                case 200 :
                    layer.msg(response.msg, {icon: 1});
                    break;
                case 301 :
                    layer.msg(response.msg, {icon: 1}, function () {
                        location.href = response.url;
                    });
                    break;
                case 401 :
                    alert("401");
                    break;
                case 409 :
                    layer.msg(response.msg, {icon: 3});
                    ;
                    break;
                case 500 :
                    layer.alert(response.msg, {icon: 5});
                    break;
                default :
                    alert("default response");
                    break;
            }
            //执行服务端要求前端需要执行的方法
            try {
                if (response.fn !== undefined) {
                    eval(response.fn).call(window, response);
                }
            } catch (ex) {

            }
        } else {
            layer.alert(response, {icon: 5});
        }

    };

    $.fn.ajaxForm = function (options) {
        return this.each(function () {
                return new AjaxForm($(this), options);
            }
        );
    };
}));