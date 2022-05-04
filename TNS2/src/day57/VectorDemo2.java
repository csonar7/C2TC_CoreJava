package day57;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1=new Vector();
		
		Employee2 e1=new Employee2(1,"aaa",125000);
		Employee2 e2=new Employee2(1,"aaa",125000);
		Employee2 e3=new Employee2(3,"ccc",325000);
		Employee2 e4=new Employee2(4,"ddd",425000);
		Employee2 e5=new Employee2(5,"eee",525000);
		Employee2 e6=new Employee2(6,"fff",25000);
		Employee2 e7=new Employee2(7,"ggg",625000);
		v1.add(e1);
		v1.add(e2);
		v1.add(e3);
		v1.add(e4);
		v1.add(e5);
		v1.add(e6);
		v1.add(e7);
		System.out.println(v1);
		
		
	}

}
