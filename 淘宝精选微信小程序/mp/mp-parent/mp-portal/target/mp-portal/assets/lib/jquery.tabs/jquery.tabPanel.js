;(function (factory) {
    if (typeof define === "function" && define.amd) {
        // AMD模式
        define([ "jquery"], factory);
    } else {
        // 全局模式
        factory(jQuery);
    }
}(function ($) {
    function TabPanel(el, options)
    {
        this.el = $(el);
        var defaults = {
            content: '',        //tab内容
            close: true,        //是否允许关闭
            monitor: 'body',    //监听
            nav: '#tab-header',     //tab title存放的地方
            frame: true,        //使用iframe
            tabHeight: $(window).height() - 50, //固定TAB中IFRAME高度,根据需要自己修改
            forceRefresh: false,                //点击后强制刷新对应的iframe
            callback: function () {
                //关闭后回调函数
            }
        };
        this.options = $.extend(defaults, options || {});
        this.init();
    }

    //初始化
    TabPanel.prototype.init = function () {
        var that = this;
        var options = that.options;

        //设置panel显示的高度
        $(that.el).height($(window).height() - 151);
        //添加tab触发事件
        $(options.monitor).on('click', '[data-role="tabs"]', function (e) {
            e.preventDefault();
            var $el = $(this);

            var options = $el.data();
            options.title = options.title || $.trim($el.text());
            options.url = options.url || $.trim($el.attr('href'));
            options.content = options.content || $el.data('content');
            options.ajax = options.ajax || false;
            options.close = options.close || true;
            //修改网页标题
            document.title = options.title;

            //添加一个tab header 和一个tabpenal
            console.log(options);
            that.addTab(options);
        });
        //删除tab触发事件

    };

    //添加一个panel
    TabPanel.prototype.addTab = function (options) {
        var that = this;
        var $nav = $(that.options.nav);
        var $panel = that.el;
        //ul存在
        if($nav.children().first().is('ul')){
            $nav = $nav.children().first();
        }else{
            $nav.append('<ul></ul>');
            $nav = $nav.children().first();
        }
        //头部导航 不存在时添加
        if($nav.find('li[data-url="'+options.url+'"]').length === 0){
            //当前栏
            $nav.children('li').removeClass('active');

            var header = $('<li class="active"></li>');
            header.html(options.title);
            if(options.close){
                var closer = $('<i class="tabs-closer"></i>');
                closer.on('click', function (e) {
                    that.removeTab(e);
                });
                header.append(closer);
            }

            header.attr('data-url', options.url);
            header.on('click', function (e) {
                $panel.find('iframe').hide();
                $panel.find('iframe[data-url="'+$(this).data('url')+'"]').show();
                $nav.children('li').removeClass('active');
                $(this).addClass('active');
            });
            $nav.append(header);
            header.trigger('click');
        }else{
            $nav.find('li[data-url="'+options.url+'"]').trigger('click');
            $panel.find('iframe').hide();
            $panel.find('iframe[data-url="'+options.url+'"]').show();
        }

        //添加iframe 不存在时添加
        if($panel.find('iframe[data-url="'+options.url+'"]').length ===0){
            var panel = $('<iframe border="0" marginwidth="0" marginheight="0" scrolling-x="no" scrolling-y="auto" allowtransparency="yes" width="100%" height="100%" frameborder="no"></iframe>');
            panel.attr('data-url', options.url);
            panel.attr('src', options.url);
            $panel.append(panel);
       }
    };

    TabPanel.prototype.removeTab = function (e) {
        var $header = $(e.target).parent();
        var $panel = this.el;
        var url = $header.data('url');
        $panel.find('iframe[data-url="'+url+'"]').remove();
        $header.remove();
        // console.log(e);
    };


    $.fn.tabPanel = function(options) {
        return this.each(function(){
                return new TabPanel(this, options);
            }
        );
    };
}));