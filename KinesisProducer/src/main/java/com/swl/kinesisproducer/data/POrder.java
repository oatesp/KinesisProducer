package com.swl.kinesisproducer.data;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	 
	 //each order needs to have a unique generated id based on its contents and maybe a timestamp? so that each service
	 //can identify the same orders so that updates can be made. can use the id field but alter the generation type and
	 //remove the ignore
	 
	 //the id should be a GUID
	 

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
