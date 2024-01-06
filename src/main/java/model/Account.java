package model;


public class Account {
	

	
	
	private String username;
	private String password;
	private String email;
	private int role;
	
	public Account(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public Account() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
