package com.nostalgiaguy.soapservice.cxf.auth.property;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringApplicationContext implements ApplicationContextAware {

	private static ApplicationContext springContext;

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		springContext = context;
	}

	public static Object getBean(String beanName) {
		return (springContext != null) ? springContext.getBean(beanName) : null;
	}

	public static <T> T getBean(Class<T> className) {
		return ((springContext != null) ? (T) (springContext.getBean(className)) : null);
	}

	public static <T> T getBean(String beanName, Class<T> className) {
		return ((springContext != null) ? (T) (springContext.getBean(beanName, className)) : null);
	}
}
