package com.swl.kinesisproducer.stream.implementation;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.SubscribableChannel;

public class KinesisSubscribableChannel implements SubscribableChannel {

	@Override
	public boolean send(Message<?> message) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean send(Message<?> message, long timeout) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean subscribe(MessageHandler handler) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean unsubscribe(MessageHandler handler) {
		// TODO Auto-generated method stub
		return false;
	}

}
