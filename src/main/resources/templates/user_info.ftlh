<!DOCTYPE html>
<html>
<head>
    <title>MARKET PLACE</title>
</head>
<body>
<h1>MARKET PLACE</h1><hr>
<h3>Detail information about user ${user.name}</h3>
<b>Phone number: </b> ${user.phone}<br>
<b>Email: </b> ${user.email}<br>
<h4>User's orders ${user.name}</h4>
<#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.price} руб. | <a href="/product/${product.id}">Подробнее...</a></p>
    </div>
<#else>
    <h3>No orders</h3>
</#list>
<#if errorMessage??>
    <h2 style="color: red">${errorMessage}</h2>
</#if>
</body>
</html>