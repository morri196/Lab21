<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="/style.css"/>

<title>Coffee Shop</title>
</head>

<body style="text-align: center"> <!-- this centers the entire page -->

<div class="container">
	<h1>Welcome to Grand Circus Coffee Shop <button class="btn">
	<a href="/user-registration"> Register!</a></button></h1> 
	<!-- </div>
	<img src="https://www.nuggetmarket.com/img/special-diets/USDOR.png">
	
	</div>-->
	<table>
	<tr>
	<th>ID</th><th>Name</th><th>Description</th><th>Quantity</th><th>Price</th>
	</tr>
	
	<c:forEach var="item" items="${items}">
	<tr>
 	<td> ${item.id} </td>
 	
    <td> ${item.name} </td>
 
 	<td> ${item.description} </td>
  
    <td> ${item.quantity} </td>
 
    <td> ${item.price} </td>
    </tr>
	</c:forEach>
	
	</table>
   </div> 
   
</body>
</html>