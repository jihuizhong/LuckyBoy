package com.project.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetBean {
	public ApplicationContext getContext() {
		ApplicationContext context=new ClassPathXmlApplicationContext("springConfig.xml");
		return context;
	}
	public Object getBean(String name) {
		Object obj = getContext().getBean(name);
		return obj;
	}
}
