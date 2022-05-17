package com.tns.hibrenate;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity

//SIngle Table Inheritance
//@Table(name = "employee")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name= "employeetype", discriminatorType= DiscriminatorType.STRING )
//@DiscriminatorValue("EMPLOYEE")


//Table per class Inheritance
//@Table(name = "employee1")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)


//join the two tables
@Table(name="employee2")
@Inheritance(strategy = InheritanceType.JOINED)

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String empName;
	private double empsal;
	public Employee() {
		
	}
	public Employee(int id, String empName, double empsal) {
		super();
		this.id = id;
		this.empName = empName;
		this.empsal = empsal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	
}
