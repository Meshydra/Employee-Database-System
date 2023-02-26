<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Employee Database System</title>
		<link rel="stylesheet" href="style.css">
		<link rel="icon" type="image/png" href="res/icon.png">
	</head>
	<body>
	<div class="nav">
			<h1>Employee Database</h1>
		</div>
	<div class="container">	
	<img class ="main-pic" src="res/welcome.png" alt="welcome"> <!-- Picture taken from Dreamstime -->
		
		<form class="clickables" action="viewEmployees" method="GET">
		<a href="dashboard.">	
			<button type="submit">Start</button> <!-- Redirects to the opening servlet which will fill the table -->
		</a>	
		</form>
		
	</div>
	<footer>
	Created by Meshith Ariyawansa For EAD CW2
	</footer>

</body>
</html>