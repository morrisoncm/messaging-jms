package com.demo.messaging.jms.service;

import com.demo.messaging.jms.domain.Message;
import com.demo.messaging.jms.domain.User;

public interface GreetingService {

	Message sayHelloWorld();

	Message sayHelloWorldToUser(User user);
}
