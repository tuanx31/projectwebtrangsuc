<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file="component/allcss.jsp" %>
            <title>Giỏ hàng</title>
            <link rel="stylesheet" href="css/cart.css">
    </head>

    <body>
        <%@include file="component/header.jsp" %>
            <div class="container">
                <h4 class="text-uppercase w-100 border-bottom py-2">Giỏ hàng</h4>
                <table class="table">
                    <thead>
                        <tr class="text-center">
                            <th scope="col" class="text-muted fw-normal">Hình ảnh</th>
                            <th scope="col" class="text-muted fw-normal">Tên sản phẩm</th>
                            <th scope="col" class="text-muted fw-normal">Đơn giá</th>
                            <th scope="col" class="text-muted fw-normal">Số lượng</th>
                            <th scope="col" class="text-muted fw-normal">Tổng giá</th>
                            <th scope="col" class="text-muted fw-normal">Xóa</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr class="text-center desktopItemCart" style="vertical-align:middle;">
                            <th scope="row"><img src="asesst/afeb902078f2hm1_2.jpg" alt="hinh anh"
                                    style="width: 120px;height: 120px;" /></th>
                            <td class="text-muted fw-normal">
                                <p class='mt-1'>BÔNG TAI KIM CƯƠNG AFEB902078F2HM1</p>
                            </td>
                            <td class="fw-bold dongia">30,988,000đ</td>
                            <td> <button class='btn fw-bold fs-5 btn-light'>-</button>
                                <input class='inputNumCart text-center border-0 bg-light' value="1" type="text"
                                    min="0" />
                                <button class='btn fw-bold fs-5 btn-light'>+</button>
                            </td>
                            <th>30,988,000đ</th>
                            <td><i class="fa-solid fa-trash text-danger" style="cursor: pointer;"></i></td>
                        </tr>
                    </tbody>
                </table>
                <a href="index.jsp">Tiếp tục mua hàng</a>
            </div>
    </body>

    </html>