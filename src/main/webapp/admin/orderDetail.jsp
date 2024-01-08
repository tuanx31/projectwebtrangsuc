
        <%@page import="model.Product"%>
<%@page import="dao.Dao"%>
<%@page import="model.Category"%>

<%@page import="java.util.List" %>
            <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
                <!DOCTYPE html>
                <html>

                <head>
                    <meta charset="UTF-8">
                    <title>Insert title here</title>
                </head>

                <body>
                    <%@include file="header.jsp" %>
                        <div id="layoutSidenav">
                            <%@include file="sidebar.jsp" %>
                                <main>
                                <div class="card mb-4">
                                                <div class="card-header">
                                                    <i class="fas fa-table me-1"></i>
                                                    Tất cả sản phẩm
                                                </div>
                                                <div class="card-body">
                                                    <table id="datatablesSimple">
                                                        <thead>
                                                            <tr>
                                                                <th>thumbnail</th>
                                                                <th>Tên</th>
                                                                <th>Đơn giá</th>
                                                                <th>Số lượng</th>
                                                                <th>Tổng tiền</th>
                                                                <th>Action</th>
                                                            </tr>
                                                        </thead>
                                                        <tfoot>
                                                            <tr>
                                                                <th>thumbnail</th>
                                                                <th>Tên</th>
                                                                <th>Đơn giá</th>
                                                                <th>Số lượng</th>
                                                                <th>Tổng tiền</th>
                                                                <th>Action</th>
                                                            </tr>
                                                        </tfoot>
                                                        <tbody>
                                                            <% List<Product> listproduct = (List<Product>
                                                                    )request.getAttribute("listproduct");
                                                                    for(Product s:listproduct){%>
                                                                    <tr>
                                                                        <td><img src="<%= s.getImg() %>"
                                                                                style="width: 100px;height: auto" />
                                                                        </td>
                                                                        <td>
                                                                            <%= s.getName() %>
                                                                        </td>
                                                                        <td>
                                                                            <%= s.getPrice() %>
                                                                        </td>
                                                                        <td>
                                                                        
                                                                            <%= s.getSale_of() %>
                                                                        </td>
                                                                        <%Category loaisp = new Dao().getCategoryById(Integer.toString(s.getIdCategory()));%>
                                                                        <td>
                                                                            <%= loaisp.getName()%>
                                                                        </td>
                                                                        <td>
                                                                                <a href="editProduct?id=<%= s.getId()%>" class="btn btn-warning"
                                                                                    >Sửa</a>
                                                                            <form action="adminproduct" method="post">
                                                                                <input type="text" name="action"
                                                                                    id="action" value="delete"
                                                                                    style="display: none" />
                                                                                <input type="text" name="idp" id="idp"
                                                                                    value="<%= s.getId() %>"
                                                                                    style="display: none" />
                                                                                <button class="btn btn-danger"
                                                                                    type="submit">Xóa</button>
                                                                            </form>

                                                                        </td>

                                                                    </tr>
                                                                    <%}%>
                                                        </tbody>
                                                    </table>
                                                </div>
                                            </div>
                                </main>
                                <footer class="py-4 bg-light mt-auto">
                                    <div class="container-fluid px-4">
                                        <div class="d-flex align-items-center justify-content-between small">
                                            <div class="text-muted">Copyright &copy; Your Website 2023</div>
                                            <div>
                                                <a href="#">Privacy Policy</a>
                                                &middot;
                                                <a href="#">Terms &amp; Conditions</a>
                                            </div>
                                        </div>
                                    </div>
                                </footer>
                        </div>
                        
                </body>

                </html>