package com.swl.kinesisproducer.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swl.kinesisproducer.data.POrder;

@Repository
public interface OrderRepository extends CrudRepository<POrder, Long> {

}
