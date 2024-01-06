package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DbContext.DbConText;
import model.Category;



public class Dao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<Category> getAllCategory (){
		List<Category> listCategory = new ArrayList<>();
		String query = "SELECT * FROM `category`";
		try {
			conn = new DbConText().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				Category ca = new Category(rs.getInt("id"),rs.getString("name"),rs.getString("desc"),rs.getString("img"),rs.getString("banner"));
				listCategory.add(ca);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return listCategory;
	}
//	public static void main(String[] args) {
//		System.out.println("aloo");
//		List<Category> listCategory = new Dao().getAllCategory();
//		for (Category category : listCategory) {
//			System.out.println(category.getName());
//		}
//	}
}
