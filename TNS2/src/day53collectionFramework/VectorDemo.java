package day53collectionFramework;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		Vector v2=new Vector();
		
		String s1=new String("Hello");
		String s2=new String("Hello");
		Employee e1=new Employee(1,"Hello",1524.6);
		Employee e2=new Employee(1,"Hello",1524.6);
		v1.add(s1);
		System.out.println(v1.contains(s2));
		
		v2.add(e1);
		System.out.println(v2.contains(e2));
	}

}
