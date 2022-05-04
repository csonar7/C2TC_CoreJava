package day59;

import java.util.Vector;

public class GenericDemo {

	public static void main(String[] args) {
		Vector<Employee3> ve=new Vector<>();//when we put any class in angular bracket vector accept only that data members..
		String s =new String("Hello");
		Employee3 ep=new Employee3(2,"ddd",154200);
		
		ve.add(ep);
		//ve.add(s);//error due to different data member
		//ve.add(3);
		
		System.out.println(ve);
		
	}

}
