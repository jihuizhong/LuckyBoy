package com.project.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class GetSqlSession {
	public static SqlSessionFactory getSqlSessionFactory() {
		String resource = "config.xml";
		InputStream inputStream = null;
		SqlSessionFactory sqlSessionFactory = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sqlSessionFactory;

	}

	public static SqlSession getSqlSession() {
		SqlSession session=getSqlSessionFactory().openSession();
		return session;
	}

	public static SqlSession getSqlSession(boolean flag) {
		SqlSession session=getSqlSessionFactory().openSession(flag);
		return session;
	}
}
