package com.project.service;

import com.project.bean.UserBean;

public interface IUserService {
	//登陆业务
	public boolean login(UserBean bean);
	//检查当前用户是否可以使用
	public boolean checkLogin(String name);
	public boolean register(UserBean bean);
}
