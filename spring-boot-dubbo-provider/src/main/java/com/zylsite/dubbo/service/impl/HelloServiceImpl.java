package com.zylsite.dubbo.service.impl;

import org.springframework.stereotype.Service;

import com.zylsite.dubbo.service.HelloService;

@Service(value="helloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String say(String word) {
		return "Hello," + word;
	}

}
