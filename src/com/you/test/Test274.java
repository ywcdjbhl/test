package com.you.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test274 {
	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("\\file\\TourPreStoreMapper.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
	}
}
