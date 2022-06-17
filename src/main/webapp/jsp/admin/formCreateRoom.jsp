<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Room</title>
</head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href='${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css'
	rel='stylesheet' type='text/css' />
<link
	href='${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css'
	rel='stylesheet' type='text/css' />
<link
	href='${pageContext.request.contextPath}/resources/bootstrap/fonts/fonts.googleapis.css'
	rel='stylesheet' type='text/css' />
<body>
	<form action="MainServlet" method="post">
		<input type="hidden" name="command" value="saveCreateRoom" />
		<div align="center">
			<br>
			<div class="page-header">
				<h2>Add new Room</h2>
				<br>
			</div>
		</div>
		<!-- Text input-->
		<div class="form-group">
			<label class="col-md-4 control-label" for="number">Number</label>
			<div class="col-md-4">
				<input id="number" name="number" type="text" placeholder=""
					class="form-control input-md">
			</div>
		</div>
		<!-- Text input-->
		<div class="form-group">
			<label class="col-md-4 control-label" for="number_of_seats">Number
				of Seats</label>
			<div class="col-md-4">
				<input id="number_of_seats" name="number_of_seats" type="text"
					placeholder="" class="form-control input-md">
			</div>
		</div>
		<!-- Text input-->
		<div class="form-group">
			<label class="col-md-4 control-label" for="price">Price</label>
			<div class="col-md-4">
				<input id="price" name="price" type="text" placeholder=""
					class="form-control input-md">
			</div>
		</div>
		<!-- Text input-->
		<div class="form-group">
			<label class="col-md-4 control-label" for="status">Status</label>
			<div class="col-md-4">
				<input id="status" name="status" type="text" placeholder=""
					class="form-control input-md">
			</div>
		</div>
		<!-- Button -->
<!-- 		<div class="form-group"> -->
<!-- 			<label class="col-md-4 control-label" for="singlebutton"></label> -->
<!-- 			<div class="col-md-4"> -->
<!-- 				<button id="singlebutton" name="singlebutton" -->
<!-- 					class="btn btn-outline-primary">Submit</button> -->
<!-- 			</div> -->
<!-- 		</div> -->
	</form>

</body>
</html>