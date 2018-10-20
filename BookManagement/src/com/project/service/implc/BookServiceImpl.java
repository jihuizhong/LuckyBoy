package com.project.service.implc;

import java.util.Date;
import java.util.List;

import com.project.bean.BookBean;
import com.project.bean.BorrowBean;
import com.project.dao.IBookDao;
import com.project.dao.IBorrowDao;
import com.project.dao.implc.BookDaoImpl;
import com.project.dao.implc.BorrowDaoImpl;
import com.project.service.IBookService;

public class BookServiceImpl implements IBookService{
	private IBookDao dao=new BookDaoImpl();
	private IBorrowDao bdao=new BorrowDaoImpl();
	@Override
	public void borrow(int u_id, int b_id, int number) {
		//判断库存
		BookBean bean=dao.findById(b_id);
		if(bean.getBalance()>=number) {
			//减少库存
			dao.updateBook(b_id, number);
			//增加借阅记录
			bdao.insert(u_id, b_id , number , new Date());
		}
		
	}

	@Override
	public boolean  addBook(BookBean bean) {
		int count=dao.insert(bean);
		if(count==1) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public List<BookBean> findAllBook() {
		List<BookBean> list=dao.findAll();
		return list;
	}

	@Override
	public BookBean getBookById(int id) {
		BookBean bean=dao.findById(id);
		return bean;
	}

	@Override
	public void updateBook(BookBean bean, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean delBook(int id) {
		//首先查询是否存在借阅
		BorrowBean bean = bdao.findById(id);
		boolean boo=false;
		if(bean==null) {//不存在
			dao.del(id);
			boo=true;
		}
		return boo;
		
	}

	@Override
	public BookBean getBookByName(String name) {
		BookBean bean = dao.findByName(name);
//		if(bean==null) {
//			return true;
//		}
		return bean;
	}
	
}
