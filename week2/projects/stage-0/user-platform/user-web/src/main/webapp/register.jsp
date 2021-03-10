<html>
<head>
    <jsp:directive.include
            file="/WEB-INF/jsp/prelude/include-head-meta.jspf"/>
    <title>注册</title>
</head>
<body style="padding: 10px;">
<%--<form action="registerd" method="post">--%>
<%--    <table style="margin-left: auto; margin-right: auto;">--%>
<%--        <tr>--%>
<%--            <td align="center">用户名</td>--%>
<%--            <td><input type="text" name="username"/></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td align="center">密码</td>--%>
<%--            <td><input type="password" name="password"/></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td align="center">邮箱</td>--%>
<%--            <td><input type="email" name="email"/></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td align="center">手机</td>--%>
<%--            <td><input type="number" name="phone"/></td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <td colspan="2">--%>
<%--                <div style="display: flex; justify-content: space-around">--%>
<%--                    <input type="submit"/>--%>
<%--                    <input type="reset"/>--%>
<%--                </div>--%>
<%--            </td>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--</form>--%>
<form style="width: 240px; margin: auto;" action="registerd" method="post">
    <input style="display: block; width: 100%; height: 40px;" type="text" name="username" placeholder="用户名"/>
    <input style="display: block; width: 100%; height: 40px;" type="password" name="password" placeholder="密码"/>
    <input style="display: block; width: 100%; height: 40px;" type="email" name="email" placeholder="邮箱"/>
    <input style="display: block; width: 100%; height: 40px;" type="number" name="phone" placeholder="手机"/>
    <div style="margin-top: 20px;display: flex; justify-content: space-around">
        <input type="submit" value="注册"/>
        <input type="reset"/>
    </div>
</form>
</body>
</html>
