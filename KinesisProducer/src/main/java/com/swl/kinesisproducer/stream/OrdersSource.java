package com.swl.kinesisproducer.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;

import com.esotericsoftware.minlog.Log;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class OrdersSource {

	
	private OrderProcessor orderOut;
	
	@Autowired
	public OrdersSource(OrderProcessor orderOut) {
		this.orderOut = orderOut;
	}
	
	
	
    public void sendOrder(Event event) {
    	
    	ObjectMapper mapper = new ObjectMapper();
        String eventString = "";
		try {
			eventString = mapper.writeValueAsString(event);
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
        Log.info("Event sent: " + eventString);
		
		
			orderOut.ordersOut().send(MessageBuilder.withPayload(eventString).build());

    }
	
	
	
}
