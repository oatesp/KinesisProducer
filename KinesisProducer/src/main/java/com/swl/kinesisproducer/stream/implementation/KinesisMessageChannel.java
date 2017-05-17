package com.swl.kinesisproducer.stream.implementation;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import com.amazonaws.services.kinesis.producer.KinesisProducer;

public class KinesisMessageChannel implements MessageChannel {

	
	KinesisProducer kinesis = new KinesisProducer(); 
	
	@Override
	public boolean send(Message<?> message) {
		

		ByteBuffer data = null;
		try {
			data = ByteBuffer.wrap(message.getPayload().toString().getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	          
	    kinesis.addUserRecord("myStream", "timestamp", data);
		
		

		return false;
	}

	@Override
	public boolean send(Message<?> message, long timeout) {
		// TODO Auto-generated method stub
		return false;
	}

}
