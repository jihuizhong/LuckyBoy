package com.project.dao.implc;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import com.project.bean.BookBean;
import com.project.bean.BorrowBean;
import com.project.bean.UserBean;
import com.project.dao.IBorrowDao;
import com.project.util.GetSqlSession;

public class BorrowDaoImpl implements IBorrowDao {

	@Override
	public void insert(int u_id,int b_id,int number,Date da) {
		SqlSession session = GetSqlSession.getSqlSession(true);
		try {
			BorrowBean bean=new BorrowBean();
			UserBean ub=session.selectOne("com.project.mapper.UserMapper.findById", u_id);
			BookBean book=session.selectOne("com.project.mapper.BookMapper.findById",b_id);
			bean.setBook(book);
			bean.setUb(ub);
			bean.setDa(da);
			bean.setNum(number);
			session.insert("com.project.mapper.BorrowMapper.insertBorrow", bean);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		
	}

	@Override
	public BorrowBean findById(int id) {
		SqlSession session = GetSqlSession.getSqlSession();
		BorrowBean bean=null;
		try {
			bean=session.selectOne("com.project.mapper.BorrowMapper.findById", id);
			System.out.println(bean);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return bean;
	}

}
