<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Site made with Mobirise Website Builder v2.11.1, https://mobirise.com JSP-->
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="generator" content="Mobirise v2.11.1, mobirise.com">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="shortcut icon" href="assets/images/13jtyd.gif" type="image/x-icon">
  <meta name="description" content="">
  
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:700,400&amp;subset=cyrillic,latin,greek,vietnamese">
  <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet" href="assets/mobirise/css/style.css">
  <link rel="stylesheet" href="assets/dropdown-menu-plugin/style.css">
  <link rel="stylesheet" href="assets/mobirise-slider/style.css">
  <link rel="stylesheet" href="assets/mobirise/css/mbr-additional.css" type="text/css">

<title>Page 2</title>
</head>
<body>


<section class="mbr-navbar mbr-navbar--freeze mbr-navbar--absolute mbr-navbar--transparent mbr-navbar--sticky mbr-navbar--auto-collapse" id="menu-11">
    <div class="mbr-navbar__section mbr-section">
        <div class="mbr-section__container container">
            <div class="mbr-navbar__container">
                <div class="mbr-navbar__column mbr-navbar__column--s mbr-navbar__brand">
                    <span class="mbr-navbar__brand-link mbr-brand mbr-brand--inline">
                        <span class="mbr-brand__logo"><a href="page1.html"><img src="assets/images/13jtyd.gif" class="mbr-navbar__brand-img mbr-brand__img" alt="Mobirise"></a></span>
                        <span class="mbr-brand__name"><a class="mbr-brand__name text-grey" href="page1.html">Chef Oracle</a></span>
                    </span>
                </div>
                <div class="mbr-navbar__hamburger mbr-hamburger"><span class="mbr-hamburger__line"></span></div>
                <div class="mbr-navbar__column mbr-navbar__menu">
                    <nav class="mbr-navbar__menu-box mbr-navbar__menu-box--inline-right">
                        <div class="mbr-navbar__column">
                            <ul class="mbr-navbar__items mbr-navbar__items--right float-left mbr-buttons mbr-buttons--freeze mbr-buttons--right btn-decorator mbr-buttons--active mbr-buttons--only-links"><li class="mbr-navbar__item"><a class="mbr-buttons__link btn text-grey" href="page1.html">HOME</a></li><li class="mbr-navbar__item"><a class="mbr-buttons__link btn text-white" href="https://mobirise.com"></a></li></ul>                            
                            
                        </div>
                    </nav>
                </div>
            </div>
        </div>
    </div>
</section>

<section class="engine"><a rel="external" href="https://mobirise.com">easy website builder software</a></section><section class="mbr-slider mbr-section mbr-section--no-padding carousel slide mbr-after-navbar" data-ride="carousel" data-wrap="true" data-interval="5000" id="slider-8" style="background-color: rgb(255, 255, 255);">
    <div class="mbr-section__container">
        <div>
            <ol class="carousel-indicators">
                <li data-app-prevent-settings="" data-target="#slider-8" data-slide-to="0" class="active"></li><li data-app-prevent-settings="" data-target="#slider-8" class="" data-slide-to="1"></li><li data-app-prevent-settings="" data-target="#slider-8" data-slide-to="2"></li><li data-app-prevent-settings="" data-target="#slider-8" data-slide-to="3"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="mbr-box mbr-section mbr-section--relative mbr-section--fixed-size mbr-section--bg-adapted item dark center mbr-section--full-height active" style="background-image: url(assets/images/food-dark-1600x1067-92.jpg);">
                    <div class="mbr-box__magnet mbr-box__magnet--center-center mbr-box__magnet--sm-padding">
                    <div class="mbr-overlay" style="opacity: 0.3;"></div>                        
                        <div class=" container">
                            
                            <div class="row">
                                <div class=" col-md-8 col-md-offset-2">  

                                <div class="mbr-hero">
                                    <h1 class="mbr-hero__text">Slide 1: Cuisine</h1>

                                    <p class="mbr-hero__subtext">
                                    <!-- code-->
                                   		 <form style="font-size:25px; align:center" action="servlet" method="get">


											<table style="display: inline-block;">
												<tr>
													<th align="center"><u>Continental</u></th>
												</tr>

												<c:forEach var="list_continental"
													items="${list_continental}">
													<tr>
														<td align="left">
													
														<input type="checkbox"
															name="cuisines" value="${list_continental.cname}">
															 ${list_continental.cname}</td>
													</tr>
												</c:forEach>
												<tr><td><input type="hidden" name="cuisines" value="default" checked="checked"></td></tr>
											</table>
 								
 								&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;

											<table style="display: inline-block;">
												<tr>
													<th align="center"><u>Oriental</u></th>
												</tr>

												<c:forEach var="list_oriental"
													items="${list_oriental}">
													<tr>
														<td align="left"><input type="checkbox"
															name="cuisines" value="${list_oriental.cname}">
															 ${list_oriental.cname}</td>
													</tr>
												</c:forEach>
											</table>


											
											<br><br><br><br><br><br><br><br>
                                        </div>
                                        
                                        </p> 
                           
                                </div>
                                
                                
                            </div>
                        </div>
                    </div>
                </div>
                
                
                        
                
                
                <div class="mbr-box mbr-section mbr-section--relative mbr-section--fixed-size mbr-section--bg-adapted item dark center mbr-section--full-height" style="background-image: url(assets/images/food-dark-1600x1067-52.jpg);">
                    <div class="mbr-box__magnet mbr-box__magnet--center-center mbr-box__magnet--sm-padding">
                    <div class="mbr-overlay" style="opacity: 0.3;"></div>                        
                        <div class=" container">
                            
                            <div class="row">
                                <div class=" col-md-8 col-md-offset-2">  

                                <div class="mbr-hero">
                                    <h1 class="mbr-hero__text">Slide 3:Meal Type</h1>
									
									
                                    <p class="mbr-hero__subtext"><br><br>
                                    <table cellpadding="50" style="font-size:25px" align="center">
                                        
                                        
                                    <c:forEach var="list_mealType" items="${list_mealType}">
                                        
                                        <tr style="align:left">
                                        <td>
                                      
                                        <input type="checkbox" name="mealtype" value="${list_mealType.mname}"></td>
                                        <td>&nbsp;${list_mealType.mname}</td>
                                        </tr>
                                        </c:forEach>
									<tr><td><input type="hidden" name="mealtype" value="default" checked="checked"></td></tr>
									
									
                                    <!--   <tr>
                                        <td align:left><input type="checkbox" name="mealtype" value="lunch"></td>
                                        <td align:left>Lunch</td>
                                        </tr>


                                        <tr>
                                        <td align:left><input type="checkbox" name="mealtype" value="dinner"></td>
                                        <td align:left>Dinner</td>
                                        </tr>


                                        <tr>
                                        <td><input type="checkbox" name="mealtype" value="appetizers"></td>
                                        <td>&nbsp;Soups</td>
                                        </tr>

                                        <tr>
                                        <td><input type="checkbox" name="mealtype" value="salad"></td>
                                        <td>Salad</td>
                                        </tr>--> 
                                        
                                        
                                    </table>

                                    <br><br><br><br><br><br></p>
                                     </div>
                                   
                                </div>
                                
                            </div>
                        </div>
                    </div>
                </div><div class="mbr-box mbr-section mbr-section--relative mbr-section--fixed-size mbr-section--bg-adapted item dark center mbr-section--full-height" style="background-image: url(assets/images/food-dark-1600x1067-52.jpg);">
                    <div class="mbr-box__magnet mbr-box__magnet--center-center mbr-box__magnet--sm-padding">
                    <div class="mbr-overlay" style="opacity: 0.3;"></div>                        
                        <div class=" container">
                            
                            <div class="row" style="font-size:25px; align:center">
                                <div class=" col-md-8 col-md-offset-2">  

                                <div class="mbr-hero">
                                    <h1 class="mbr-hero__text">Slide 4: Select Ingredients</h1>

                                    <p class="mbr-hero__subtext"><br><br>
                                    <!--code-->
									
			       
			        <table style="display: inline-block;" >
			        	<tr>
			            	<th align="center" ><u>Vegetables<br>and Fruits</u></th>
					 	</tr>
			        
			        <c:forEach var="list1" items="${list1}">
			        	<tr>
			            	<td align="left" >
			            	
			            	
			            	<input type="checkbox" name="ingredients" value="${list1.inname}" > ${list1.inname}</td>     
			       		 </tr>
			       		 </c:forEach>
			       		 <tr><td><input type="hidden" name="ingredients" value="default" checked="checked"></td></tr>
			       
			   	 </table>
			    
    &nbsp;
    <table style="display: inline-block;" >
			        	<tr>
			            	<th align="center" ><u>Meats<br>and Fishes</u></th>
					 	</tr>
			        
			        <c:forEach var="list2" items="${list2}">
			        	<tr>
			            	<td align="left" ><input type="checkbox" name="ingredients" value="${list2.inname}"> ${list2.inname}</td>     
			       		 </tr>
			        </c:forEach>
			   	 </table>
			   	 
			   	  &nbsp;
			   	 <table style="display: inline-block;" >
			        	<tr>
			            	<th align="left"><u>Proteins<br>and Carbohydrates</u></th>
					 	</tr>
			        
			        <c:forEach var="list3" items="${list3}">
			        	<tr>
			            	<td align="left"><input type="checkbox" name="ingredients" value="${list3.inname}"> ${list3.inname}</td>     
			       		 </tr>
			        </c:forEach>
			   	 </table>
			   	 
			   	  &nbsp;
			   	 <table style="display: inline-block;" >
			        	<tr>
			            	<th align="center"><u>Sauces<br>and Wines</u></th>
					 	</tr>
			        
			        <c:forEach var="list4" items="${list4}">
			        	<tr>
			            	<td align="left"><input type="checkbox" name="ingredients" value="${list4.inname}"> ${list4.inname}</td>     
			       		 </tr>
			        </c:forEach>
			   	 </table>
                                    
                                    
                                    
                                    

                                        <br><br><br>
                                        <label style="font-size:20px">Other input:  </label>
                                        <input type="textfield" name="other" style="color:black">
                                       
                                    <!--code-->
                                    <br><br></p>
                                </div>
                                <div class="mbr-buttons btn-inverse mbr-buttons--center">
                                <input type="submit" name="action" value="Ask Chef Oracle" class="mbr-buttons__btn btn btn-lg btn-success">
                                <!-- <a class="mbr-buttons__btn btn btn-lg btn-success" href="page3.html">Ask Chef Oracle</a> --> </div>
                                </div>
                                        
                                         
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
            <a data-app-prevent-settings="" class="left carousel-control" role="button" data-slide="prev" href="#slider-8">
                <span class="glyphicon glyphicon-menu-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a data-app-prevent-settings="" class="right carousel-control" role="button" data-slide="next" href="#slider-8">
                <span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
    </div>
</section>


  <script src="assets/web/assets/jquery/jquery.min.js"></script>
  <script src="assets/bootstrap/js/bootstrap.min.js"></script>
  <script src="assets/smooth-scroll/SmoothScroll.js"></script>
  <script src="assets/bootstrap-carousel-swipe/bootstrap-carousel-swipe.js"></script>
  <script src="assets/mobirise/js/script.js"></script>
  <script src="assets/dropdown-menu-plugin/script.js"></script>
  


</body>
</html>