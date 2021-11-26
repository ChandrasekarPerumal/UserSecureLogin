<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style>




.form1 {
    background-color: rgb(200, 216, 252);
    padding: 60px;
    text-align: left;
    margin: auto;
    display: table;
}

input{
  direction: ltr; 
}
</style>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>

		<form class="form1" action="userValidate" method="post">
			<div class="form-group">
			    <label for="exampleInputEmail1">Email address</label>
			    <input type="email" class="form-control" name="eid"   placeholder="Enter email">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputPassword1">Password</label>
			    <input type="password" class="form-control" name="pwd"  placeholder="Password">
			  </div>
			
			  <button type="submit" class="btn btn-primary">Submit</button>	
			  
		</form>



</body>
</html>