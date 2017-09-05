package com.swl.kinesisproducer.stream;

import java.util.UUID;

import com.swl.kinesisproducer.data.POrder;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Event {

    private UUID id;
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
