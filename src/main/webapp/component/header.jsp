<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>


    <html>

    <head>
        <link rel="stylesheet" href="css/header.css">
        <%@include file="allcss.jsp" %>
    </head>

    <body>
        <div class="header container">
            <div class="row">
                <div class="hd-top d-flex justify-content-between my-1">
                    <div class="hd-top-l">
                        <a href="#" class="text-dark text-decoration-none me-2"><i
                                class="fa-regular fa-building text-danger"></i> Về
                            trang sức toji</a>
                        <a href="" class="text-dark text-decoration-none "><i
                                class="fa-solid fa-phone text-danger"></i>01234456</a>
                    </div>
                    <div class="hd-top-r">
                        <div style="display: inline-block; " class="acount">
                            <a href="#" class="text-dark text-decoration-none ">
                                <i class="fa-regular fa-user text-danger"></i>Tài khoản</a>
                            <ul class="menu-account">
                                <li><a href="">Đăng nhập</a></li>
                                <li><a href="">Đăng ký</a></li>
                            </ul>
                        </div>

                        <a href="cart.jsp" class="text-dark text-decoration-none">
                            <i class="fa-solid fa-cart-shopping text-danger"></i> Giỏ
                            hàng</a>
                    </div>

                </div>
            </div>
            <div class="row logo-t">
                <div class="logo text-center border-bottom pb-2">
                    <a href="index.jsp"><img src="asesst/logo-t.png" alt=""></a>
                </div>
                <form action="/search" class="fsearch" method="get">
                    <input name="q" type="text" placeholder="Tìm kiếm sản phẩm" class="valid input px-2 py-2"
                        required="" id="AutoComplete">
                    <button class="btn" type="submit"><i class="fa-solid fa-magnifying-glass"></i></button>
                </form>
            </div>
        </div>
    </body>

    </html>