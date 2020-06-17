package com.qf.translate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qf.translate.service.TranslateService;

@Controller
public class TranslateController {
	
	@Autowired
	private TranslateService translateService;
	
	@RequestMapping("translate")
	@ResponseBody
	public String translate(String source){
		return translateService.translate(source);
	}
}
