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
            <div class="main-menu" id="main-menu">
                <ul>
                    <li><a href="">Bộ Sưu Tập</a>
                        <ul class="sub-menu">
                            <div class="sub-content">
                                <div class="sub-left">
                                     <a href="/bst-trang-suc-kim-cuong-shining-drop" title="BST Trang s&#x1EE9;c Kim c&#x1B0;&#x1A1;ng Shining Drop"><span>BST Trang sức Kim cương Shining Drop</span></a>
                                                        <a href="/bst-ts-kim-cuong-blooming-rose" title="BST Trang s&#x1EE9;c kim c&#x1B0;&#x1A1;ng Blooming Rose"><span>BST Trang sức kim cương Blooming Rose</span></a>
                                                        <a href="/bst-nhan-dinh-hon-yes-i-do" title="BST Nh&#x1EAB;n &#x111;&amp;#237;nh h&amp;#244;n Yes, I Do"><span>BST Nhẫn đ&#237;nh h&#244;n Yes, I Do</span></a>
                                                        <a href="/bst-trang-suc-ngoc-trai-the-moonlight" title="BST Trang s&#x1EE9;c Ng&#x1ECD;c trai The Moonlight"><span>BST Trang sức Ngọc trai The Moonlight</span></a>
                                                        <a href="/bst-ts-kim-cuong-brilliant-style" title="BST Trang s&#x1EE9;c kim c&#x1B0;&#x1A1;ng Brilliant Style"><span>BST Trang sức kim cương Brilliant Style</span></a>
                                                        <a href="/bst-ts-kim-cuong-the-leading-star" title="BST Trang s&#x1EE9;c kim c&#x1B0;&#x1A1;ng The Leading Star"><span>BST Trang sức kim cương The Leading Star</span></a>
                                                        <a href="/bst-ts-kim-cuong-rays-of-light" title="BST Trang s&#x1EE9;c kim c&#x1B0;&#x1A1;ng Rays Of Light"><span>BST Trang sức kim cương Rays Of Light</span></a>
                                                        <a href="/bst-nhan-cuoi-loving-heart" title="BST Nh&#x1EAB;n c&#x1B0;&#x1EDB;i Loving Heart"><span>BST Nhẫn cưới Loving Heart</span></a>
                                                        <a href="/bst-trang-suc-tre-lucky-star" title="BST Trang s&#x1EE9;c tr&#x1EBB; Lucky Star"><span>BST Trang sức trẻ Lucky Star</span></a>
                                                        <a href="/bst-ts-kim-cuong-nhu-doa-tra-my" title="BST TS Kim c&#x1B0;&#x1A1;ng Nh&#x1B0; &#x111;&amp;#243;a Tr&amp;#224; My"><span>BST TS Kim cương Như đ&#243;a Tr&#224; My</span></a>
                                                        <a href="/bst-ts-kim-cuong-queen-of-hearts" title="BST TS Kim c&#x1B0;&#x1A1;ng Queen Of Hearts"><span>BST TS Kim cương Queen Of Hearts</span></a>
                                                        <a href="https://trangsuc.doji.vn/bst-trang-suc-kim-cuong-jasmine" title="BST TRANG S&#x1EE8;C KIM C&#x1AF;&#x1A0;NG JASMINE"><span>BST TRANG SỨC KIM CƯƠNG JASMINE</span></a>
                                                        <a href="https://trangsuc.doji.vn/bst-the-trio" title="BST TRANG S&#x1EE8;C TR&#x1EBA; THE TRIO"><span>BST TRANG SỨC TRẺ THE TRIO</span></a>
                                                        <a href="https://trangsuc.doji.vn/bst-trang-suc-kim-cuong-drop-of-light" title="BST TRANG S&#x1EE8;C KIM C&#x1AF;&#x1A0;NG DROP OF LIGHT"><span>BST TRANG SỨC KIM CƯƠNG DROP OF LIGHT</span></a>
                                </div>
                                <div class="sub-right">

                                </div>
                            </div>
                        </ul>
                    </li>
                    <li><a href="">Kim CƯơng Viên</a>
                    	 <ul class="sub-menu">
                            <div class="sub-content">
                                <div class="sub-left">
                                    
                                             <div class="item-sbmn">
                                                 <p>K&#237;nh thước</p>
                                                     <div class="lstsbmn">
                                                             <a href="/kim-cuong-vien?kich-thuoc-size=16991" class="" title="7.0 ly - 7.9 ly"><span>7.0 ly - 7.9 ly</span></a>
                                                             <a href="/kim-cuong-vien?kich-thuoc-size=16992,16993" class="" title="Tr&amp;#234;n 8 ly"><span>Trên 8 ly</span></a>
                                                     </div>
                                             </div>
                                             <div class="item-sbmn">
                                                 <p>Mức gi&#225;</p>
                                                     <div class="lstsbmn">
                                                             <a href="/kim-cuong-vien?gia=0,20" class="" title="D&#x1B0;&#x1EDB;i 20 tri&#x1EC7;u"><span>Dưới 20 triệu</span></a>
                                                             <a href="/kim-cuong-vien?gia=20,50" class="" title="20 tri&#x1EC7;u - 50 tri&#x1EC7;u"><span>20 triệu - 50 triệu</span></a>
                                                             <a href="/kim-cuong-vien?gia=50,200" class="" title="50 tri&#x1EC7;u - 200 tri&#x1EC7;u"><span>50 triệu - 200 triệu</span></a>
                                                             <a href="/kim-cuong-vien?gia=200,400" class="" title="200 tri&#x1EC7;u - 400 tri&#x1EC7;u"><span>200 triệu - 400 triệu</span></a>
                                                             <a href="/kim-cuong-vien?gia=400,1000" class="" title="400 tri&#x1EC7;u - 1 t&#x1EF7;"><span>400 triệu - 1 tỷ</span></a>
                                                             <a href="/kim-cuong-vien?gia=1000,0" class="" title="T&#x1EEB; 1 t&#x1EF7; tr&#x1EDF; l&amp;#234;n"><span>Từ 1 tỷ trở lên</span></a>
                                                     </div>
                                                        
                                    
                                </div>
                                <div class="sub-right">

                                </div>
                            </div>
                        </ul>
                    </li>
                    <li><a href="">TRang Sức kim cương</a></li>
                    <li><a href="">trang sức đá màu</a></li>
                    <li><a href="">trang sức ngọc trai</a></li>
                    <li><a href="">trang sức cưới</a></li>
                    <li><a href="">trang sức ecz</a></li>
                    <li><a href="">đồng hồ</a></li>
                    <li><a href="">trang sức vàng 24k</a></li>
                    <li><a href="">quà tặng</a></li>
                    <li><a href="">sale</a></li>
                </ul>
            </div>
        </div>
    </body>

    </html>