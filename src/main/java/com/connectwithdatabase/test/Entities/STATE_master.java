package com.connectwithdatabase.test.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
//@Table(name="state_master")
public class STATE_master {
	
	@Id
	private Long id;
	private String state_name;
	private String country_id;

	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "state_id", referencedColumnName = "id")
	private List<District_master> district_master;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getCountry_id() {
		return country_id;
	}
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
	public List<District_master> getDistrict_master() {
		return district_master;
	}
	public void setDistrict_master(List<District_master> district_master) {
		this.district_master = district_master;
	}
	
//	public District_master getDistrict_master() {
//		return district_master;
//	}
//	public void setDistrict_master(District_master district_master) {
//		this.district_master = district_master;
//	}
	
	
}
