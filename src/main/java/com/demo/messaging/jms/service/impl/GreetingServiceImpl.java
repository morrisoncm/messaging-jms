package com.demo.messaging.jms.service.impl;

import org.springframework.stereotype.Service;

import com.demo.messaging.jms.domain.Message;
import com.demo.messaging.jms.domain.User;
import com.demo.messaging.jms.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {

	@Override
	public Message sayHelloWorld() {
		return new Message("Hello World!");
	}

	@Override
	public Message sayHelloWorldToUser(User user) {
		return new Message("Hello World to " + user.getFirstName() + " " + user.getLastName());
	}
}
