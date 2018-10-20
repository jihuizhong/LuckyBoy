package com.project.test;

import org.junit.Test;

import com.project.bean.BookBean;
import com.project.bean.BorrowBean;
import com.project.dao.IBookDao;
import com.project.dao.IBorrowDao;
import com.project.dao.implc.BookDaoImpl;
import com.project.dao.implc.BorrowDaoImpl;
import com.project.service.IBookService;
import com.project.service.implc.BookServiceImpl;


public class TestMain {
	
//	@org.junit.Test
	public void test() {
		IBookDao book=new BookDaoImpl();
		book.findAll();
//		book.del(2);
//		book.del(3);
		BookBean bean=new BookBean();
		bean.setAuthor("张三");
		bean.setBalance(1144);
		bean.setDepict("好书");
		bean.setTitle("钢铁的意志");
		bean.setPrice(88.8);
		bean.setPublisher("西北工业出版社");
		bean.setTime("2018-02-03");
//		book.update(4,bean);
//		book.insert(bean);
		System.out.println(bean.getId());
//		book.findAll();
//		book.findById(1);
		book.updateBook(1, 100);
	}
	@Test
	public void test1() {
		IBookService i=new BookServiceImpl();
		i.borrow(1, 1, 100);
	}
	@Test
	public void test2() {
		IBorrowDao i=new BorrowDaoImpl();
		BorrowBean  bean = i.findById(2);
		System.out.println(bean);
	}
}
