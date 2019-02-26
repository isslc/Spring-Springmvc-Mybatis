<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>博客首页</h2>
<form>
    username: <input type="text" name="username" id="in">
    <br>

    <div id="message"></div>
</form>
<button id="button">测试1</button>
<a href="${pageContext.request.contextPath}/admin/admin.html">Test</a>
<a href="${pageContext.request.contextPath}/login.html">Test</a>
<%--<a href="${pageContext.request.contextPath}/jsp/hello.html">Test</a>
<br>
<a href="${pageContext.request.contextPath}/jsp/ceshi.html">Test2</a>
<div id="div"></div>--%>
<p>111</p>
</body>

<script type="text/javascript" src="static/js/jquery.js"></script>
</html>
<script>
    $(function () {
        $(":input[name='username']").change(function () {
            var val=$("#in").val();
            val=$.trim(val);
            if (val!=null){
                var url="${pageContext.request.contextPath}/info?name="+val;
                $.post(url,function (result) {
                    $("#message").html(result);
                })
            }
        })
    });
    function inittiain() {
        $("#button").click(
            function () {
                $.ajax({
                    url: "${pageContext.request.contextPath}/hello",
                    type: 'get',
                    async: true,
                    cache: false,
                    contentType: false,
                    processData: false,
                    success: function (result) {
                        var json = JSON.parse(result);
                        console.log(json)
                        $("p").text(json.data.name)
                        $("#div").html(json.data)
                    },
                    error: function (result) {

                    }
                });
            }
        );
    };

    inittiain();
</script>
