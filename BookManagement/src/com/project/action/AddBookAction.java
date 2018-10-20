package com.project.action;

import com.project.bean.BookBean;
import com.project.service.implc.BookServiceImpl;
import com.project.util.FileUpload;

public class AddBookAction{
	
	private BookBean bean;
	private FileUpload fu;
	
	public String execute() {

		System.out.println("before-upload");
		fu.upload(bean);
		System.out.println("after-upload");
		bean.setImage(fu.getName());
		System.out.println(bean);
		boolean result = new BookServiceImpl().addBook(bean);
		if (result == true) {
			return "success";
		} else {
			return "fail";
		}
	}

	public FileUpload getFu() {
		return fu;
	}

	public void setFu(FileUpload fu) {
		this.fu = fu;
	}

	public BookBean getBean() {
		return bean;
	}

	public void setBean(BookBean bean) {
		this.bean = bean;
	}
	
}
