package com.zylsite.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zylsite.dubbo.service.HelloService;

@Controller
public class HelloController {

	@Autowired
	private HelloService helloService;
	
	@GetMapping("/dubbo/index/{word}")
	@ResponseBody
	public Object index(@PathVariable String word){
		return helloService.say(word);
	}
	
}
