<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"  type ="text/css" href="./stylesheets/mystyle.css"  />
<script type="text/javascript" src="./script/myscript.js"></script> 
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Weather Fore Cast</h1>
<fieldset  align="center">
<form action="#" name=" myform">
<label for="cityname" id="cityname">CityName</label>
<input type="text" id= "city" />
<br>
<label for="cityname" id="countryname">CountryName</label>
<input type="text" id= "country"/> 
<br/>
<input type="button" value="Show me Weather" id="mybutton" onclick="weather()"> 
</form>
</fieldset>
<div id= "output"></div>
</body>
</html>