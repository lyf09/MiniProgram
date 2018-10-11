define([
        'jquery',
        'jquery-mousewheel',
        'lib/jquery.datetimepicker/jquery.datetimepicker.full.min',
        'css!lib/jquery.datetimepicker/jquery.datetimepicker.min.css'
    ], function($) {
        $.datetimepicker.setLocale('ch');
        return $;
    }
);