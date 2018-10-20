package com.project.dao.implc;

import org.apache.ibatis.session.SqlSession;

import com.project.bean.UserBean;
import com.project.dao.IUserDao;
import com.project.util.GetSqlSession;

public class UserDaoImpl implements IUserDao {

	@Override
	public int insert(UserBean bean) {
		SqlSession session=GetSqlSession.getSqlSession(true);
		int id=0;
		try {
			session.insert("com.project.mapper.UserMapper.insertUser", bean);
			id=bean.getId();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return id;
	}

	@Override
	public UserBean findByField(UserBean bean) {
		SqlSession session=GetSqlSession.getSqlSession();
		UserBean ub=null;
		try {
			ub=session.selectOne("com.project.mapper.UserMapper.findByField", bean);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return ub;
	}

	@Override
	public UserBean findByName(String name) {
		SqlSession session=GetSqlSession.getSqlSession();
		UserBean ub=null;
		try {
			ub=session.selectOne("com.project.mapper.UserMapper.findByName", name);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return ub;
	}

}
