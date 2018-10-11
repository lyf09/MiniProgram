define(function (require, exports, module) {
    var formatter = {
        uppercase: function (value, row, index) {
            return value.toUpperCase()
        },
        lowercase: function (value, row, index) {
            return value.toLowerCase()
        },
        link: function (value, row, index) {
            var html = [
                '<div class="input-group input-group-sm" style="width:' + (this.width - 20) + 'px;">',
                '<input class="form-control input-sm" value="' + value + '" type="text">',
                '<span class="input-group-btn input-group-sm">',
                '<a href="' + value + '" target="_blank" class="btn btn-default btn-sm" title="' + value + '">',
                '<i class="fa fa-link"></i>',
                '</a>',
                '</span>',
                '</div>'
            ];
            return html.join('');
        },
        smLink: function (value, row, index) {
            var html = [
                '<a href="' + value + '" target="_blank" class="btn btn-default btn-sm" title="' + value + '">',
                '<i class="fa fa-link"></i>',
                '</a>'
            ];
            return html.join('');
        },
        date:function (value, row, index) {
          var format = this.format || 'yyyy-MM-dd hh:mm';
          return new Date(value).Format(format);
        },
        tab: function (value, row, index) {
            return '<a data-role="multitabs" data-title="' + this.title + '" data-url="' + this.url + row[this.idField] + '">' + value + '</a>';
        },
        currency: function (value, row, index) {
            return '￥' + parseFloat(value).toFixed(2);
        },
        operate: function (value, row, index) {
            return ['<a href="' + row[this.field] + '"></a>'].join();
        },
        userType: function (value, row, index) {
            var x = [
                '<b>普通用户</b>',
                '<b>管理员</b>',
            ];
            return x[value];
        }
    };
    window.formatter = formatter;

    return formatter;
});