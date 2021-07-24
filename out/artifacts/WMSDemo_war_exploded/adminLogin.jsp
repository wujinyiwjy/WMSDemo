<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/admin/login" method="post">
    <input type="text" id="adminname" value="adminname" placeholder="adminname">
    <input type="password" id="password" value="password" placeholder="password">
    <button type="submit">Submit</button>
</form>
</body>
</html>