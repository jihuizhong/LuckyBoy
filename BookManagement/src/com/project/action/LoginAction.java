package com.project.action;

import com.opensymphony.xwork2.ModelDriven;
import com.project.bean.UserBean;
import com.project.service.implc.UserServiceImpl;

public class LoginAction implements ModelDriven<UserBean>{

	private UserBean bean=new UserBean();
	@Override
	public UserBean getModel() {
		return bean;
	}
	public String execute() {
//		System.out.println("LoginAction-execute");
//		System.out.println("name:"+bean.getName());
//		System.out.println("pwd:"+bean.getPwd());
		boolean result= new UserServiceImpl().login(bean);
		if(result==true) {
			return "success";
		}else{
			return "fail";
		}
	}
	
}
