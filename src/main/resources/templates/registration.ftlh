<!DOCTYPE html>
<html>
<head>
    <title>MARKET PLACE</title>
</head>
<body>
<h1>MARKET PLACE</h1><hr>
<h4>Registration</h4>
<form action="/registration" method="post">
    User name: <input type="text" name="name"><br><br>
    Email: <input type="email" name="email"><br><br>
    Phone number: <input type="text" name="phone"><br><br>
    Password: <input type="password" name="password"><br><br>
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="registration"/>
</form>
<#if errorMessage??>
    <h2 style="color: red">${errorMessage}"</h2>
</#if>
</body>
</html>