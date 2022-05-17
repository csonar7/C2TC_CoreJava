package com.tns.hibrenate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

//@DiscriminatorValue("MANAGER")

//@Table(name="manager1")

@Table(name="manager2")

public class Manager extends Employee{
	
	private static final long serialVersionUID = 1L;
	
	private String departName;

	public Manager() {
		super();
	}

	public Manager(String departName) {
		super();
		this.departName = departName;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}
	

}
