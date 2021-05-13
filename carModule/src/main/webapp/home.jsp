<%@ page language="java" pageEncoding="ISO-8859-1" %>
<%
%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>Quality Digital Publications</title>
    <meta content="" name="descriptison">
    <meta content="" name="keywords">

    <meta property="og:title" content="">
    <meta property="og:image" content="">
    <meta property="og:url" content="">
    <meta property="og:site_name" content="">
    <meta property="og:description" content="">

    <meta name="twitter:card" content="summary">
    <meta name="twitter:site" content="">
    <meta name="twitter:title" content="">
    <meta name="twitter:description" content="">
    <meta name="twitter:image" content="">

    <!-- Favicons assets/img/favicon.png -->
    <link href="resources/assets/img/favicon.png" rel="icon">
    <%--    <link href="../../resources/assets/img/appl" rel="apple-touch-icon">--%>


    <link href="https://fonts.googleapis.com/css?family=Raleway:400,500,700|Roboto:400,900" rel="stylesheet">


    <link href="resources/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/assets/vendor/venobox/venobox.css" rel="stylesheet">
    <link href="resources/assets/vendor/font-awesome/css/font-awesome.css" rel="stylesheet">


    <link href="resources/assets/css/style.css" rel="stylesheet">


</head>

<body>

<!-- ======= Hero Section ======= -->
<section class="hero">

    <div class="container text-center">
        <div class="row">
            <div class="col-md-12">
                <a class="hero-brand" href="home.jsp" title="Home"><img alt="QD Logo" src="assets/img/logo.png"></a>
            </div>
        </div>

        <div class="col-md-12">
            <h1>
                Quality Digital Publications
            </h1>
            <!--     <p class="tagline">
                     Just some my progects and thoughts about tech industry
                 </p>-->
            <a class="btn btn-full scrollto" href="#about">Get more information</a>
        </div>
    </div>

</section><!-- End Hero -->

<!-- ======= Header ======= -->
<header id="header">
    <div class="container">

        <div id="logo" class="pull-left">
            <a href="index.jsp"><img src="resources/assets/img/logo-nav.png" alt=""></a>
            <!-- Uncomment below if you prefer to use a text image -->
            <!--<h1><a href="#hero">Bell</a></h1>-->
        </div>

        <nav id="nav-menu-container">
            <ul class="nav-menu">
                <li><a href="#about">About me</a></li>
                <li><a href="#features">Features</a></li>
                <li><a href="#portfolio">Portfolio</a></li>
                <li><a href="#team">Partners</a></li>
                <li class="menu-has-children"><a href="">Progects</a>
                    <ul>
                        <li><a href="#">BI</a></li>
                        <li class="menu-has-children"><a href="#">Business software</a>
                            <ul>
                                <li><a href="#">Accounting</a></li>
                                <li><a href="#">Trade</a></li>
                                <li><a href="#">ERP</a></li>
                                <li><a href="#">HRM</a></li>
                                <li><a href="#">EDI</a></li>
                            </ul>
                        </li>
                        <li><a href="#">AI</a></li>
                        <li><a href="#">IOT</a></li>
                        <li><a href="#">MES</a></li>
                    </ul>
                </li>
                <li><a href="#contact">Contact with me</a></li>
            </ul>

        </nav>

        <!-- #nav-menu-container -->

        <nav class="nav social-nav pull-right d-none d-lg-inline">
            <a href="#"><i class="fa fa-twitter"></i></a> <a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
                class="fa fa-linkedin"></i></a> <a href="#"><i class="fa fa-envelope"></i></a>

            <form class="form-inline" method="post" action="controller">
                <label class="sr-only" for="inlineFormInputName2">Name</label>
                <input type="text" name="login" class="form-control mb-2 mr-sm-2" id="inlineFormInputName2"
                       placeholder="Username">

                <label class="sr-only" for="inlineFormInputGroupUsername2">Username</label>
                <div class="input-group mb-2 mr-sm-2">
                    <div class="input-group-prepend">
                        <div class="input-group-text"></div>
                    </div>
                    <input name="password" type="password" class="form-control" id="inlineFormInputGroupUsername2"
                           placeholder="Password">
                </div>

                <div class="form-check mb-2 mr-sm-2">
                    <input class="form-check-input" type="checkbox" id="inlineFormCheck">
                    <label class="form-check-label" for="inlineFormCheck">
                        Remember me
                    </label>
                </div>

                <button type="submit" class="btn btn-light mb-1">Sign in</button>
            </form>
        </nav>

    </div>
</header><!-- End Header -->

<main id="main">

    <!-- ======= About Section ======= -->
    <section class="about" id="about">

        <div class="container text-center">
            <h2>
                About me
            </h2>

            <p>
                Programmer and business analistic
            </p>

            <div class="row stats-row">
                <div class="stats-col text-center col-md-3 col-sm-6">
                    <div class="circle">
                        <span class="stats-no" data-toggle="counter-up">20</span> Satisfied Customers
                    </div>
                </div>

                <div class="stats-col text-center col-md-3 col-sm-6">
                    <div class="circle">
                        <span class="stats-no" data-toggle="counter-up">5</span> Released Projects
                    </div>
                </div>

                <div class="stats-col text-center col-md-3 col-sm-6">
                    <div class="circle">
                        <span class="stats-no" data-toggle="counter-up">8760</span> Hours Of Support
                    </div>
                </div>

                <div class="stats-col text-center col-md-3 col-sm-6">
                    <div class="circle">
                        <span class="stats-no" data-toggle="counter-up">1</span> Hard Workers
                    </div>
                </div>
            </div>
        </div>

    </section><!-- End About Section -->

    <!-- ======= Welcome Section ======= -->
    <section class="welcome text-center">
        <h2>Welcome to my blog about tech</h2>
        <p>
            This is repository of ideas and current progects that currently updated
        </p>
        <img alt="QDPub" class="gadgets-img hidden-md-down" src="assets/img/gadgets1.png">
    </section><!-- End Welcome Section -->

    <!-- ======= Features Section ======= -->
    <section class="features" id="features">

        <div class="container">
            <h2 class="text-center">
                Features
            </h2>

            <div class="row">
                <div class="feature-col col-lg-4 col-xs-12">
                    <div class="card card-block text-center">
                        <div>
                            <div class="feature-icon">
                                <span class="fa fa-rocket"></span>
                            </div>
                        </div>

                        <div>
                            <h3>
                                Custom idias
                            </h3>

                            <p>
                                All projects are unique, requiring non-standard implementation.
                            </p>
                        </div>
                    </div>
                </div>

                <div class="feature-col col-lg-4 col-xs-12">
                    <div class="card card-block text-center">
                        <div>
                            <div class="feature-icon">
                                <span class="fa fa-envelope"></span>
                            </div>
                        </div>

                        <div>
                            <h3>
                                Connectivity
                            </h3>
                            <p>
                                Every client is very important for me, every progect is require care
                            </p>
                        </div>
                    </div>
                </div>

                <div class="feature-col col-lg-4 col-xs-12">
                    <div class="card card-block text-center">
                        <div>
                            <div class="feature-icon">
                                <span class="fa fa-bell"></span>
                            </div>
                        </div>

                        <div>
                            <h3>
                                Innovative ideas
                            </h3>

                            <p>

                            </p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="feature-col col-lg-4 col-xs-12">
                    <div class="card card-block text-center">
                        <div>
                            <div class="feature-icon">
                                <span class="fa fa-database"></span>
                            </div>
                        </div>

                        <div>
                            <h3>
                                Good documentation
                            </h3>

                            <p>

                            </p>
                        </div>
                    </div>
                </div>

                <div class="feature-col col-lg-4 col-xs-12">
                    <div class="card card-block text-center">
                        <div>
                            <div class="feature-icon">
                                <span class="fa fa-youtube-play"></span>
                            </div>
                        </div>

                        <div>
                            <h3>
                                Excellent quality
                            </h3>

                            <p>

                            </p>
                        </div>
                    </div>
                </div>

                <div class="feature-col col-lg-4 col-xs-12">
                    <div class="card card-block text-center">
                        <div>
                            <div class="feature-icon">
                                <span class="fa fa-dashboard"></span>
                            </div>
                        </div>

                        <div>
                            <h3>
                                Redy for innovative progects and startaps
                            </h3>
                            <p>

                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </section><!-- End Features Section -->

    <!-- ======= Call to Action Section ======= -->
    <section class="cta">
        <div class="container">
            <div class="row">
                <div class="col-lg-9 col-sm-12 text-lg-left text-center">
                    <h2>
                        Contact
                    </h2>

                    <p>

                    </p>
                </div>

                <div class="col-lg-3 col-sm-12 text-lg-right text-center">
                    <a class="btn btn-ghost" href="#contactsholder">Contact with me</a>
                </div>
            </div>
        </div>
    </section><!-- End Call to Action Section -->

    <!-- ======= Portfolio Section ======= -->
    <section class="portfolio" id="portfolio">

        <div class="container text-center">
            <h2>
                Portfolio
            </h2>

            <p>
                Information about my active and past projects:
        </div>

        <div class="portfolio-grid">
            <div class="row">
                <div class="col-lg-3 col-sm-6 col-xs-12">
                    <div class="card card-block">
                        <a href="assets/img/bs.jpg" class="venobox" data-gall="portfolioGallery"><img alt=""
                                                                                                      src="assets/img/bs.jpg">
                            <div class="portfolio-over">
                                <div>
                                    <h3 class="card-title">
                                        Business software
                                    </h3>
                                    <p class="card-text">
                                        Developing configurations and customising existing programs
                                    </p>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>

                <div class="col-lg-3 col-sm-6 col-xs-12">
                    <div class="card card-block">
                        <a href="assets/img/BI.jpg" class="venobox" data-gall="portfolioGallery"><img alt=""
                                                                                                      src="assets/img/BI.jpg">
                            <div class="portfolio-over">
                                <div>
                                    <h3 class="card-title">
                                        BI
                                    </h3>

                                    <p class="card-text">
                                        Business intelligence
                                    </p>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>

                <div class="col-lg-3 col-sm-6 col-xs-12">
                    <div class="card card-block">
                        <a href="assets/img/AI.jpg" class="venobox" data-gall="portfolioGallery"><img alt=""
                                                                                                      src="assets/img/AI.jpg">
                            <div class="portfolio-over">
                                <div>
                                    <h3 class="card-title">
                                        AI
                                    </h3>

                                    <p class="card-text">
                                        Artificial intelligence
                                    </p>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>

                <div class="col-lg-3 col-sm-6 col-xs-12">
                    <div class="card card-block">
                        <a href="assets/img/IOT.png" class="venobox" data-gall="portfolioGallery"><img alt=""
                                                                                                       src="assets/img/IOT.png">
                            <div class="portfolio-over">
                                <div>
                                    <h3 class="card-title">
                                        IOT
                                    </h3>

                                    <p class="card-text">
                                        internet of things
                                    </p>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="col-lg-3 col-sm-6 col-xs-12">
                    <div class="card card-block">
                        <a href="assets/img/ERP.png" class="venobox" data-gall="portfolioGallery"><img alt=""
                                                                                                       src="assets/img/ERP.png"
                                                                                                       height="240">
                            <div class="portfolio-over">
                                <div>
                                    <h3 class="card-title">
                                        Accounting
                                    </h3>

                                    <p class="card-text">
                                        Programs for automatisation accounting by.qdpub.service.
                                    </p>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>

                <div class="col-lg-3 col-sm-6 col-xs-12">
                    <div class="card card-block">
                        <a href="assets/img/Trade.jpg" class="venobox" data-gall="portfolioGallery"><img alt=""
                                                                                                         src="assets/img/Trade.jpg"
                                                                                                         height="240">
                            <div class="portfolio-over">
                                <div>
                                    <h3 class="card-title">
                                        Trade
                                    </h3>

                                    <p class="card-text">
                                        Programs for automatisation trade functions of firm.
                                    </p>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>

                <div class="col-lg-3 col-sm-6 col-xs-12">
                    <div class="card card-block">
                        <a href="assets/img/ERPA.jpg" class="venobox" data-gall="portfolioGallery"><img alt=""
                                                                                                        src="assets/img/ERPA.jpg"
                                                                                                        height="240">
                            <div class="portfolio-over">
                                <div>
                                    <h3 class="card-title">
                                        ERP
                                    </h3>

                                    <p class="card-text">
                                        Programs for automatisation enterprise resource planning functions of firm.
                                    </p>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>

                <div class="col-lg-3 col-sm-6 col-xs-12">
                    <div class="card card-block">
                        <a href="assets/img/HRM.jpg" class="venobox" data-gall="portfolioGallery"><img alt=""
                                                                                                       src="assets/img/HRM.jpg"
                                                                                                       height="240">
                            <div class="portfolio-over">
                                <div>
                                    <h3 class="card-title">
                                        HRM
                                    </h3>

                                    <p class="card-text">
                                        Programs for automatisation HRM functions.
                                    </p>
                                </div>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </section><!-- End Portfolio Section -->

    <!-- ======= Team Section ======= -->
    <section class="team" id="team">
        <div class="container">
            <h2 class="text-center">
                Meet my friends
            </h2>

            <div class="row">
                <div class="col-sm-3 col-xs-6">
                    <div class="card card-block">
                        <a href="#"><img alt="" class="team-img" src="assets/img/team-1.jpg">
                            <div class="card-title-wrap">
                                <span class="card-title">Denis Zhukouski</span> <span class="card-text">Founder</span>
                            </div>

                            <div class="team-over">
                                <h4 class="hidden-md-down">
                                    Connect with me
                                </h4>

                                <nav class="social-nav">
                                    <a href="#"><i class="fa fa-twitter"></i></a> <a href="#"><i
                                        class="fa fa-facebook"></i></a> <a href="#"><i class="fa fa-linkedin"></i></a>
                                    <a href="#"><i class="fa fa-envelope"></i></a>
                                </nav>

                                <p>
                                    Hardworker
                                </p>
                            </div>
                        </a>
                    </div>
                </div>

                <div class="col-sm-3 col-xs-6">
                    <div class="card card-block">
                        <a href="#"><img alt="" class="team-img" src="assets/img/team-2.jpg">
                            <div class="card-title-wrap">
                                <span class="card-title">Alexey Petuhov</span> <span
                                    class="card-text">QA Director</span>
                            </div>

                            <div class="team-over">
                                <h4 class="hidden-md-down">
                                    Connect with me
                                </h4>

                                <nav class="social-nav">
                                    <a href="#"><i class="fa fa-twitter"></i></a> <a href="#"><i
                                        class="fa fa-facebook"></i></a> <a href="#"><i class="fa fa-linkedin"></i></a>
                                    <a href="#"><i class="fa fa-envelope"></i></a>
                                </nav>

                                <p>

                                </p>
                            </div>
                        </a>
                    </div>
                </div>

                <div class="col-sm-3 col-xs-6">
                    <div class="card card-block">
                        <a href="#"><img alt="" class="team-img" src="assets/img/team-3.jpg">
                            <div class="card-title-wrap">
                                <span class="card-title">Pavel Bykovets</span> <span class="card-text">Software developer</span>
                            </div>

                            <div class="team-over">
                                <h4 class="hidden-md-down">
                                    Connect with me
                                </h4>

                                <nav class="social-nav">
                                    <a href="#"><i class="fa fa-twitter"></i></a> <a href="#"><i
                                        class="fa fa-facebook"></i></a> <a href="#"><i class="fa fa-linkedin"></i></a>
                                    <a href="#"><i class="fa fa-envelope"></i></a>
                                </nav>

                                <p>
                                    Knows everything about tech
                                </p>
                            </div>
                        </a>
                    </div>
                </div>

                <div class="col-sm-3 col-xs-6">
                    <div class="card card-block">
                        <a href="#"><img alt="" class="team-img" src="assets/img/team-4.jpg">
                            <div class="card-title-wrap">
                                <span class="card-title">Roman Kurilenko</span> <span class="card-text">Designer</span>
                            </div>

                            <div class="team-over">
                                <h4 class="hidden-md-down">
                                    Connect with me
                                </h4>

                                <nav class="social-nav">
                                    <a href="#"><i class="fa fa-twitter"></i></a> <a href="#"><i
                                        class="fa fa-facebook"></i></a> <a href="#"><i class="fa fa-linkedin"></i></a>
                                    <a href="#"><i class="fa fa-envelope"></i></a>
                                </nav>

                                <p>
                                    Knows everything about design
                                </p>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </section><!-- End Team Section -->

    <!-- ======= Contact Section ======= -->
    <section id="contact">
        <div class="container">
            <div class="row">
                <div class="col-md-12 text-center">
                    <h2 class="section-title"></h2>
                </div>
            </div>

            <div class="row justify-content-center">
                <div class="col-lg-3 col-md-4">
                    <div class="info">
                        <div>
                            <i class="fa fa-map-marker"></i>
                            <p>Minsk, <br>Repablic Of Belarus</p>
                        </div>

                        <div>
                            <i class="fa fa-envelope"></i>
                            <p>deniszhukovskiyminsk@yandex.ru</p>
                        </div>

                        <div>
                            <i class="fa fa-phone"></i>
                            <p>+375(44)734 52 47 A1</p>
                        </div>

                    </div>
                </div>

                <div class="col-lg-5 col-md-8" id="contactsholder">
                    <div class="form">
                        <form action="MailToDevelop" method="post" role="form" class="php-email-form">
                            <div class="form-group">
                                <input type="text" name="name" class="form-control" id="name" placeholder="Your Name"
                                       data-rule="minlen:4" data-msg="Please enter at least 4 chars"/>
                                <div class="validate"></div>
                            </div>
                            <div class="form-group">
                                <input type="email" class="form-control" name="email" id="email"
                                       placeholder="Your Email" data-rule="email"
                                       data-msg="Please enter a valid email"/>
                                <div class="validate"></div>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" name="subject" id="subject"
                                       placeholder="Subject" data-rule="minlen:4"
                                       data-msg="Please enter at least 8 chars of subject"/>
                                <div class="validate"></div>
                            </div>
                            <div class="form-group">
                                <textarea class="form-control" name="message" rows="5" data-rule="required"
                                          data-msg="Please write something for us" placeholder="Message"></textarea>
                                <div class="validate"></div>
                            </div>
                            <div class="mb-3">
                                <div class="loading">Loading</div>
                                <div class="error-message"></div>
                                <div class="sent-message">Your message has been sent. Thank you!</div>
                            </div>
                            <div class="text-center">
                                <button type="submit">Send Message</button>
                            </div>
                        </form>
                    </div>
                </div>

            </div>
        </div>
    </section><!-- End Contact Section -->

</main><!-- End #main -->

<!-- ======= Footer ======= -->
<footer class="site-footer">
    <div class="bottom">
        <div class="container">
            <div class="row">

                <div class="col-lg-6 col-xs-12 text-lg-left text-center">
                    <p class="copyright-text">
                        &copy; Copyright <strong>QDPub</strong>. All Rights Reserved
                    </p>
                    <div class="credits">
                        Designed by <a href="https://QDPub.eu/">Denis Zhukouski</a>
                    </div>
                </div>

                <div class="col-lg-6 col-xs-12 text-lg-right text-center redrefa">
                    <ul class="list-inline">
                        <li class="list-inline-item">
                            <a href="home.jsp">Home</a>
                        </li>

                        <li class="list-inline-item">
                            <a href="#about">About me</a>
                        </li>

                        <li class="list-inline-item">
                            <a href="#features">Features</a>
                        </li>

                        <li class="list-inline-item">
                            <a href="#portfolio">Portfolio</a>
                        </li>

                        <li class="list-inline-item">
                            <a href="#team">Team</a>
                        </li>

                        <li class="list-inline-item">
                            <a href="#contact">Contact</a>
                        </li>
                    </ul>
                </div>

            </div>
        </div>
    </div>
</footer><!-- End Footer -->

<a class="scrolltop" href="#"><span class="fa fa-angle-up"></span></a>

<!-- Vendor JS Files -->
<script src="assets/vendor/jquery/jquery.min.js"></script>
<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="assets/vendor/jquery.easing/jquery.easing.min.js"></script>
<script src="assets/vendor/php-email-form/validate.js"></script>
<script src="assets/vendor/counterup/counterup.min.js"></script>
<script src="assets/vendor/tether/js/tether.min.js"></script>
<script src="assets/vendor/jquery-sticky/jquery.sticky.js"></script>
<script src="assets/vendor/venobox/venobox.min.js"></script>
<script src="assets/vendor/lockfixed/jquery.lockfixed.min.js"></script>
<script src="assets/vendor/waypoints/jquery.waypoints.min.js"></script>
<script src="assets/vendor/superfish/superfish.min.js"></script>
<script src="assets/vendor/hoverIntent/hoverIntent.js"></script>

<!-- Template Main JS File -->
<script src="assets/js/main.js"></script>


</body>

</html>