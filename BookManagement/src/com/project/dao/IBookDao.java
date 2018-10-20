package com.project.dao;

import java.util.List;

import com.project.bean.BookBean;

public interface IBookDao {
	//新增图书
	public int insert(BookBean bean);
	//查找书籍
	public BookBean findById(int id);
	//查找所有书籍
	public List<BookBean> findAll();
	//删除书籍
	public void del(int id);
	//更新图书信息
	public void update(int id,BookBean bean);
	//更新图书库存
	public void updateBook(int b_id, int number);
	//检测同名书籍
	public BookBean findByName(String name);
}
