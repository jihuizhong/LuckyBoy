package com.project.dao;

import com.project.bean.UserBean;

public interface IUserDao {
	//密码验证
	public UserBean findByField(UserBean bean);
	//验证当前用户名
	public UserBean findByName(String name);
	//添加用户
	public int insert(UserBean bean);
}
