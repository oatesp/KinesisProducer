package com.swl.kinesisproducer.data;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.ToString;

@ToString
@Entity
public class POrder {

	@Id
	private UUID id;

	private String name;

	public POrder() {
		id = UUID.randomUUID();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String item) {
		this.name = item;
	}

}
