package com.project.action;

import org.springframework.context.ApplicationContext;

import com.project.bean.BookBean;
import com.project.service.IBookService;
import com.project.util.GetBean;

public class EditBookAction {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String execute() {
		GetBean g=new GetBean();
		IBookService service = (IBookService) g.getBean("bookService");
		BookBean bean = service.getBookById(id);
		return "success";
	}
}
