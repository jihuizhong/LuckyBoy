package com.project.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.project.bean.BookBean;
import com.project.service.implc.BookServiceImpl;

public class ShowBookAction {
	public String execute() {
		List<BookBean> list = new BookServiceImpl().findAllBook();
		if(list!=null) {
			System.out.println("insert");
			ActionContext.getContext().put("AllBook", list);
			return "success";
		}else {
			return "fail";
		}
		
	}
}
