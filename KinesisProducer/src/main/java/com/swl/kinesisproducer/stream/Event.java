package com.swl.kinesisproducer.stream;

import com.swl.kinesisproducer.data.POrder;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Event {

	private POrder subject;
	private String type;
	private String originator;
	
	public Event() {
		
	}
	
	public Event(POrder subject, String type, String originator) {
		this.subject =  subject;
		this.type = type;
		this.originator = originator;
	}
	
	
	
}
