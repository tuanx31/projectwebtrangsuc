<%@page import="model.Cart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>

    <body>
        <%@include file="component/header.jsp" %>
            <div class="container">
                <h3 class="text-center fw-bold text-uppercase">Đơn hàng đã đặt</h3>
                <table class="table">
                    <thead>
                        <tr class="text-center">
                            <th scope="col" class="text-muted fw-normal">Hình ảnh</th>
                            <th scope="col" class="text-muted fw-normal">Tên sản phẩm</th>
                            <th scope="col" class="text-muted fw-normal">Đơn giá</th>
                            <th scope="col" class="text-muted fw-normal">Số lượng</th>
                            <th scope="col" class="text-muted fw-normal">Tổng giá</th>
                        </tr>
                    </thead>
                    <tbody>
                        <% List<Cart> cartItems = (List<Cart>)session.getAttribute("cart");
                                double totalAmount = 0;

                                if (cartItems != null && !cartItems.isEmpty()) {
                                for (Cart cartItem : cartItems) {
                                double itemTotal = cartItem.getPrice() * cartItem.getAmount();
                                totalAmount += itemTotal;

                                %>
                                <tr class="text-center desktopItemCart" style="vertical-align: middle;">
                                    <td scope="row"><img src="<%=cartItem.getUrlImg() %>" alt="hình ảnh"
                                            style="width: 120px; height: 120px;" /></td>
                                    <td class="text-muted fw-normal">
                                        <p class='mt-1'>
                                            <%=cartItem.getName()%>
                                        </p>
                                    </td>
                                    <td class="fw-bold dongia">
                                        <%=(int)cartItem.getPrice() %> VND
                                    </td>
                                    <td>
                                        <div class="d-flex justify-content-center">
                                            <input class='inputNumCart text-center border-0 bg-light'
                                                value="<%=cartItem.getAmount() %>" type="text" min="0" disabled />
                                        </div>
                                    </td>
                                    <td>
                                        <%=(int)cartItem.getPrice()*cartItem.getAmount() %>
                                    </td>
                                </tr>
                                <% } } %>
                    </tbody>
                </table>
            </div>
                       <%@include file="component/footer.jsp" %>
    </body>

    </html>