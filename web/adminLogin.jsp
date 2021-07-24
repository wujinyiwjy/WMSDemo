<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>管理员登录</title>
</head>
<style>
    body {
        background-image: url(img/阳光.jpg);
    }

    .thick-black-border {
        border-color: black;
        border-width: 1px;
        border-style: solid;
        width: 300px;
        height: 300px;
        border-radius: 5px;
        background-color: whitesmoke;
        padding-top: 30px;
        margin: 580px;
        margin-top: 100px;
        opacity: 0.5;
    }

    .thick-green-border {
        border-color: greenyellow;
        border-width: 2px;
        border-height: 5px;
        border-radius: 5px;
        background-color: aquamarine;
        margin-bottom: 30px;
        border-style: solid
    }

    .thick-red-border {
        border-color: yellow;
        border-width: 2px;
        border-height: 5px;
        border-radius: 5px;
        background-color: antiquewhite;
        margin-bottom: auto);
        border-style: solid;
    }

    .thick-pink-border {
        border-color: pink;
        border-width: 5px;
        border-height: 5px;
        border-radius: 5px;
        background-color: pink;
        margin-bottom: auto;
        border-style: solid;
    }

    h1 {
        font-size: smaller;
    }

    .thick-blue-border {
        border-color: skyblue;
        border-width: 5px;
        border-height: 5px;
        border-radius: 5px;
        background-color: cornflowerblue;
        margin-bottom: auto;
        border-style: solid;
    }

    .thick-pink-border {
        border-color: pink;
        border-width: 5px;
        border-height: 5px;
        border-radius: 5px;
        background-color: pink;
        margin-bottom: auto;
        border-style: solid;

    }
    }
</style>

<body>
<form align="center" class="thick-black-border">
    <p align="center">登录</p>
    <p> <label>用户名<input class="thick-green-border" type="text" id="adminname" value="adminname"
                         placeholder="adminname">
    </label></p>

    <label> 密&nbsp;&nbsp;码</label>
    <input class="thick-green-border" type="password" id="password" value="password"
    placeholder="password">
    <h1><label>
        <input type="radio" name="记住密码">记住密码
    </label></h1>
    <h1><label>
        <input type="radio">我已同意该条款
    </label></h1>
    <button class="thick-blue-border"
            type="&nbsp;登录&nbsp;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;登录&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</button>
</form>

</body>

</html>