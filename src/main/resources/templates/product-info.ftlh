<!DOCTYPE html>
<html>
<head>
    <title>MARKET PLACE</title>
</head>
<body>
<h1>MARKET PLACE</h1>
<hr>
<h4>Product details</h4>
<b>Name product:</b>${product.title}<br>
<b>Description of product:</b>${product.description}<br>
<b>Price product:</b>${product.price}<br>
<b>City:</b>${product.city}<br>
<b>Author Name:</b>${product.authorName}<br>
<hr>
<h3>Delete product</h3>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="delete"/>
</form>
</body>
</html>