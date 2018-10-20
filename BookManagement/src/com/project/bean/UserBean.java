package com.project.bean;

import java.util.List;

public class UserBean {
	private int id;
	private String name;
	private String pwd;
	private List<BookBean> list;
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
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public List<BookBean> getList() {
		return list;
	}
	public void setList(List<BookBean> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", pwd=" + pwd + ", list=" + list + "]";
	}
}
