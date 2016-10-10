<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Site made with Mobirise Website Builder v2.11.1, https://mobirise.com -->
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="generator" content="Mobirise v2.11.1, mobirise.com">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="shortcut icon" href="assets/images/13jtyd.gif" type="image/x-icon">
  <meta name="description" content="">
  
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:700,400&amp;subset=cyrillic,latin,greek,vietnamese">
  <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="assets/animate.css/animate.min.css">
  <link rel="stylesheet" href="assets/mobirise/css/style.css">
  <link rel="stylesheet" href="assets/dropdown-menu-plugin/style.css">
  <link rel="stylesheet" href="assets/mobirise/css/mbr-additional.css" type="text/css">
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<title>View Recipe</title>
</head>
<body>
<section class="mbr-navbar mbr-navbar--freeze mbr-navbar--absolute mbr-navbar--transparent mbr-navbar--sticky mbr-navbar--auto-collapse" id="menu-11">
    <div class="mbr-navbar__section mbr-section">
        <div class="mbr-section__container container">
            <div class="mbr-navbar__container">
                <div class="mbr-navbar__column mbr-navbar__column--s mbr-navbar__brand">
                    <span class="mbr-navbar__brand-link mbr-brand mbr-brand--inline">
                        <span class="mbr-brand__logo"><a href="page1.html"><img src="assets/images/13jtyd.gif" class="mbr-navbar__brand-img mbr-brand__img" alt="Mobirise"></a></span>
                        <span class="mbr-brand__name"><a class="mbr-brand__name text-white" href="page1.html">Chef Oracle</a></span>
                    </span>
                </div>
                <div class="mbr-navbar__hamburger mbr-hamburger"><span class="mbr-hamburger__line"></span></div>
                <div class="mbr-navbar__column mbr-navbar__menu">
                    <nav class="mbr-navbar__menu-box mbr-navbar__menu-box--inline-right">
                        <div class="mbr-navbar__column">
                            <ul class="mbr-navbar__items mbr-navbar__items--right float-left mbr-buttons mbr-buttons--freeze mbr-buttons--right btn-decorator mbr-buttons--active mbr-buttons--only-links"><li class="mbr-navbar__item"><a class="mbr-buttons__link btn text-white" href="page1.html">HOME</a></li><li class="mbr-navbar__item"><a class="mbr-buttons__link btn text-white" href="https://mobirise.com"></a></li></ul>                            
                            
                        </div>
                    </nav>
                </div>
            </div>
        </div>
    </div>
</section>

<section class="engine"><a rel="external" href="https://mobirise.com">free site maker</a></section><section class="mbr-box mbr-section mbr-section--relative mbr-section--fixed-size mbr-section--full-height mbr-section--bg-adapted mbr-parallax-background mbr-after-navbar" id="header4-16" style="background-image: url(assets/images/food-dark-1600x1067-8.jpg);">
    <div class="mbr-box__magnet mbr-box__magnet--sm-padding mbr-box__magnet--center-center">
        <div class="mbr-overlay" style="opacity: 0.3; background-color: rgb(34, 34, 34);"></div>
        <div class="mbr-box__container mbr-section__container container">
            <div class="mbr-box mbr-box--stretched"><div class="mbr-box__magnet mbr-box__magnet--center-center">
                <div class="row"><div class=" col-sm-8 col-sm-offset-2">
                    <div class="mbr-hero animated fadeInUp">
                        
              
                      
                    <p class="mbr-hero__subtext">
                                    <!-- code-->
                                   		 <form style="font-size:25px; align:center" action="servlet" method="get">
                   

               <table style="display: inline-block;">
												<tr>
													<th align="center"><u>Recipe: ${dname} &nbsp;</u>  
													<input type="hidden" name="dindex" value="${dname}"/> <br>rating stars:
													<c:if test="${rating eq 5}">★★★★★</c:if>
													<c:if test="${rating eq 4}">★★★★</c:if>
													<c:if test="${rating eq 3}">★★★</c:if>
													<c:if test="${rating eq 2}">★★</c:if>
													<c:if test="${rating eq 1}">★</c:if>
													</th>
													
													
												</tr>

												<c:forEach var="recipe" items="${recipe}">
													<tr>
													
														<td align="left">${recipe}</td>
														<c:if test="${recipe eq ' '}">
														<td align="left">No results found. Please try some other choices</td>
														</c:if>
														
															
													</tr>
												</c:forEach>
											</table>
                                 <div class="mbr-buttons btn-inverse mbr-buttons--center">
                    
                    <input type="submit" name="action" value="Check Work Out" class="mbr-buttons__btn btn btn-lg btn-success"/>
															
                     <a class="mbr-buttons__btn btn btn-lg btn-default animated fadeInUp delay" href="dishlist.jsp">Back</a></div>
            
                                        </form>
                                         </p>
                      
                     
                    </div>
                       </div></div>
            </div></div>
        </div>
        
    </div>
</section>


  <script src="assets/web/assets/jquery/jquery.min.js"></script>
  <script src="assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="assets/smooth-scroll/SmoothScroll.js"></script>
  <script src="assets/jarallax/jarallax.js"></script>
  <script src="assets/mobirise/js/script.js"></script>
  <script src="assets/dropdown-menu-plugin/script.js"></script>
  
</body>
</html>
