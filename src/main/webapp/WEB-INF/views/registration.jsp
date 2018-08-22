<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/style.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>coffee shop registration page</title>
</head>
<body>
<main class= container>
<form action="/summary-page" method="post"> <!-- GET/POST: Get is default. Post will clear out the URL -->
<p>
First Name:<input type="text" name="firstname" required minlength="2"maxlength="16"/><!-- max & min length will set requirements on user input -->
</p>
<p>
Last Name:<input type ="text" name="lastname"required minlength="2"maxlength="16">
</p>
<p>
email:<input type= "email" name="email">
</p>
<p>
Phone Number:<input name="phonenumber" type="tel"/>
</p>
<p>
Password (First letter must be capitalized(can contain numbers)):<input name="password"type="password" required pattern="[A-Z][a-z0-9]*" >
</p>
<p>
Re-Enter Password (First letter must be capitalized(can contain numbers)):<input name="password2"type="password" required pattern="[A-Z][a-z0-9]*" >
</p>
<p>
             <label>How often do you drink coffee per week?</label>
             <select id = "myList">
               <option value = "1">1-2cups</option>
               <option value = "2">2-4cups</option>
               <option value = "3">4-6cups</option>
               <option value = "4">6+ cups</option>
             </select>
          </p>
<p>
	<button type="submit" class="btn btn-primary">Submit</button>
	</p>
</form>
</body>
</html>