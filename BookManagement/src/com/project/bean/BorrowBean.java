package com.project.bean;

import java.util.Date;

public class BorrowBean {
	private int id;
	private BookBean book;
	private UserBean ub;
	private Date da;
	private int num;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BookBean getBook() {
		return book;
	}
	public void setBook(BookBean book) {
		this.book = book;
	}
	public UserBean getUb() {
		return ub;
	}
	public void setUb(UserBean ub) {
		this.ub = ub;
	}
	public Date getDa() {
		return da;
	}
	public void setDa(Date da) {
		this.da = da;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "BorrowBean [id=" + id + ", book=" + book + ", ub=" + ub + ", da=" + da + ", num=" + num + "]";
	}
	
	
}
