<!DOCTYPE html>
<html dir="ltr" lang="en-US">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
						<ul class="submenu">
							<li class="sub-menu-item"><a href="index1.html">Home
									Version 1</a></li>
							<li class="sub-menu-item"><a href="index2.html">Home
									Version 2</a></li>
						</ul></li>
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
						<ul class="submenu">
							<li class="sub-menu-item"><a href="gallery.html">Gallery</a></li>
							<li class="sub-menu-item"><a href="gallery-single.html">Gallery
									Single</a></li>
						</ul></li>
					<li class="menu-item"><a href="#">Blog</a>
						<ul class="submenu">
							<li class="sub-menu-item"><a href="blog1.html">Blog
									version 1</a></li>
							<li class="sub-menu-item"><a href="blog2.html">Blog
									version 2</a></li>
							<li class="sub-menu-item"><a href="blog-single.html">Blog
									Single</a></li>
						</ul></li>
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

	<section class="section-breadcrumb"
		style="background-image: url('resources/images/facility-banner.png')">
		<h2 class="title">Our Facilities</h2>
		<div class="breadcrumb">
			You are here: <span class="slug"><span class="home">
					Home </span> <span class="page"> Facilities</span></span>
		</div>
	</section>

	<section class="section-facilities">
		<h2 class="hidden">Services</h2>
		<div class="container">
			<div class="facilities-container">
				<div class="row">
					<c:forEach var="facility" items="${listFacilities}">
						<div class="col-sm-6 col-md-3">
							<div class="content-box">
								<img src="${facility.getImage()}"
									class="img-centered img-responsive" data-animate="zoomIn"
									alt="facility-1">
								<div class="tri-up"></div>
								<h3 class="title">${facility.nameFacilities}</h3>
								<p class="content">Nullam ultrices, urna nec malesuada
									aliquam, neque massa auctor metus, vulputate tristique enim
									nulla quis ante. Sed vel leo turpis. In in tortor fringilla,
									scelerisque quam eu, aliquet massa.lorem.</p>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</section>

	<section class="section-testimonials bg-secondary">
		<div class="text-center">
			<h2 class="title">Testimonial</h2>
		</div>
		<div class="moon-divider white"></div>
		<div class="container">
			<div class="testimonial-slider swiper-container">
				<div class="swiper-wrapper">
					<!-- Testimonial 01 -->
					<div class="swiper-slide">
						<div class="testimonial-box">
							<p class="text">Aliquam sodales facilisis dolor, feugiat
								elementum tellus condimentum at. Mauris sem nisi, dictum eget
								facilisis quis, placerat eu nisl. Phasellus consectetur pharetra
								elit id maximus. Aliquam facilisis sodales erat, sit amet
								euismod eros dignissim aliquam pulvinar metus.</p>
							<h3 class="name">Charles Coleman</h3>
							<div class="position">CEO of Pineapple</div>
						</div>
					</div>
					<!-- Testimonial 02 -->
					<div class="swiper-slide">
						<div class="testimonial-box">
							<p class="text">Aliquam sodales facilisis dolor, feugiat
								elementum tellus condimentum at. Mauris sem nisi, dictum eget
								facilisis quis, placerat eu nisl. Phasellus consectetur pharetra
								elit id maximus. Aliquam facilisis sodales erat, sit amet
								euismod eros dignissim aliquam pulvinar metus.</p>
							<h3 class="name">Charles Coleman</h3>
							<div class="position">CEO of Pineapple</div>
						</div>
					</div>
					<!-- Testimonial 03 -->
					<div class="swiper-slide">
						<div class="testimonial-box">
							<p class="text">Aliquam sodales facilisis dolor, feugiat
								elementum tellus condimentum at. Mauris sem nisi, dictum eget
								facilisis quis, placerat eu nisl. Phasellus consectetur pharetra
								elit id maximus. Aliquam facilisis sodales erat, sit amet
								euismod eros dignissim aliquam pulvinar metus.</p>
							<h3 class="name">Charles Coleman</h3>
							<div class="position">CEO of Pineapple</div>
						</div>
					</div>
				</div>
			</div>
			<div class="testimonial-slider-page-controls"></div>
		</div>
	</section>

	<footer>
		<div class="container">
			<div class="row">
				<div class="col-sm-4">
					<h3 class="subtitle">
						<strong>Useful Links</strong>
					</h3>
					<ul class="site-links">
						<li><a href="#">Services</a></li>
						<li><a href="#">Blog</a></li>
						<li><a href="/HotelSob/MainServlet?command=listRooms">Rooms</a></li>
						<li><a href="/HotelSob/MainServlet?command=listFacilities">Facilities</a></li>
						<li><a href="#">About</a></li>
						<li><a href="#">Event Planner</a></li>
						<li><a href="#">Special Offer</a></li>
						<li><a href="#">FAQs</a></li>
						<li><a href="#">Under Construction</a></li>
					</ul>
				</div>
				<div class="col-sm-4 text-center">
					<h3 class="subtitle wide">
						The <strong>Moon</strong> Hotel
					</h3>
					<div class="moon-divider small"></div>
					<p>24-26-28 Southern Str, Melbourne, VIC</p>
					<p>(+064) - 342 - 68273 ??? (+064) - 342 - 68275</p>
					<p>
						<a href="#">info@themoonhotel.com</a>
					</p>
					<p>
						<a href="#">http://themoonhotel.com</a>
					</p>
					<div class="moon-divider small"></div>
					<div class="social-links">
						<a class="social-link" href="#"><i class="fa fa-facebook"></i><i
							class="fa fa-facebook"></i></a> <a class="social-link" href="#"><i
							class="fa fa-twitter"></i><i class="fa fa-twitter"></i></a> <a
							class="social-link" href="#"><i class="fa fa-google-plus"></i><i
							class="fa fa-google-plus"></i></a> <a class="social-link" href="#"><i
							class="fa fa-pinterest-p"></i><i class="fa fa-pinterest-p"></i></a> <a
							class="social-link" href="#"><i class="fa fa-instagram"></i><i
							class="fa fa-instagram"></i></a> <a class="social-link" href="#"><i
							class="fa fa-youtube"></i><i class="fa fa-youtube"></i></a>
					</div>
				</div>
				<div class="col-sm-4 text-right">
					<h3 class="subtitle">
						<strong>Newsletter</strong>
					</h3>
					<p>Cras dignissim, velit ut placerat pulvinar, metus justo
						ultricies lacus, ut consectetur neque augue maximus lectus.
						Phasellus non placerat nibh.</p>
					<div class="inputs">
						<div class="input-wrapper">
							<input type="text" id="email" name="email"
								placeholder="Enter your email here">
						</div>
						<button>
							<i class="fa fa-arrow-right"></i>
						</button>
					</div>
				</div>
			</div>
		</div>
		<div class="copyright-area">
			<div class="container">
				<p>
					@2015 The Moon Hotel. Designed with <i class="fa fa-heart"></i>
				</p>
			</div>
		</div>
	</footer>

	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/jquery-ui.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/plugins.js"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/js/functions.js"></script>
</body>
</html>