<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<div class="clickables">		
			<button onclick="showDiv('view')">View</button>
			<button onclick="showDiv('create')">Create</button>
  			<button onclick="showDiv('search')">Search</button>
  			<button onclick="showDiv('update')">Update</button>
  			<button onclick="showDiv('delete')">Delete</button>
		</div>
		
		<div id="create" class="create divs">
		<form class="inputarea" method="post" action="submitEmployee.jsp">		
			<label> NIC:<input type="text" name="nic" placeholder="Enter NIC number" required/></label>
			<label> Name:<input type="text" name="name" placeholder="Enter full name" required/></label>
			<label> Department:<input type="text" name="department" placeholder="Enter department name" required/></label>
			<label> Designation:<input type="text" name="designation" placeholder="Enter job title" required/></label>
			<label> Joined Date:<input type="text" name="date" placeholder="Enter date of joining" required/></label>
			<input type="submit" class="clicks" value="Create">
		</form>		
		</div>
		
		<div id="update" class="update divs">
		<form class="inputarea" method="post" action="updateEmployee.jsp">		    
		    <label>NIC:<input type="text" name="nic" placeholder="Enter NIC number to search" required/></label>
		    <label>Updated Name:<input type="text" name="name" placeholder="Enter updated full name" required/></label>
		    <label>Updated Department:<input type="text" name="department" placeholder="Enter updated department name" required/></label>
		    <label>Updated Designation:<input type="text" name="designation" placeholder="Enter updated job title" required/></label>
		    <label>Updated Joined Date:<input type="text" name="date" placeholder="Enter updated date of joining" required/></label>
		    <input type="submit" class="clicks" value="Update">
		</form>		
		</div>	
		<div id="search" class="search divs">
		<form class="inputarea search" method="get" action="searchEmployee.jsp">
		    <label>Search by NIC:<input type="text" name="nic" placeholder="Enter employee NIC number" required/></label>
		    <input type="submit" class="clicks" value="Search">
		</form>		
		</div>	
		
		<div id="delete" class="delete divs">
		<form class="inputarea delete" method="post" action="deleteEmployee.jsp">
		    <label>Employee NIC:<input type="text" name="employeeId" placeholder="Enter employee ID" required/></label>
		    <input type="submit" class="clicks" value="Delete">
		</form>		
		</div>	
		
		<div id="view" class="view divs">
		<form class="inputarea view" method="post" action="deleteEmployee.jsp">
		    table goes here
		</form>		
		</div>		
		
		
		
		
			
	</div>		
	<footer>
	
	</footer>
	<script src="./script.js"></script>
	</body>
</html>
