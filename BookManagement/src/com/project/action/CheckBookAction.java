package com.project.action;

import org.codehaus.jackson.map.ObjectMapper;

import com.project.bean.BookBean;
import com.project.service.implc.BookServiceImpl;

public class CheckBookAction {
	private BookBean bean;
	//接收转化成json格式的字符串
	private String result;
	public String execute() {
//		System.out.println(bean.getTitle());
		BookBean bb = new BookServiceImpl().getBookByName(bean.getTitle());
		ObjectMapper om=new ObjectMapper();
		try {
			result = om.writeValueAsString(bb);
//			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return "success";
	}
	public BookBean getBean() {
		return bean;
	}
	public void setBean(BookBean bean) {
		this.bean = bean;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}
