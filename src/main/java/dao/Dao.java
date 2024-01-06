package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DbContext.DbConText;
import model.Category;
import model.Product;



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
			conn.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return listCategory;
	}

	public List<Product> getProductbyCategory (String cid){
		List<Product> list = new ArrayList<>();
		String query = "SELECT * FROM `product` WHERE `idCategory` = "+cid;
		try {
			conn = new DbConText().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				Product ca = new Product(rs.getInt("id"),rs.getString("name"),rs.getString("desc"),rs.getString("img"),rs.getInt("idCategory"),rs.getInt("price"),rs.getInt("sale_of"));
				list.add(ca);
			}
			conn.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return list;
	}
	public List<Product> searchProduct (String key){
		List<Product> list = new ArrayList<>();
		String query = "SELECT * FROM `product` WHERE `name` LIKE '%"+ key+"%'";
		try {
			conn = new DbConText().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				Product ca = new Product(rs.getInt("id"),rs.getString("name"),rs.getString("desc"),rs.getString("img"),rs.getInt("idCategory"),rs.getInt("price"),rs.getInt("sale_of"));
				list.add(ca);
			}
			conn.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	public Category getCategoryById(String id) {
		Category cate = new Category();
		String query = "SELECT * FROM `category` WHERE `id` = "+id;
		try {
			System.out.println(query);
			conn = new DbConText().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				cate = new Category(rs.getInt("id"),rs.getString("name"),rs.getString("desc"),rs.getString("img"),rs.getString("banner"));
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return cate;
	}
	public Product getProuductById(String id) {
		Product p = new Product();
		String query = "SELECT * FROM `product` WHERE `id` = "+id;
		try {
			System.out.println(query);
			conn = new DbConText().getConnection();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				p = new Product(rs.getInt("id"),rs.getString("name"),rs.getString("desc"),rs.getString("img"),rs.getInt("idCategory"),rs.getInt("price"),rs.getInt("sale_of"));
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return p;
	}
	
	public static void main(String[] args) {
		List<Product> listCategory = new Dao().getProductbyCategory("1");
		for (Product category : listCategory) {
			System.out.println(category.toString());
		}
	}
}
