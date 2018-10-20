package com.project.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.service.IBookService;

public class DeleteBookAction {
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String execute(){
		ApplicationContext context=new ClassPathXmlApplicationContext("springConfig.xml");
		IBookService service = context.getBean("bookService",IBookService.class);
		boolean result = service.delBook(id);
		if(result==true) {
			return "success";
		}else {
			return "fail";
		}
	}
}
