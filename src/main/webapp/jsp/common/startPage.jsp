<!DOCTYPE html>
<html dir="ltr" lang="en-US">
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

	<div id="main-slider" class="slider">
		<div class="swiper-container">
			<h2 class="hidden">Main Slider</h2>
			<div class="swiper-wrapper">
				<!-- Slide 01 -->
				<div class="swiper-slide"
					style="background: url('resources/images/home/slider-1.jpg') center top/cover no-repeat">
					<div class="container">
						<div class="slide-content">
							<div class="slide-subtitle" data-animate="fadeInRight">Special
								Offers</div>
							<h3 class="slide-title" data-animate="fadeInRight">
								<strong>Luxury</strong>Room
							</h3>
							<div class="slide-divider" data-animate="fadeInRight"></div>
							<div class="slide-subtitle-italic" data-animate="fadeInRight"
								data-delay="300">
								bringing to you the best experience from only <span
									class="price">$149</span> / night
							</div>
							<a href="#" class="button transparent" data-animate="pulse"
								data-delay="300">Get this offer</a>
						</div>
					</div>
				</div>
				<!-- Slide 02 -->
				<div class="swiper-slide"
					style="background: url('resources/images/home/slider-2.jpg') center top/cover no-repeat">
					<div class="container">
						<div class="slide-content">
							<div class="slide-subtitle">Special Offers</div>
							<h3 class="slide-title">
								<strong>Luxury</strong>Room
							</h3>
							<div class="slide-divider"></div>
							<div class="slide-subtitle-italic">
								bringing to you the best experience from only <span
									class="price">$149</span> / night
							</div>
							<a href="#" class="button transparent">Get this offer</a>
						</div>
					</div>
				</div>
				<!-- Slide 03 -->
				<div class="swiper-slide"
					style="background: url('resources/images/home/slider-1.jpg') center top/cover no-repeat">
					<div class="container">
						<div class="slide-content">
							<div class="slide-subtitle" data-animate="fadeInLeft">Special
								Offers</div>
							<h3 class="slide-title" data-animate="fadeInLeft">
								<strong>Luxury</strong>Room
							</h3>
							<div class="slide-divider" data-animate="fadeInLeft"></div>
							<div class="slide-subtitle-italic" data-animate="fadeInLeft"
								data-delay="300">
								bringing to you the best experience from only <span
									class="price">$149</span> / night
							</div>
							<a href="#" class="button transparent" data-animate="pulse"
								data-delay="300">Get this offer</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="main-slider-control prev">
			<i class="icon-prev"></i>
		</div>
		<div class="main-slider-control next">
			<i class="icon-next"></i>
		</div>
		<div class="container">
			<div class="page-controls centered clearfix"></div>
		</div>
	</div>

	<section class="section-search-rooms version-2">
		<div class="search-rooms-content">
			<div class="container">
				<div class="row">
					<div class="col-md-4 ">
						<div class="title-container">
							<div class="title-area bg-primary">
								<h2 class="title">Search Rooms</h2>
								<div class="subtitle">For rates and availability</div>
								<p class="content muted">Choose from over 80 rooms that
									suits you best</p>
							</div>
							<div class="title-background bg-primary"></div>
						</div>
					</div>
					<div class="col-md-8">
						<div class="search-form">
							<form class="form-inline check-rooms secondary"
								action="rooms.html">
								<div class="form-group ">
									<label>Arrival Date</label><br> <input
										class="form-control datepicker" data-theme="secondary">
								</div>
								<div class="form-group ">
									<label>Departure Date</label><br> <input
										class="form-control datepicker" data-theme="secondary">
								</div>
								<div class="form-group">
									<label>Adults</label><br> <select
										class="form-control form-select secondary">
										<option>1</option>
										<option selected="selected">2</option>
										<option>3</option>
										<option>4</option>
									</select>
								</div>
								<div class="form-group">
									<label>Children</label><br> <select
										class="form-control form-select secondary">
										<option>0</option>
										<option selected="selected">1</option>
										<option>2</option>
										<option>3</option>
									</select>
								</div>
								<div class="form-group text-center">
									<button type="submit" class="button">Check Now</button>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="section-accommodations">
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<h2 class="title">Accommodations</h2>
					<div class="subtitle">56 rooms available now</div>
					<p class="content">Vestibulum ante ipsum primis in faucibus
						orci luctus et ultrices posuere cubilia Curae; Pellentesque semper
						quis neque dictum hendrerit.</p>
				</div>
				<div class="col-md-8">
					<div class="rooms-container">
						<div class="rooms-thumb-area">
							<div class="container">
								<div class="row">
									<div class="col-lg-3 col-sm-6 no-padding">
										<div class="room-thumb-box grayscale"
											style="background: url('/images/home/room-thumb-1.jpg') center bottom no-repeat"
											data-animate="bounceInRight" data-delay="0">
											<div class="room-meta-box">
												<h3 class="room-title">Superior</h3>
												<div class="room-subtitle">Room</div>
												<p class="content">Pellentesque ornare dui cursus ex
													dictum, eget porttitor est iaculis. Quisque vehicula
													iaculis purus a egestas.</p>
											</div>
										</div>
									</div>
									<div class="col-lg-3 col-sm-6 no-padding">
										<div class="room-thumb-box grayscale"
											style="background: url('/images/home/room-thumb-2.jpg') center bottom no-repeat"
											data-animate="bounceInRight" data-delay="100">
											<div class="room-meta-box">
												<h3 class="room-title">Deluxe</h3>
												<div class="room-subtitle">Room</div>
												<p class="content">Pellentesque ornare dui cursus ex
													dictum, eget porttitor est iaculis. Quisque vehicula
													iaculis purus a egestas.</p>
											</div>
										</div>
									</div>
									<div class="col-lg-3 col-sm-6 no-padding">
										<div class="room-thumb-box grayscale"
											style="background: url('/images/home/room-thumb-3.jpg') center bottom no-repeat"
											data-animate="bounceInRight" data-delay="200">
											<div class="room-meta-box">
												<h3 class="room-title">Family</h3>
												<div class="room-subtitle">Suite</div>
												<p class="content">Pellentesque ornare dui cursus ex
													dictum, eget porttitor est iaculis. Quisque vehicula
													iaculis purus a egestas.</p>
											</div>
										</div>
									</div>
									<div class="col-lg-3 col-sm-6 no-padding">
										<div class="room-thumb-box grayscale"
											style="background: url('/images/home/room-thumb-4.jpg') center bottom no-repeat"
											data-animate="bounceInRight" data-delay="300">
											<div class="room-meta-box">
												<h3 class="room-title">Luxury</h3>
												<div class="room-subtitle">Room</div>
												<p class="content">Pellentesque ornare dui cursus ex
													dictum, eget porttitor est iaculis. Quisque vehicula
													iaculis purus a egestas.</p>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="section-why-choose-us"
		style="background-image: url('resources/images/home/why-us-bg.jpg')">
		<div class="container">
			<div class="row">
				<div class="col-sm-4">
					<img src="/images/home/why-us-thumb.png"
						class="img-responsive img-centered img-thumb" alt="why-us">
				</div>
				<div class="col-sm-8">
					<h2 class="title">Why Choose Us</h2>
					<p class="text">Vivamus consequat, felis at aliquam elementum,
						massa sem dignissim elit, sit amet cursus massa tortor eget ante.
						Donec condimentum id erat a molestie. In luctus quis risus cursus
						faucibus. Pellentesque ornare dui cursus ex dictum, eget porttitor
						est iaculis. Quisque vehicula iaculis purus a egestas. Quisque in
						tortor facilisis, congue nisi at, maximus odio.</p>
					<div class="row">
						<div class="col-md-6">
							<h3 class="subtitle">
								<i class="fa fa-check-circle-o"></i>Over 50 years of experience
							</h3>
							<p class="text">Aliquam posuere gravida tristique. Vestibulum
								dolor turpis, gravida vitae euismod at, consectetur quis felis.
								Etiam eget maximus est. Duis pharetra ante nulla, tempor ornare
								sapien tincidunt vitae.</p>
						</div>
						<div class="col-md-6">
							<h3 class="subtitle">
								<i class="fa fa-check-circle-o"></i>We are passionate
							</h3>
							<p class="text">Aliquam posuere gravida tristique. Vestibulum
								dolor turpis, gravida vitae euismod at, consectetur quis felis.
								Etiam eget maximus est. Duis pharetra ante nulla, tempor ornare
								sapien tincidunt vitae.</p>
						</div>
						<div class="col-md-6">
							<h3 class="subtitle">
								<i class="fa fa-check-circle-o"></i>We are fast, accuracy and
								reliable
							</h3>
							<p class="text">Aliquam posuere gravida tristique. Vestibulum
								dolor turpis, gravida vitae euismod at, consectetur quis felis.
								Etiam eget maximus est. Duis pharetra ante nulla, tempor ornare
								sapien tincidunt vitae.</p>
						</div>
						<div class="col-md-6">
							<h3 class="subtitle">
								<i class="fa fa-check-circle-o"></i>We are improving everyday
							</h3>
							<p class="text">Aliquam posuere gravida tristique. Vestibulum
								dolor turpis, gravida vitae euismod at, consectetur quis felis.
								Etiam eget maximus est. Duis pharetra ante nulla, tempor ornare
								sapien tincidunt vitae.</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section class="section-testimonials bg-primary">
		<div class="text-center">
			<h2 class="title">Testimonial</h2>
		</div>
		<div class="moon-divider"></div>
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

	<section class="section-facilities">
		<div class="text-center">
			<h2 class="title">The Moon's Facilities</h2>
		</div>
		<div class="moon-divider"></div>
		<div class="container">
			<div class="facilities-container">
				<div class="col-md-6">
					<div class="col-sm-6">
						<div class="content-box">
							<img src="resources/images/facility-1.jpg"
								class="img-centered img-responsive" data-animate="zoomIn"
								alt="facility-1">
							<div class="tri-up"></div>
							<h3 class="title">SPA Treatments and Massage</h3>
							<p class="content">Nullam ultrices, urna nec malesuada
								aliquam, neque massa auctor metus, vulputate tristique enim
								nulla quis ante. Sed vel leo turpis. In in tortor fringilla,
								scelerisque quam eu, aliquet massa.lorem.</p>
						</div>
					</div>
					<div class="col-sm-6">
						<div class="content-box">
							<h3 class="title">Outdoor Pool</h3>
							<p class="content">Vivamus eros dolor, auctor aliquet dolor
								sit amet, euismod imperdiet ex. Nam sed nulla sed massa suscipit
								feugiat. Mauris et nunc ornare, placerat ex ac, interdum magna.
								Donec mollis tellus non sem pulvinar.</p>
							<div class="tri-down"></div>
							<img src="resources/images/facility-2.jpg"
								class="img-centered img-responsive" data-animate="zoomIn"
								alt="facility-2">
						</div>
					</div>
				</div>
				<div class="col-md-6">
					<div class="col-sm-6">
						<div class="content-box">
							<img src="resources/images/facility-3.jpg"
								class="img-centered img-responsive" data-animate="zoomIn"
								alt="facility-3">
							<div class="tri-up"></div>
							<h3 class="title">Fitness Rooms</h3>
							<p class="content">Suspendisse euismod, neque faucibus dictum
								rutrum, ex dolor tempor dolor, ut egestas velit tellus quis
								erat. Curabitur vel elit a nibh fringilla maximus.</p>
						</div>
					</div>
					<div class="col-sm-6">
						<div class="content-box">
							<h3 class="title">Free WI-FI</h3>
							<p class="content">Molestie condimentum tellus. Vivamus nec
								lectus congue, ultrices felis sit amet, dapibus augue. Cras
								fringilla efficitur elementum. Mauris ac consectetur nibh.
								Mauris tincidunt dolor justo, ac accumsan.</p>
							<div class="tri-down"></div>
							<img src="resources/images/facility-4.jpg"
								class="img-centered img-responsive" data-animate="zoomIn"
								alt="facility-4">
						</div>
					</div>
				</div>
				<div class="col-xs-12 text-center">
					<a href="/HotelSob/MainServlet?command=listFacilities"
						class="button transparent">See All Facilities</a>
				</div>
			</div>
		</div>
	</section>

	<section class="section-gallery bg-primary">
		<div class="text-center">
			<h2 class="title">Moon's Gallery</h2>
		</div>
		<div class="moon-divider"></div>
		<div class="container">
			<div class="gallery-container">
				<div class="gallery-slider swiper-container">
					<div class="swiper-wrapper">
						<!-- Gallery 01 -->
						<div class="swiper-slide">
							<div class="row">
								<div class="col-md-6">
									<a href="#"><img src="images/gallery/gallery-1.jpg"
										class="img-centered img-responsive" alt="gallery-1"></a>
								</div>
								<div class="col-md-6">
									<p class="desc">This album has 28 photos</p>
									<p class="content">Vivamus consequat, felis at aliquam
										elementum, massa sem dignissim elit, sit amet cursus massa
										EGET ANTE</p>
									<span class="date"><i class="fa fa-calendar-o"></i> May
										22nd, 2015</span>
									<div class="swipe-controls">
										<i class="fa fa-chevron-left page-control"></i><i
											class="fa fa-chevron-right page-control"></i>
									</div>
								</div>
							</div>
						</div>
						<!-- Gallery 02 -->
						<div class="swiper-slide">
							<div class="row">
								<div class="col-md-6">
									<a href="#"><img src="images/gallery/gallery-2.jpg"
										class="img-centered img-responsive" alt="gallery-2"></a>
								</div>
								<div class="col-md-6">
									<p class="desc">This album has 21 photos</p>
									<p class="content">Vivamus consequat, felis at aliquam
										elementum, massa sem dignissim elit, sit amet cursus massa
										EGET ANTE</p>
									<span class="date"><i class="fa fa-calendar-o"></i> May
										22nd, 2015</span>
									<div class="swipe-controls">
										<i class="fa fa-chevron-left page-control"></i><i
											class="fa fa-chevron-right page-control"></i>
									</div>
								</div>
							</div>
						</div>
						<!-- Gallery 03 -->
						<div class="swiper-slide">
							<div class="row">
								<div class="col-md-6">
									<a href="#"><img src="images/gallery/gallery-3.jpg"
										class="img-centered img-responsive" alt="gallery-3"></a>
								</div>
								<div class="col-md-6">
									<p class="desc">This album has 45 photos</p>
									<p class="content">Vivamus consequat, felis at aliquam
										elementum, massa sem dignissim elit, sit amet cursus massa
										EGET ANTE</p>
									<span class="date"><i class="fa fa-calendar-o"></i> May
										22nd, 2015</span>
									<div class="swipe-controls">
										<i class="fa fa-chevron-left page-control"></i><i
											class="fa fa-chevron-right page-control"></i>
									</div>
								</div>
							</div>
						</div>
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