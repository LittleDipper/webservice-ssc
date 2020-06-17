package com.qf.translate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.webxml.EnglishChineseSoap;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		EnglishChineseSoap bean = applicationContext.getBean(EnglishChineseSoap.class);
		List<String> list = bean.translatorString("happy").getString();
		for (String string : list) {
			System.out.println(string);
		}
	}

}
