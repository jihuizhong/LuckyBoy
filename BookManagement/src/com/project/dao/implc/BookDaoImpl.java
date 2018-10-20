package com.project.dao.implc;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.project.bean.BookBean;
import com.project.dao.IBookDao;
import com.project.util.GetSqlSession;

public class BookDaoImpl implements IBookDao {

	@Override
	public int insert(BookBean bean) {
		SqlSession session = GetSqlSession.getSqlSession(true);
		int count=0;
		try {
			count=session.insert("com.project.mapper.BookMapper.insert", bean);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return count;
	}

	@Override
	public BookBean findById(int id) {
		SqlSession session = GetSqlSession.getSqlSession();
		BookBean bean = session.selectOne("com.project.mapper.BookMapper.findById", id);
		System.out.println("findById:\n" + bean);
		session.close();
		return bean;
	}

	@Override
	public List<BookBean> findAll() {
		SqlSession session = GetSqlSession.getSqlSession();
		List<BookBean> list = null;
		try {
			list = session.selectList("com.project.mapper.BookMapper.findAll");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	@Override
	public void del(int id) {
		SqlSession session = GetSqlSession.getSqlSession(true);
		try {
			session.delete("com.project.mapper.BookMapper.del", id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	@Override
	public void update(int id, BookBean bean) {
		SqlSession session = GetSqlSession.getSqlSession(true);
		try {
			bean.setId(id);
			session.update("com.project.mapper.BookMapper.update", bean);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public void updateBook(int b_id, int number) {
		SqlSession session = GetSqlSession.getSqlSession(true);
		try {
			BookBean bean=session.selectOne("com.project.mapper.BookMapper.findById", b_id);
			int balance=bean.getBalance()-number;
			bean.setBalance(balance);
			session.update("com.project.mapper.BookMapper.updateBook", bean);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public BookBean findByName(String name) {
		SqlSession session = GetSqlSession.getSqlSession();
		BookBean bean = session.selectOne("com.project.mapper.BookMapper.findByName", name);
//		System.out.println("findByName:\n" + bean);
		session.close();
		return bean;
	}

}
