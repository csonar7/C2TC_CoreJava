package day59;


public class Employee3 implements Comparable {
	int id;
	String name;
	double salary;
	
	public Employee3()
	{
		
	}
	public Employee3(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean equals(Object o)
	{
		if(o instanceof Employee3)
		{
			return ((Employee3)o).id==this.id;
		}
		return false;
		
	}
	public int hashcode()
	{
		return id;
	}
	
	@Override
	public int compareTo(Object o)
	{
		if(this.id < ((Employee3)o).id)
		return -1;
		if(this.id > ((Employee3)o).id)
			return 1;
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
