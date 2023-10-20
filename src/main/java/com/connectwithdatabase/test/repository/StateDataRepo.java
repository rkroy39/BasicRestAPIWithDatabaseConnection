package com.connectwithdatabase.test.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.connectwithdatabase.test.Entities.District_master;
import com.connectwithdatabase.test.Entities.STATE_master;

public interface StateDataRepo extends CrudRepository<STATE_master,Long> {
	List<STATE_master> findAllById(Long id);

	
}
