package com.qf.translate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qf.translate.service.TranslateService;

import cn.com.webxml.EnglishChineseSoap;

@Service
public class TranslateServiceImpl implements TranslateService {

	@Autowired
	private EnglishChineseSoap translate;
	
	@Override
	public String translate(String source) {
		List<String> list = translate.translatorString(source).getString();
		return list.get(list.size()-2) ;
	}

}
