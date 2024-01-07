package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DbContext.dbConText;
import model.account;
import model.category;



public class dao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public List<category> getAllCategory (){
		List<category> listCategory = new ArrayList<>();
		String query = "SELECT * FROM `category`";
		try {
			conn = new dbConText().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				category ca = new category(rs.getInt("id"),rs.getString("name"),rs.getString("desc"),rs.getString("img"),rs.getString("banner"));
				listCategory.add(ca);
			}

		}catch (Exception e) {
			// TODO: handle exception
		}

		return listCategory;
	}
	public void register(account acc) {
	    String query = "INSERT INTO user (username, password, email) VALUES (?, ?, ?)";
	    

	    try (Connection conn = new dbConText().getConnection();
	         PreparedStatement ps = conn.prepareStatement(query)) {

	        ps.setString(1, acc.getUsername());
	        ps.setString(3, acc.getPassword());
	        ps.setString(2, acc.getEmail());
	        

	        // Use executeUpdate for INSERT queries
	        int rowsAffected = ps.executeUpdate();

	        // Check the number of rows affected if needed
	        System.out.println(rowsAffected + " row(s) affected");

	    } catch (Exception e) {
	        System.out.println("Error executing query: " + e.getMessage());
	    }
	}
	public boolean checkacc(String username) {
	    String query = "SELECT username FROM user where username = '" + username +"'";
	   

	    try (Connection conn = new dbConText().getConnection();
	         PreparedStatement ps = conn.prepareStatement(query)) {

	        // Use executeUpdate for INSERT queries
	       rs = ps.executeQuery();
	       while(rs.next()) {
	    	   return true;
	       }

	    } catch (Exception e) {
	        System.out.println("Error executing query: " + e.getMessage());
	    }return false;
	}
	
	public boolean login(String username,String password) {
		
	    String query = "SELECT password FROM user where username = '" + username +"'";
	   

	    try (Connection conn = new dbConText().getConnection();
	         PreparedStatement ps = conn.prepareStatement(query)){
	        // Use executeUpdate for INSERT queries
	       rs = ps.executeQuery();
	       
	       
	    	   if (rs.next()) {
	    		   
	                String storedPassword = rs.getString("password");
	               
	                if(password.equals(storedPassword)) {
	                	
	                	return true;
	                }
	                // You should use a secure password hashing library to compare passwords
	                // For example: if (PasswordHash.verify(password, storedPassword)) {
	                //    return true;
	                // }
	                // Note: Replace PasswordHash.verify with your actual password verification logic.
	            }
	      

	    } catch (Exception e) {
	        System.out.println("Error executing query: " + e.getMessage());
	    }return false;
	}
	
	

	public static void main(String[] args) {
		
		List<category> listCategory = new dao().getAllCategory();
		for (category category : listCategory) {
			System.out.println(category.getName());
		}
	}
}
