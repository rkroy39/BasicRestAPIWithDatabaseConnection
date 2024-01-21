package com.connectwithdatabase.test.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.connectwithdatabase.test.Entities.District_master;
import com.connectwithdatabase.test.Entities.STATE_master;
import com.connectwithdatabase.test.repository.DistrictDataRepo;
import com.connectwithdatabase.test.repository.StateDataRepo;

@RestController
public class TestController {

	
	@Autowired
	StateDataRepo stateDataRepo;
	@Autowired
	DistrictDataRepo districtDataRepo;
	@GetMapping("/")
	public String checkMethod() {
		
		return "hello";
	}
	@GetMapping("/getDistrictByState/{id}")
	public List<STATE_master> getdistrictsbyState(@PathVariable Long id) {
		List<STATE_master>	s=stateDataRepo.findAllById(id);
	
		return s;				
	}
//	@GetMapping("/getSates")
//	public List<STATE_master> getStates() {
//		
//		List<STATE_master> s=(List<STATE_master>) stateDataRepo.findAll();
//		return s;				
//	}
//	
//	@GetMapping("/getStateByDistrict/{id}")
//	public Optional getStateByDistrict(@PathVariable Long id) {
//		
//		Optional<District_master> s=districtDataRepo.findById(id);
//		return s;				
//	}
}
