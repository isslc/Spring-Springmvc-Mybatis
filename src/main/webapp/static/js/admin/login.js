
$(function () {
    var path = $("body").attr("path");
    $(".login-button").click(function () {
        $.ajax({
            url: path + '/user/login.do',
            type: "POST",
            data: {name: $("#name").val(), password: $("#password").val()},
            success: function (results) {
                var json = JSON.parse(results);
                if (json.success) {
                    alert(json.data);
                } else {
                    window.location.href = path + "admin/admin.html";
                }
            }

        });
    })
})