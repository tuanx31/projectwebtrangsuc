package model;

public class category {
	private int id;
	private String name;
	private String desc;
	private String img;
	private String banner;
	public category() {
		// TODO Auto-generated constructor stub
	}
	
	public Category(int id , String name , String desc , String img , String banner ) {
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.img = img;
		this.banner = banner;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getBanner() {
		return banner;
	}
	public void setBanner(String banner) {
		this.banner = banner;
	}
	
}
