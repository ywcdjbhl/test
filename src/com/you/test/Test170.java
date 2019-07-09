package com.you.test;

import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 简单的实现ioc容器
 */
public class Test170 {
	public static void main(String[] args) {
		Test170ClassPathXMLApplicationContext context = new Test170ClassPathXMLApplicationContext("application.xml");
		Object obj = context.getBean("studentservice");
		Test170StudentService ss = (Test170StudentService)obj;	
		ss.getStudent().selfIntroduction();
	}
}
class Test170Student {
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void selfIntroduction() {
		PrintStream err = System.err;
		err.println("大家好, 我叫 " + this.name + ", 我住在 " + this.address);
	}
}
class Test170StudentService {
	private Test170Student student;

	public Test170Student getStudent() {
		return student;
	}

	public void setStudent(Test170Student student) {
		this.student = student;
	}
}
class Test170ClassPathXMLApplicationContext {
	private File file;
	private Map<String, Object> ioc = new HashMap<String, Object>();
	public Test170ClassPathXMLApplicationContext(String config_file) {
		URL url = this.getClass().getClassLoader().getResource(config_file);
		
		try {
			file = new File(url.toURI());
			XMLParse();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//解析application.xml
	private void XMLParse() throws Exception {
		SAXReader reader = new SAXReader();
		Document doc = reader.read(file);
		Element element = doc.getRootElement();
		List<Element> list = element.elements();
		PrintStream err = System.err;
		for (Element el : list) {
			// 标签名称
			String elename = el.getName();
			if ("bean".equals(elename)) {
				// bean标签
				// bean id
				String beanid = el.attributeValue("id");
				// bean class
				String classname = el.attributeValue("class");
				Class<?> clazz = Class.forName(classname);
				Object obj =clazz.newInstance();
				err.println("ioc容器里放入 " + beanid);
				ioc.put(beanid, obj);
			}
		}
		for (Element el : list) {
			String elename = el.getName();
			if ("bean".equals(elename)) {
				String beanid = el.attributeValue("id");
				Object obj = this.ioc.get(beanid);
				Class clazz = obj.getClass();
				Method[] methods = clazz.getMethods();
				// 得到子标签<property></property>
				List<Element> propertyList = el.elements();
				for (Element propertyEl : propertyList) {
					// 遍历property标签,为属性clazz属性复制
					if ("property".equals(propertyEl.getName())) {
						String propertyName = propertyEl.attributeValue("name");
						String propertyValue = propertyEl.attributeValue("value");
						String ref = propertyEl.attributeValue("ref");
						// 遍历clazz set方法
						for (Method method : methods) {
							if (method.getName().startsWith("set")
									&& method.getName().substring(3).equalsIgnoreCase(propertyName)) {
								if (propertyValue != null) {
									method.invoke(obj, propertyValue);	
								} else if (ref != null) {
									Object refObj = this.ioc.get(ref);
									method.invoke(obj, refObj);
								}
							}
						}
					}
				}
			}
		}
	}
	public Object getBean(String name) {
		return this.ioc.get(name);
	}
}
