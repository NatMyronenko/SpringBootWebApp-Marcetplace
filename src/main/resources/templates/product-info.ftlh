<!DOCTYPE html>
<html>
<head>
    <title>MARKET PLACE</title>
</head>
<body>
<h1>MARKET PLACE</h1><hr>
<h4>Product details</h4>
<#list images as img>
    <img src="/images/${img.id}" height="60px"/> <br><br>
</#list>
<b>Name product:</b>${product.title}<br>
<b>Description of product:</b>${product.description}<br>
<b>Price product:</b>${product.price}<br>
<b>City:</b>${product.city}<br>
<b>Author:</b>${product.user.name}<br>
<b>Phone number:</b>${product.user.phone}<br>
</form>
</body>
</html>