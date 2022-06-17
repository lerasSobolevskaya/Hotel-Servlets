<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="author" content="Theme-Paradise" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<link
	href='${pageContext.request.contextPath}/resources/css/playfair.css'>
<link href='${pageContext.request.contextPath}/resources/css/roboto.css'>

<link
	href='${pageContext.request.contextPath}/resources/fonts/fontawesome/css/font-awesome.min.css'
	rel='stylesheet' type='text/css'>
<link
	href='${pageContext.request.contextPath}/resources/fonts/icomoon/style.css'
	rel='stylesheet' type='text/css'>

<link
	href='${pageContext.request.contextPath}/resources/css/jquery-ui.min.css'
	rel='stylesheet' type='text/css'>
<link
	href='${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css'
	rel='stylesheet' type='text/css'>
<link
	href='${pageContext.request.contextPath}/resources/css/animate.css'
	rel='stylesheet' type='text/css'>
<link
	href='${pageContext.request.contextPath}/resources/css/swiper.min.css'
	rel='stylesheet' type='text/css'>

<link href='${pageContext.request.contextPath}/resources/css/style.css'
	rel='stylesheet' type='text/css'>

<title>Moon - Hotel HTML5 Template</title>

</head>
<body class="loading">
	<h1 class="hidden">Homepage 2</h1>
	<div id="preloader-wrapper">
		<div id="preloader"></div>
	</div>

	<header class="header-2">
		<div class="container">
			<a href="index2.html" class="logo-link">The <strong>Moon</strong>
				Hotel
			</a>
			<nav class="main-menu clearfix">
				<h2 class="hidden">Main Menu</h2>
				<ul>
					<li class="menu-item"><a href="#">Home</a>
					<li class="menu-item"><a href="about.html">About</a></li>
					<li class="menu-item"><a
						href="/HotelSob/MainServlet?command=listRooms">Rooms</a>
					<li class="menu-item"><a
						href="/HotelSob/MainServlet?command=listFacilities">Services</a></li>
					<li class="menu-item"><a href="#">Booking</a>
						<ul class="submenu">
							<li class="sub-menu-item"><a href="booking-choose-date.html">Choose
									Date</a></li>
							<li class="sub-menu-item"><a href="booking-choose-room.html">Choose
									Room</a></li>
							<li class="sub-menu-item"><a href="booking-reservation.html">Reservation</a></li>
						</ul></li>
					<li class="menu-item"><a href="#">Gallery</a>
					<li class="menu-item"><a href="contact.html">Contact</a></li>
				</ul>
				<ul>
					<li class="menu-item"><a
						href="/HotelSob/MainServlet?command=formAuthentication">Authorization</a></li>
				</ul>
			</nav>

			<div id="menu-toggle">
				<div class="bar first"></div>
				<div class="bar second"></div>
				<div class="bar third"></div>
			</div>
		</div>
	</header>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery-ui.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/plugins.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/functions.js"></script>

</body>
</html>