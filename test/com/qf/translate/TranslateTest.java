package com.qf.translate;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.com.webxml.EnglishChineseSoap;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TranslateTest {
	
	@Autowired
	private EnglishChineseSoap translate;
	
	@Test
	public void translateTest(){
		System.out.println(translate);
		List<String> list = translate.translatorString("happy").getString();
		for (String string2 : list) {
			System.out.println(string2);
		}
	}
}
