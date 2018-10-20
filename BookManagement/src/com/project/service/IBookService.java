package com.project.service;

import java.util.List;

import com.project.bean.BookBean;

public interface IBookService {
	//借阅图书
	public void borrow(int u_id , int b_id , int number);
	//添加图书
	public boolean addBook(BookBean bean);
	//获取到所有图书，返回一个集合，在页面显示图书信息
	public List<BookBean> findAllBook();
	//查询图书的详细信息
	public BookBean getBookById(int id);
	//更新图书信息
	public void updateBook(BookBean bean,int id);
	//删除图书
	public boolean delBook(int id);
	//检测是否存在同名图书
	public BookBean getBookByName(String name);
}
