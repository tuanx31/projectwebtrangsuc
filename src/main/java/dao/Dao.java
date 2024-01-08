package dao;

import DbContext.dbConText;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.Category;
import model.Product;
import model.account;

public class Dao {

  Connection conn = null;
  PreparedStatement ps = null;
  ResultSet rs = null;

  public List<Category> getAllCategory() {
    List<Category> listCategory = new ArrayList<>();
    String query = "SELECT * FROM `category`";
    System.out.println(query);
    try {
      conn = new dbConText().getConnection();
      ps = conn.prepareStatement(query);
      rs = ps.executeQuery();
      while (rs.next()) {
        Category ca = new Category(
          rs.getInt("id"),
          rs.getString("name"),
          rs.getString("desc"),
          rs.getString("banner")
        );
        listCategory.add(ca);
      }
      conn.close();
    } catch (Exception e) {
      // TODO: handle exception
    }

    return listCategory;
  }

  public List<Product> getAllProduct() {
    List<Product> listCategory = new ArrayList<>();
    String query = "SELECT * FROM `product`";
    try {
      conn = new dbConText().getConnection();
      ps = conn.prepareStatement(query);
      rs = ps.executeQuery();
      while (rs.next()) {
        Product ca = new Product(
          rs.getInt("id"),
          rs.getString("name"),
          rs.getString("desc"),
          rs.getString("img"),
          rs.getInt("idCategory"),
          rs.getInt("price"),
          rs.getInt("sale_of")
        );
        listCategory.add(ca);
      }
      conn.close();
    } catch (Exception e) {
      // TODO: handle exception
    }

    return listCategory;
  }

  public List<Product> getProductbyCategory(String cid) {
    List<Product> list = new ArrayList<>();
    String query = "SELECT * FROM `product` WHERE `idCategory` = " + cid;
    try {
      conn = new dbConText().getConnection();
      ps = conn.prepareStatement(query);
      rs = ps.executeQuery();
      while (rs.next()) {
        Product ca = new Product(
          rs.getInt("id"),
          rs.getString("name"),
          rs.getString("desc"),
          rs.getString("img"),
          rs.getInt("idCategory"),
          rs.getInt("price"),
          rs.getInt("sale_of")
        );
        list.add(ca);
      }
      conn.close();
    } catch (Exception e) {
      // TODO: handle exception
    }

    return list;
  }

  public void InsertProduct(Product acc) {
    String query =
      "INSERT INTO `product` ( `name`, `desc`, `img`, `idCategory`, `price`, `sale_of`) VALUES ( '" +
      acc.getName() +
      "', '" +
      acc.getDesc() +
      "','" +
      acc.getImg() +
      "','" +
      acc.getIdCategory() +
      "','" +
      acc.getPrice() +
      "','" +
      acc.getSale_of() +
      "');";
    System.out.println(query);
    try (
      Connection conn = new dbConText().getConnection();
      PreparedStatement ps = conn.prepareStatement(query)
    ) {
      // Use executeUpdate for INSERT queries
      int rowsAffected = ps.executeUpdate();

      // Check the number of rows affected if needed
      System.out.println(rowsAffected + " row(s) affected");
    } catch (Exception e) {
      System.out.println("Error executing query: " + e.getMessage());
    }
  }
  public void InsertCategory(Category acc) {
	    String query =
	      "INSERT INTO `category` (`name`, `desc`, `banner`) VALUES ( '" +
	      acc.getName() +
	      "', '" +
	      acc.getDesc() +
	      "','" +
	      acc.getBanner() +
	      "');";
	    System.out.println(query);
	    try (
	      Connection conn = new dbConText().getConnection();
	      PreparedStatement ps = conn.prepareStatement(query)
	    ) {
	      // Use executeUpdate for INSERT queries
	      int rowsAffected = ps.executeUpdate();

	      // Check the number of rows affected if needed
	      System.out.println(rowsAffected + " row(s) affected");
	    } catch (Exception e) {
	      System.out.println("Error executing query: " + e.getMessage());
	    }
	  }
  public void deleteCategory(String id) {
	    String query = "DELETE FROM `category` WHERE `category`.`id` = " + id;
	    System.out.println(query);
	    try (
	      Connection conn = new dbConText().getConnection();
	      PreparedStatement ps = conn.prepareStatement(query)
	    ) {
	      // Use executeUpdate for INSERT queries
	      int rowsAffected = ps.executeUpdate();

	      // Check the number of rows affected if needed
	      System.out.println(rowsAffected + " row(s) affected");
	    } catch (Exception e) {
	      System.out.println("Error executing query: " + e.getMessage());
	    }
	  }
  public void editCategory(Category acc) {
	    String query =
	      "UPDATE `category` SET `name`= '" +
	      acc.getName() +
	      "', `desc` = '" +
	      acc.getDesc() +
	      "', `banner`='" +
	      acc.getBanner()
	      +"' WHERE  `category`.`id` = " +
	      acc.getId();
	    System.out.println(query);
	    try (
	      Connection conn = new dbConText().getConnection();
	      PreparedStatement ps = conn.prepareStatement(query)
	    ) {
	      // Use executeUpdate for INSERT queries
	      int rowsAffected = ps.executeUpdate();

	      // Check the number of rows affected if needed
	      System.out.println(rowsAffected + " row(s) affected");
	    } catch (Exception e) {
	      System.out.println("Error executing query: " + e.getMessage());
	    }
	  }
  public void editProduct(Product acc) {
    String query =
      "UPDATE `product` SET `name`= '" +
      acc.getName() +
      "', `desc` = '" +
      acc.getDesc() +
      "', `img`='" +
      acc.getImg() +
      "',`idCategory`='" +
      acc.getIdCategory() +
      "',`price`='" +
      acc.getPrice() +
      "',`sale_of`='" +
      acc.getSale_of() +
      "' WHERE  `product`.`id` = " +
      acc.getId();
    System.out.println(query);
    try (
      Connection conn = new dbConText().getConnection();
      PreparedStatement ps = conn.prepareStatement(query)
    ) {
      // Use executeUpdate for INSERT queries
      int rowsAffected = ps.executeUpdate();

      // Check the number of rows affected if needed
      System.out.println(rowsAffected + " row(s) affected");
    } catch (Exception e) {
      System.out.println("Error executing query: " + e.getMessage());
    }
  }

  public void deleteProduct(String id) {
    String query = "DELETE FROM `product` WHERE `product`.`id` = " + id;
    System.out.println(query);
    try (
      Connection conn = new dbConText().getConnection();
      PreparedStatement ps = conn.prepareStatement(query)
    ) {
      // Use executeUpdate for INSERT queries
      int rowsAffected = ps.executeUpdate();

      // Check the number of rows affected if needed
      System.out.println(rowsAffected + " row(s) affected");
    } catch (Exception e) {
      System.out.println("Error executing query: " + e.getMessage());
    }
  }

  public List<Product> getNewProduct() {
    List<Product> list = new ArrayList<>();
    String query = "SELECT * FROM product ORDER BY `createAt` DESC LIMIT 6;";
    try {
      conn = new dbConText().getConnection();
      ps = conn.prepareStatement(query);
      rs = ps.executeQuery();
      while (rs.next()) {
        Product ca = new Product(
          rs.getInt("id"),
          rs.getString("name"),
          rs.getString("desc"),
          rs.getString("img"),
          rs.getInt("idCategory"),
          rs.getInt("price"),
          rs.getInt("sale_of")
        );
        list.add(ca);
      }
      conn.close();
    } catch (Exception e) {
      // TODO: handle exception
    }

    return list;
  }

  public List<Product> searchProduct(String key) {
    List<Product> list = new ArrayList<>();
    String query = "SELECT * FROM `product` WHERE `name` LIKE '%" + key + "%'";
    try {
      conn = new dbConText().getConnection();
      ps = conn.prepareStatement(query);
      rs = ps.executeQuery();
      while (rs.next()) {
        Product ca = new Product(
          rs.getInt("id"),
          rs.getString("name"),
          rs.getString("desc"),
          rs.getString("img"),
          rs.getInt("idCategory"),
          rs.getInt("price"),
          rs.getInt("sale_of")
        );
        list.add(ca);
      }
      conn.close();
    } catch (Exception e) {
      // TODO: handle exception
    }
    return list;
  }

  public Category getCategoryById(String id) {
    Category cate = new Category();
    String query = "SELECT * FROM `category` WHERE `id` = " + id;
    try {
      conn = new dbConText().getConnection();
      ps = conn.prepareStatement(query);
      rs = ps.executeQuery();
      while (rs.next()) {
        cate =
          new Category(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getString("desc"),
            rs.getString("banner")
          );
      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return cate;
  }

  public Product getProuductById(String id) {
    Product p = new Product();
    String query = "SELECT * FROM `product` WHERE `id` = " + id;
    try {
      //System.out.println(query);
      conn = new dbConText().getConnection();
      ps = conn.prepareStatement(query);
      rs = ps.executeQuery();
      while (rs.next()) {
        p =
          new Product(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getString("desc"),
            rs.getString("img"),
            rs.getInt("idCategory"),
            rs.getInt("price"),
            rs.getInt("sale_of")
          );
      }
    } catch (Exception e) {
      // TODO: handle exception
    }
    return p;
  }

  public void register(account acc) {
    String query =
      "INSERT INTO user (username, password, email) VALUES (?, ?, ?)";

    try (
      Connection conn = new dbConText().getConnection();
      PreparedStatement ps = conn.prepareStatement(query)
    ) {
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
    String query =
      "SELECT username FROM user where username = '" + username + "'";

    try (
      Connection conn = new dbConText().getConnection();
      PreparedStatement ps = conn.prepareStatement(query)
    ) {
      // Use executeUpdate for INSERT queries
      rs = ps.executeQuery();
      while (rs.next()) {
        return true;
      }
    } catch (Exception e) {
      System.out.println("Error executing query: " + e.getMessage());
    }
    return false;
  }

  public boolean login(String username, String password) {
    String query =
      "SELECT password FROM user where username = '" + username + "'";

    try (
      Connection conn = new dbConText().getConnection();
      PreparedStatement ps = conn.prepareStatement(query)
    ) {
      // Use executeUpdate for INSERT queries
      rs = ps.executeQuery();

      if (rs.next()) {
        String storedPassword = rs.getString("password");

        if (password.equals(storedPassword)) {
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
    }
    return false;
  }

  public boolean isAdmin(String username) {
    String query = "SELECT role FROM user where username = '" + username + "'";
    try (
      Connection conn = new dbConText().getConnection();
      PreparedStatement ps = conn.prepareStatement(query)
    ) {
      // Use executeUpdate for INSERT queries
      rs = ps.executeQuery();

      if (rs.next()) {
        int role = rs.getInt("role");

        if (role == 1) {
          return true;
        }
      }
    } catch (Exception e) {
      System.out.println("Error executing query: " + e.getMessage());
    }
    return false;
  }

  public List<account> getAllUser() {
    List<account> list = new ArrayList<>();
    String query = "SELECT * FROM `user`";
    System.out.println(query);
    try {
      conn = new dbConText().getConnection();
      ps = conn.prepareStatement(query);
      rs = ps.executeQuery();
      while (rs.next()) {
        account ca = new account(
          rs.getInt("id"),
          rs.getString("username"),
          rs.getString("password"),
          rs.getString("email"),
          rs.getInt("role")
        );
        list.add(ca);
      }
      conn.close();
    } catch (Exception e) {
      // TODO: handle exception
    }

    return list;
  }
  public void deleteUser(String id) {
	    String query = "DELETE FROM `user` WHERE `user`.`id` = " + id;
	    System.out.println(query);
	    try (
	      Connection conn = new dbConText().getConnection();
	      PreparedStatement ps = conn.prepareStatement(query)
	    ) {
	      // Use executeUpdate for INSERT queries
	      int rowsAffected = ps.executeUpdate();

	      // Check the number of rows affected if needed
	      System.out.println(rowsAffected + " row(s) affected");
	    } catch (Exception e) {
	      System.out.println("Error executing query: " + e.getMessage());
	    }
	  }
  public account getUserById(String id) {
	  	account p = new account();
	    String query = "SELECT * FROM `user` WHERE `id` = " + id;
	    try {
	      //System.out.println(query);
	      conn = new dbConText().getConnection();
	      ps = conn.prepareStatement(query);
	      rs = ps.executeQuery();
	      while (rs.next()) {
	    	  	p = new account(
                rs.getInt("id"),
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("email"),
                rs.getInt("role")
              );
	      }
	    } catch (Exception e) {
	      // TODO: handle exception
	    }
	    return p;
	  }
  public void editUser(account acc) {
	    String query =
	      "UPDATE `user` SET `username`= '" +
	      acc.getUsername() +
	      "', `password` = '" +
	      acc.getPassword() +
	      "', `email`='" +
	      acc.getEmail()
	      +"', `role` = '"+
	      acc.getRole()+
	      "' WHERE  `user`.`id` = " +
	      acc.getId();
	    System.out.println(query);
	    try (
	      Connection conn = new dbConText().getConnection();
	      PreparedStatement ps = conn.prepareStatement(query)
	    ) {
	      // Use executeUpdate for INSERT queries
	      int rowsAffected = ps.executeUpdate();

	      // Check the number of rows affected if needed
	      System.out.println(rowsAffected + " row(s) affected");
	    } catch (Exception e) {
	      System.out.println("Error executing query: " + e.getMessage());
	    }
	  }
//  public static void main(String[] args) {
//    List<account> listCategory = new Dao().getAllUser();
//      System.out.println(listCategory.size());
//    for (account category : listCategory) {
//      System.out.println(category.toString());
//    }
//  }
}
