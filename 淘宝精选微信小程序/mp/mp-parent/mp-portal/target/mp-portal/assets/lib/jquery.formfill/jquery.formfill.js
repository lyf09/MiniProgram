;(function (factory) {
    if (typeof define === "function" && define.amd) {
        // AMD模式
        define(["jquery"], factory);
    } else {
        // 全局模式
        factory(jQuery);
    }
}(function ($) {
    
    function Autofill(element, data, options) {
        this.data = data;
        this.$element = $(element);
        this.options = $.extend({}, Autofill.DEFAULTS, options || {});
        this.fillData = $.extend(data, this.options.extData);
        this.init();
    }

    //默认配置
    Autofill.DEFAULTS = {
        before: null,
        complete: null,
        extData: {},
        fillTag: ['img']
    };

    Autofill.prototype = {
        //初始化
        init: function () {
            if (this.options.before != null) {
                this.fillData = this.before(this.data);
            }
            this.fill();
        },

        //处理数据函数 多用来格式化数据 可自定义
        before: function (data) {
            return this.options.before(data);
        },

        //填充数据主要函数
        fill: function () {
            var data = this.fillData;

            var that = this.$element;
            var options = this.options;

            $.each(data, function (key, value) {
                var selector, elt;
                selector = '[name="' + key + '"]';
                elt = that.find(selector);

                if (elt.length == 1) {
                    elt.val((elt.attr("type") == "checkbox") ? [value] : value);
                }
                else if (elt.length > 1) {
                    elt.val(value);
                }
                else {
                    //带[]的checkbox
                    selector = '[name="' + key + '[]"]';
                    elt = that.find(selector);
                    elt.each(function () {
                        $(this).val(value);
                    });

                    //自定义填充的标签
                    selector = '[data-fill="' + key + '"]';

                    elt = that.find(selector);
                    elt.each(function () {
                        var $this = $(this);
                        var tagName = $this.get(0).tagName.toLowerCase();
                        ($.inArray(tagName, options.fillTag) != -1) ? $(this).attr('src', value) : $(this).html(value);
                    });
                }
            })
            this.complete();
        },

        //数据填充完成回调函数
        complete: function () {
            if (this.options.complete != null) {
                this.options.complete(this.fillData);
            }
        }
    };


    $.fn.autofill = function (data, options) {
        return this.each(function () {
            var $this = $(this);
            return new Autofill($this, data, options);
        });
    }
}));