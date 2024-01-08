package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Order;
import model.account;

import java.io.IOException;

import dao.Dao;

/**
 * Servlet implementation class order
 */
@WebServlet("/orderC")
public class order extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispathcher = request.getRequestDispatcher("payment.jsp");
		
		dispathcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Integer idUser = (Integer)  session.getAttribute("id");
		String total = request.getParameter("total");
		System.out.println(total);
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		
		String selectedCity = request.getParameter("city");
        String selectedDistrict = request.getParameter("district");
        String selectedWard = request.getParameter("ward");
        String house = request.getParameter("house");
        
        int totalAmount = Integer.parseInt(total);
        

        String address = house+","+selectedWard + "," + selectedDistrict +","+ selectedCity;
        
        Order ord = new Order(1,idUser,name,phone,address,email,totalAmount,"");
        Dao odao = new Dao();
        odao.InsertOrderdathang(ord);
		
	}
	

}
