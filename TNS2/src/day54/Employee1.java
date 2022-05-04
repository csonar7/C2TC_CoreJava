package day54;


public class Employee1 {
	int id;
	String name;
	double salary;
	
	public Employee1()
	{
		
	}
	public Employee1(int id, String name, double salary) {
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
		if(o instanceof Employee1)
		{
			return ((Employee1)o).id==this.id;
		}
		return false;
		
	}
	public int hashcode()
	{
		return id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

	
	

}
