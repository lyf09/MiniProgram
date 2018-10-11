define(['jquery', 'lib/jquery.validation/jquery.validate.min', 'lib/jquery.validation/localization/messages_zh.min'], function($) {
    $.validator.setDefaults({
        highlight: function(e) {
            $(e).closest(".form-group").removeClass("has-success").addClass("has-error")
        },
        success: function(e) {
            e.closest(".form-group").removeClass("has-error").addClass("has-success")
        },
        errorElement: "span",
        errorPlacement: function(e, r) {
            e.appendTo(r.is(":radio") || r.is(":checkbox") ? r.parent().parent().parent() : r.parent())
        },
        errorClass: "help-block m-t-none m-b-none",
        validClass: "help-block m-t-none m-b-none"
    });
    return $;
    }
);