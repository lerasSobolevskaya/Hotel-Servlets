<!DOCTYPE html>
<html dir="ltr" lang="en-US">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta name="author" content="Theme-Paradise" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- Google Fonts -->
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

<link
	href='${pageContext.request.contextPath}/resources/css/playfair.css'>
<link href='${pageContext.request.contextPath}/resources/css/roboto.css'>

<title>Details about Room</title>
</head>
<body class="loading">
	<h1 class="hidden">Room single</h1>
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
	<section class="section-breadcrumb">
		<h2 class="title">
			<c:out value="${room_TypeMap.get(room.getId()).getType()}" />
		</h2>
		<div class="breadcrumb">
			You are here: <span class="slug"><span class="home">
					Home </span> <span class="page"> > Rooms</span></span>
		</div>
	</section>

	<section class="section-room-single">
		<h2 class="hidden">Room section</h2>
		<div class="container">
			<div class="row">
				<div class="col-md-9">
					<div class="room-description">
						<img src="images/room-lg.jpg" class="img-centered img-responsive"
							alt="room-large" data-animate="fadeIn">
						<h3 class="subtitle">Description</h3>
						<p class="content">Ut ornare est et sollicitudin vehicula.
							Nulla venenatis auctor quam, ac porta lectus dictum in. Aliquam
							sodales nisi sit amet lorem tincidunt, sit amet sodales massa
							vehicula. Proin at ipsum vitae nisi pulvinar tempus. Nullam
							mollis cursus mollis. Praesent a sagittis libero. Nullam
							ultrices, urna nec malesuada aliquam, neque massa auctor metus,
							vulputate tristique enim nulla quis ante. Suspendisse vulputate
							tellus in justo convallis imperdiet eu lobortis arcu.</p>
						<p class="content">Cras sodales vestibulum molestie. Quisque
							ac odio ex. Vestibulum non turpis justo. Integer nec justo et dui
							maximus gravida. Aliquam erat volutpat. In eu efficitur ante, ut
							pretium diam. Mauris ante tellus, malesuada eget varius quis,
							lacinia laoreet arcu. Morbi id lorem consequat, sodales mi non,
							dictum nibh.</p>
						<h3 class="subtitle large-caps">Facilities</h3>
						<ul class="two-cols">
							<li><a href="#">Complimentary broadband Internet access</a></li>
							<li><a href="#">Complimentary Wifi in all rooms</a></li>
							<li><a href="#">Complimentary Internet TV in all rooms</a></li>
							<li><a href="#">Drinking water</a></li>
							<li><a href="#">Wide screen 32” LCD TV with cable
									channel</a></li>
							<li><a href="#">Tea and coffee making facilities</a></li>
							<li><a href="#">Electronic in-room safe</a></li>
							<li><a href="#">Full range of custom-made bathroom
									amenities</a></li>
							<li><a href="#">Hair Dryer in all rooms</a></li>
							<li><a href="#">Mini fridge</a></li>
							<li><a href="#">Phone docking station</a></li>
						</ul>

						<h3 class="subtitle ">Other Information</h3>
						<p class="content">Vestibulum urna massa, hendrerit sed
							fringilla in, mollis vitae tellus. Vestibulum mattis nulla
							elementum tristique fringilla. Morbi in sollicitudin erat. Nullam
							ligula sem, imperdiet nec commodo non, convallis vitae neque.
							Cras tempor magna a purus finibus tristique. Suspendisse euismod,
							neque faucibus dictum rutrum, ex dolor tempor dolor, ut egestas
							velit tellus quis erat. Curabitur vel elit a nibh fringilla
							maximus. Curabitur ut auctor elit, non gravida felis.</p>
						<em class="content">Sed malesuada tellus id sem placerat
							dapibus. Pellentesque dui lorem, viverra fringilla nisl id,
							molestie condimentum tellus. Vivamus nec lectus congue, ultrices
							felis sit amet, dapibus augue..</em>
					</div>
				</div>
				<div class="col-md-3 ">
					<h3 class="hidden">Room side bar</h3>
					<div class="widget-box ">
						<h4 class="widget-title">Book this room</h4>
						<hr>
						<em>from <span class="price"><c:out
									value="${room.price}" /></span> / night
						</em>
						<div class="include-header">This price includes...</div>
						<div class="include-item">Breakfast</div>
						<div class="include-header">
							<strong>... and do not includes:</strong>
						</div>
						<div class="include-item">Free spa ticket</div>
						<div class="include-item">VAT fee and 5% service fee</div>
						<div class="text-center">
							<a href="#" class="button">Book</a>
						</div>
					</div>
					<div class="widget-box">
						<h4 class="widget-title">Search rooms</h4>
						<em>For rates and availability</em>
						<hr>

						<form class="check-rooms vertical third">
							<div class="form-group ">
								<label>Arrival Date</label><br> <input
									class="form-control datepicker" data-theme="primary">
							</div>
							<div class="form-group ">
								<label>Departure Date</label><br> <input
									class="form-control datepicker" data-theme="primary">
							</div>
							<div class="row">
								<div class="form-group col-xs-6">
									<label>Adults</label><br> <select
										class="form-control third">
										<option>1</option>
										<option selected="selected">2</option>
										<option>3</option>
										<option>4</option>
									</select>
								</div>
								<div class="form-group col-xs-6">
									<label>Children</label><br> <select
										class="form-control third">
										<option>0</option>
										<option selected="selected">1</option>
										<option>2</option>
										<option>3</option>
									</select>
								</div>
							</div>
							<hr>
							<div class="form-group text-center">
								<button type="submit" class="button">Check Now</button>
							</div>
						</form>
					</div>
				</div>
			</div>
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
					<p>(+064) - 342 - 68273 — (+064) - 342 - 68275</p>
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