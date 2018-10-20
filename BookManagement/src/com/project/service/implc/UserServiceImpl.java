package com.project.service.implc;

import com.project.bean.UserBean;
import com.project.dao.implc.UserDaoImpl;
import com.project.service.IUserService;

public class UserServiceImpl implements IUserService {
	private UserDaoImpl dao = new UserDaoImpl();

	@Override
	public boolean login(UserBean bean) {
		UserBean ub = dao.findByName(bean.getName());
//		System.out.println(bean.getName()+":"+bean.getPwd());
//		System.out.println("-"+ub.getName()+":"+ub.getPwd());
		if(ub!=null && ub.getPwd().equals(bean.getPwd())) {
		return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean checkLogin(String name) {
		UserBean bean = dao.findByName(name);
		// 验证当前用户名是否可用
		if (bean != null) {// 可用
			return true;
		} else {// 不存在该用户名
			return false;
		}
	}

	@Override
	public boolean register(UserBean bean) {
		return false;
	}

}
