<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Contact | E-Shopper</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/font-awesome.min.css" rel="stylesheet">
    <link href="/css/prettyPhoto.css" rel="stylesheet">
    <link href="/css/price-range.css" rel="stylesheet">
    <link href="/css/animate.css" rel="stylesheet">
    <link href="/css/main.css" rel="stylesheet">
    <link href="/css/responsive.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="/js/html5shiv.js"></script>
    <script src="/js/respond.min.js"></script>
    <![endif]-->
    <link rel="shortcut icon" href="/images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="/images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="/images/ico/apple-touch-icon-57-precomposed.png">
</head>
<!--/head-->
<body>
<header id="header"><!--header-->
    <div class="header_top"><!--header_top-->
        <div class="container">
            <div class="row">

                <div class="col-sm-6">
                    <div class="social-icons pull-right">
                        <ul class="nav navbar-nav">
                            <li><a target="_blank" href="https://web.facebook.com/profile.php?id=100009074155208"><i
                                    class="fa fa-facebook"></i></a></li>
                            <li><a href="https://twitter.com/tweter"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="https://www.linkedin.com/"><i class="fa fa-linkedin"></i></a></li>
                            <%--<li><a href="#"><i class="fa fa-ok"></i></a></li>--%>
                            <li><a href="https://www.google.am/?gws_rd=cr,ssl&ei=4nh4Wc_AA6jw6ASQ1bqIAQ"><i
                                    class="fa fa-google-plus"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div><!--/header_top-->

    <div class="header-middle"><!--header-middle-->
        <div class="container">
            <div class="row">
                <div class="col-sm-4">
                    <div class="logo pull-left">
                        <a href="/"><img src="/images/home/logo.png" alt=""/></a>
                    </div>

                </div>
                <div class="col-sm-8">
                    <div class="shop-menu pull-right">
                        <ul class="nav navbar-nav">
                            <%--<li><a href="#"><i class="fa fa-user"></i> Account</a></li>--%>
                            <%--<li><a href="#"><i class="fa fa-star"></i> Wishlist</a></li>--%>
                            <li><a href="/checkout"><i class="fa fa-crosshairs"></i> Checkout</a></li>
                            <%--<li><a href="/cart"><i class="fa fa-shopping-cart"></i> Cart</a></li>--%>
                            <%--<li><a href="/LOGIN"><i class="fa fa-lock"></i> Login</a></li>--%>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div><!--/header-middle-->

    <div class="header-bottom"><!--header-bottom-->
        <div class="container">
            <div class="row">
                <div class="col-sm-9">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse"
                                data-target=".navbar-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <div class="mainmenu pull-left">
                        <ul class="nav navbar-nav collapse navbar-collapse">
                            <li><a href="/" class="active">Home</a></li>                   <!--BIG link to HOME -->
                            <li class="dropdown"><a href="#">Shop<i class="fa fa-angle-down"></i></a>
                                <ul role="menu" class="sub-menu">
                                    <li><a href="/products">Products</a></li>
                                    <%--<li><a href="product-details">Product Details</a></li>--%>
                                    <li><a href="/checkout">Checkout</a></li>
                                    <li><a href="/cart">Cart</a></li>
                                    <li><a href="/LOGIN">Login</a></li>
                                </ul>
                            </li>
                            <li class="dropdown"><a href="#">Blog<i class="fa fa-angle-down"></i></a>
                                <ul role="menu" class="sub-menu">
                                    <li><a href="/blog">Blog List</a></li>
                                    <li><a href="/blog-single">Blog Single</a></li>
                                </ul>
                            </li>
                            <li><a href="/contact-us">Contact</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-sm-3">
                    <div class="search_box pull-right">
                        <input type="text" placeholder="Search"/>
                    </div>
                </div>
            </div>
        </div>
    </div><!--/header-bottom-->
</header><!--/header-->


<div id="contact-page" class="container">
    <div class="bg">

        <div class="row">
            <div class="col-sm-8">
                <div class="contact-form">
                    <h2 class="title text-center">ADD</h2>
                    <div class="status alert alert-success" style="display: none"></div>

                    <%--ADD BRAND--%>
                    <form:form id="main-contact-form" class="contact-form row" name="addBrand" method="post"
                               action="/admin/brand/add" role="form">
                        <div class="form-group col-md-12">
                            <input type="text" name="brandName" class="form-control" required="required"
                                   placeholder="brand name">
                        </div>

                        <div class="form-group col-md-12">
                            <input type="submit" name="submit" class="btn btn-primary pull-right" value="Add Brand">
                        </div>
                    </form:form><br><br>

                    <%--ADD CATEGTORY--%>
                    <form:form id="main-contact-form" class="contact-form row" name="addCategory" method="post"
                               action="/admin/category/add" role="form">
                        <div class="form-group col-md-12">
                            <input type="text" name="category" class="form-control" required="required"
                                   placeholder="categeory name">
                        </div>

                        <div class="form-group col-md-12">
                            <input type="submit" name="submit" class="btn btn-primary pull-right" value="Add Category">
                        </div>
                    </form:form><br><br>

                    <%--ADD PRODUCT--%>
                    <form:form id="main-contact-form" class="contact-form row" name="addProduct" method="post"
                               action="/admin/product/add"
                               enctype="multipart/form-data" role="form">
                        <div class="form-group col-md-12">
                            <input type="text" name="prodName" class="form-control" required="required"
                                   placeholder="product name">
                        </div>

                        <div class="form-group col-md-12">
                            <input type="file" id="image" name="img" class="form-control">
                        </div>

                        <div class="form-group col-md-12">
                            <input type="text" name="price" class="form-control" required="required"
                                   placeholder="product price">
                        </div>

                        <div class="form-group col-md-12">
                            <input type="text" name="quantity" class="form-control" required="required"
                                   placeholder="product quantity">
                        </div>

                        <div class="form-group col-md-12">
                            <input type="text" name="condit" class="form-control" required="required"
                                   placeholder="product condition">
                        </div>

                        <div class="form-group col-md-12">
                            <input type="text" name="availability" class="form-control" required="required"
                                   placeholder="product availability">
                        </div>


                        <div class="form-group col-md-12">
                            <select name="categoryByCategoryId" class="form-control">
                                <label for="category">choose the category for product</label>
                                <c:forEach items="${categories}" var="category">
                                    <option value="${category.id}" id="category">${category.category}
                                    </option>
                                </c:forEach>
                            </select>
                        </div>


                        <div class="form-group col-md-12">
                            <select name="purposeByPurposeId" class="form-control">
                                <label for="category">choose the category for product</label>
                                <c:forEach items="${purposes}" var="purpose">
                                    <option value="${purpose.id}" id="purpose">${purpose.purposeName}
                                    </option>
                                </c:forEach>
                            </select>
                        </div>


                        <div class="form-group col-md-12">
                            <select name="brandByBrandId" class="form-control">
                                <label for="brand">choose the category for product</label>
                                <c:forEach items="${brands}" var="brand">
                                    <option value="${brand.id}" id="brand">${brand.brandName}
                                    </option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="form-group col-md-12">
                            <input type="submit" name="submit" class="btn btn-primary pull-right" value="Add Product">
                        </div>

                    </form:form>




                                                <%--ADD CAROUSEL--%>




                    <form:form id="main-contact-form" class="contact-form row" name="carousel" method="post"
                               action="/admin/carousel/add" enctype="multipart/form-data" role="form">


                        <div class="form-group col-md-12">
                            <input type="text" name="logoText1" class="form-control" required="required"
                                   placeholder="logoText1">
                        </div>

                        <div class="form-group col-md-12">
                            <input type="text" name="logoText2" class="form-control" required="required"
                                   placeholder="logoText2">
                        </div>

                        <div class="form-group col-md-12">
                            <input type="text" name="header" class="form-control" required="required"
                                   placeholder="header">
                        </div>


                        <div class="form-group col-md-12">
                            <input type="text" name="description" class="form-control" required="required"
                                   placeholder="description">
                        </div>

                        <div class="form-group col-md-12">
                            <input type="file"  name="img1" class="form-control">
                        </div>


                        <div class="form-group col-md-12">
                            <input type="file"  name="img2" class="form-control">
                        </div>


                        <div class="form-group col-md-12">
                            <select name="carouselsPosition" class="form-control">
                                <label for="carousel">fixed position is after the number below or the first</label>

                                <option class="carousel" value="0">First</option>
                                <c:forEach items="${carousels}" var="carousel">
                                    <option value="${carousel.position}" class="carousel">${carousel.position}
                                    </option>
                                </c:forEach>
                            </select>
                        </div>

                        <div class="form-group col-md-12">
                            <input type="submit" name="submit" class="btn btn-primary pull-right" value="Add Slider">
                        </div>

                    </form:form>










                </div>
                <div class="contact-form">
                    <h2 class="title text-center">DELETE</h2>

                    <%--REMOVE BRAND--%>
                    <form:form id="main-contact-form" class="contact-form row" name="deleteBrand" method="post"
                               action="/admin/brand/delete" role="form">
                        <div class="form-group col-md-12">
                            <select name="brandName" class="form-control">
                                <label for="brand">choose the brand</label>
                                <c:forEach items="${brands}" var="brand">


                                    <option value="${brand.brandName}" id="brand">${brand.brandName}
                                    </option>
                                </c:forEach>
                            </select>

                            <div class="form-group col-md-12">
                                <input type="submit" name="submit" class="btn btn-primary pull-right"
                                       value="Delete Brand">
                            </div>

                        </div>

                    </form:form><br>

                    <%--REMOVE CATEGORY                                                            --%>
                    <form:form id="main-contact-form" class="contact-form row" name="deleteCategory" method="post"
                               action="/admin/category/delete" role="form">
                        <div class="form-group col-md-12">
                            <select name="categoryName" class="form-control">
                                <label for="category">choose the category</label>
                                <c:forEach items="${categories}" var="category">


                                    <option value="${category.category}" id="category">${category.category}
                                    </option>
                                </c:forEach>
                            </select>
                            <div class="form-group col-md-12">
                                <input type="submit" name="submit" class="btn btn-primary pull-right"
                                       value="Delete Category">
                            </div>
                        </div>


                    </form:form><br>

                    <%--REMOVE PRODUCT--%>
                    <form:form id="main-contact-form" class="contact-form row" name="deleteProduct" method="post"
                               action="/admin/product/delete" role="form">
                        <div class="form-group col-md-12">
                            <select name="prodName" class="form-control">
                                <label for="prod">choose the brand</label>
                                <c:forEach items="${products}" var="product">


                                    <option value="${product.prodName}" id="prod">${product.prodName}
                                    </option>
                                </c:forEach>
                            </select>

                            <div class="form-group col-md-12">
                                <input type="submit" name="submit" class="btn btn-primary pull-right"
                                       value="Delete Product">
                            </div>

                        </div>

                    </form:form><br>

                    <%--UPDATE CAROUSEL--%>


                    <%--<form:form id="main-contact-form" class="contact-form row" name="carousel" method="post"--%>
                               <%--action="/admin/carousel/remove" enctype="multipart/form-data" role="form">--%>


                        <%--<div class="form-group col-md-12">--%>
                            <%--<input type="text" name="logoText1" class="form-control" required="required"--%>
                                   <%--placeholder="logoText1">--%>
                        <%--</div>--%>

                        <%--<div class="form-group col-md-12">--%>
                            <%--<input type="text" name="logoText2" class="form-control" required="required"--%>
                                   <%--placeholder="logoText2">--%>
                        <%--</div>--%>

                        <%--<div class="form-group col-md-12">--%>
                            <%--<input type="text" name="header" class="form-control" required="required"--%>
                                   <%--placeholder="header">--%>
                        <%--</div>--%>


                        <%--<div class="form-group col-md-12">--%>
                            <%--<input type="text" name="description" class="form-control" required="required"--%>
                                   <%--placeholder="description">--%>
                        <%--</div>--%>

                        <%--<div class="form-group col-md-12">--%>
                            <%--<input type="file" id="image1" name="imgage1" class="form-control">--%>
                        <%--</div>--%>


                        <%--<div class="form-group col-md-12">--%>
                            <%--<input type="file" id="image2" name="imgage2" class="form-control">--%>
                        <%--</div>--%>


                        <%--<div class="form-group col-md-12">--%>
                            <%--<select name="categoryByCategoryId" class="form-control">--%>
                                <%--<label for="category">choose the category for product</label>--%>
                                <%--<c:forEach items="${carousels}" var="carousel">--%>
                                    <%--<option value="${carousel.position}" id="carousel">${carousel.position}--%>
                                    <%--</option>--%>
                                <%--</c:forEach>--%>
                            <%--</select>--%>
                        <%--</div>--%>

                        <%--<div class="form-group col-md-12">--%>
                            <%--<input type="submit" name="submit" class="btn btn-primary pull-right" value="Add Product">--%>
                        <%--</div>--%>

                    <%--</form:form>--%>






                </div>
            </div>

        </div>
    </div>
</div><!--/#contact-page-->

<footer id="footer"><!--Footer-->
    <div class="footer-top">
        <div class="container">
            <div class="row">
                <div class="col-sm-2">
                    <div class="companyinfo">
                        <h2><span>e</span>-shopper</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,sed do eiusmod tempor</p>
                    </div>
                </div>
                <div class="col-sm-7">
                    <div class="col-sm-3">
                        <div class="video-gallery text-center">
                            <a href="#">
                                <div class="iframe-img">
                                    <img src="/images/home/iframe1.png" alt=""/>
                                </div>
                                <div class="overlay-icon">
                                    <i class="fa fa-play-circle-o"></i>
                                </div>
                            </a>
                            <p>Circle of Hands</p>
                            <h2>24 DEC 2014</h2>
                        </div>
                    </div>

                    <div class="col-sm-3">
                        <div class="video-gallery text-center">
                            <a href="#">
                                <div class="iframe-img">
                                    <img src="/images/home/iframe2.png" alt=""/>
                                </div>
                                <div class="overlay-icon">
                                    <i class="fa fa-play-circle-o"></i>
                                </div>
                            </a>
                            <p>Circle of Hands</p>
                            <h2>24 DEC 2014</h2>
                        </div>
                    </div>

                    <div class="col-sm-3">
                        <div class="video-gallery text-center">
                            <a href="#">
                                <div class="iframe-img">
                                    <img src="/images/home/iframe3.png" alt=""/>
                                </div>
                                <div class="overlay-icon">
                                    <i class="fa fa-play-circle-o"></i>
                                </div>
                            </a>
                            <p>Circle of Hands</p>
                            <h2>24 DEC 2014</h2>
                        </div>
                    </div>

                    <div class="col-sm-3">
                        <div class="video-gallery text-center">
                            <a href="#">
                                <div class="iframe-img">
                                    <img src="/images/home/iframe4.png" alt=""/>
                                </div>
                                <div class="overlay-icon">
                                    <i class="fa fa-play-circle-o"></i>
                                </div>
                            </a>
                            <p>Circle of Hands</p>
                            <h2>24 DEC 2014</h2>
                        </div>
                    </div>
                </div>
                <div class="col-sm-3">
                    <div class="address">
                        <img src="/images/home/map.png" alt=""/>
                        <p>ՀՀԱԿ, ԵՐԵՎԱՆ, ՀՀ
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="footer-widget">
        <div class="container">

        </div>
    </div>

    <div class="footer-bottom">
        <div class="container">
            <div class="row">
                <p class="pull-left">Copyright © 2013 E-SHOPPER Inc. All rights reserved.</p>
                <p class="pull-right">Designed by ME</p>
            </div>
        </div>
    </div>

</footer><!--/Footer-->


<script src="/js/jquery.js"></script>
<script src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=true"></script>
<script type="text/javascript" src="/js/gmaps.js"></script>
<script src="/js/contact.js"></script>
<script src="/js/price-range.js"></script>
<script src="/js/jquery.scrollUp.min.js"></script>
<script src="/js/jquery.prettyPhoto.js"></script>
<script src="/js/main.js"></script>


</body>
</html>
