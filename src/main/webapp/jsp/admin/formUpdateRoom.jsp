<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Room</title>
</head>
<body>
	<form action="MainServlet" method="get">
		<input type="hidden" name="command" value="saveUpdateRoom">
		<div align="center">
			<br>
			<div class="page-header">
				<h2>Update Room</h2>
				<br>
			</div>
		</div>
		<!-- Text input-->
		<div class="form-group">
			<label class="col-md-4 control-label" for="room_id">Id</label>
			<div class="col-md-4">
				<input id="room_id" name="room_id" placeholder=""
					class="form-control input-md">
			</div>
		</div>

  <c:if test="${room != null}">
  <input type="hidden" name="room_id" value="<c:out value='${room.id}' />" /></c:if>
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
		<div class="form-group">
			<label class="col-md-4 control-label" for="singlebutton"></label>
			<div class="col-md-4">
				<input type="submit" value="update">
			</div>
		</div>
	</form>

</body>
</html>