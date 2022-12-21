<!DOCTYPE html>
<html>
<head>
    <title>MARKET PLACE</title>
</head>
<body>
<h1>MARKET PLACE</h1><hr>
<h4>Авторизация</h4>
<form action="/login" method="post">
    Эл. почта: <input type="email" name="username"><br><br>
    Пароль: <input type="password" name="password"><br><br>
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="enter"/>
</form>
<<<<<<< HEAD
<a href="/registration">Зарегистрировать ся</a>
=======
<a href="/registration">Зарегистрироваться</a>
>>>>>>> 6c58955 (updated)
</body>
</html>