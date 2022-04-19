package day40;


class Parent {
	String name;
	void method()
	{
		System.out.println("Method from Parent");
	}
}
class Child extends Parent {
	int id;
	@Override 
	void method()
	{
		System.out.println("Method from Child");
	}
}

public class UpandDown {
	public static void main(String[] args)
	{
		// Upcasting
		Parent p = new Child();
		p.name = "Chetan";
		System.out.println(p.name);
		p.method();
		// Downcasting Explicitly
		Child c = (Child)p;
		c.id = 1;
		System.out.println(c.name);
		System.out.println(c.id);
		c.method();
	}
}
