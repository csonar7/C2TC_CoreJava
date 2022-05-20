package demo.Practice;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name="EmpDatail")

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="EmpName")
	private String empName;
	
	@Column(name="Salary")
	private double empsal;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Departmaent_Id")
	private Department department;
	public Employee() {
		
	}
	public Employee(int id, String empName, double empsal,Department department) {
		super();
		this.id = id;
		this.empName = empName;
		this.empsal = empsal;
		this.department=department;
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
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
