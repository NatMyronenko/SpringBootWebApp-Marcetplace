<!DOCTYPE html>
<html>
<head>
    <title>MARKET PLACE</title>
</head>
<body>
<h1>MARKET PLACE |<a href="/login">Enter</a></h1><hr>
<form action="/logout" method="post">
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="submit" value="logout">
</form>
<h4>Products from all Europe</h4>
<form action="/" method="get">
    Search by product name: <input type="text" name="title"><br>
    <input type="submit" value="search"/>
</form>

<#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.price} Eur | <a href="/product/${product.id}">More information... </a></p>
    </div>
</#list>
<hr>
<h3>Create new product</h3>
<form action="/product/create" method="post" enctype="multipart/form-data">
    Title ad: <input type="text" name="title"/><br><br>
    Ad description:<input type="text" name="description"/><br><br>
    Price ad: <input type="number" name="price"/><br><br>
    City ad: <input type="text" name="city"/><br><br>
    First photo: <input type="file" name="file1"/><br><br>
    Second Photo: <input type="file" name="file2"/><br><br>
    Third Photo: <input type="file" name="file3"/><br><br>
    <input type="submit" value="add product"/>
</form>
</body>
</html>