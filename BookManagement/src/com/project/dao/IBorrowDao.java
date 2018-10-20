package com.project.dao;

import java.util.Date;

import com.project.bean.BorrowBean;

public interface IBorrowDao {
	//借阅图书，插入记录
	public void insert(int u_id,int b_id,int number,Date da);

	public BorrowBean findById(int id);

}
