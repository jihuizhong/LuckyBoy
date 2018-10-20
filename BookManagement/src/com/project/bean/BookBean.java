package com.project.bean;

public class BookBean {
	private int id;
	private String title;
	private String image;
	private String author;
	private String publisher;
	private String time;
	private double price;
	private int balance;
	private String depict;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getDepict() {
		return depict;
	}
	public void setDepict(String depict) {
		this.depict = depict;
	}
	
	@Override
	public String toString() {
		return "BookInfoBean [id=" + id + ", title=" + title + ", image=" + image + ", author=" + author
				+ ", publisher=" + publisher + ", time=" + time + ", price=" + price + ", balance=" + balance
				+ ", depict=" + depict + "]";
	}

	
}
