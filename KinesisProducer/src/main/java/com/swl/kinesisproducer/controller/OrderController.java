package com.swl.kinesisproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.swl.kinesisproducer.data.POrder;
import com.swl.kinesisproducer.repository.OrderRepository;
import com.swl.kinesisproducer.stream.Event;
import com.swl.kinesisproducer.stream.OrdersSource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class OrderController {

	    @Autowired 
	    private OrderRepository orders;
	    
	    @Autowired
	    private OrdersSource orderSource;
	    
	    @RequestMapping(value="/orders",method=RequestMethod.GET,produces={"application/json"})
	    @ResponseStatus(HttpStatus.OK)
	    public Iterable<POrder> getOrder() {
	 
	    	Iterable<POrder> orderList = orders.findAll();
	    	
	    	return orderList;
	    }

		@RequestMapping(method = RequestMethod.POST)
		public ResponseEntity<POrder> add(@RequestBody POrder input) {

			orders.save(input);
			
			//place order on queue
			orderSource.sendOrder(new Event(input, "ORDER", "KinesisProducer"));
						
			return new ResponseEntity<POrder>(input, HttpStatus.OK);
		}

}
