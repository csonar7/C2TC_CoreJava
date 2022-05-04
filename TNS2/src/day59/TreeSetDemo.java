package day59;

import java.util.TreeSet;



public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts =new TreeSet();
		
		Employee3 e1=new Employee3(1,"aaa",125000);
		Employee3 e2=new Employee3(1,"aaa",125000);
		Employee3 e3=new Employee3(3,"ccc",325000);
		Employee3 e4=new Employee3(4,"ddd",425000);
		Employee3 e5=new Employee3(5,"eee",525000);
		Employee3 e6=new Employee3(6,"fff",25000);
		Employee3 e7=new Employee3(7,"ggg",625000);
		
		ts.add(e7);
		ts.add(e6);
		ts.add(e5);
		ts.add(e4);
		ts.add(e3);
		ts.add(e2);
		ts.add(e1);
		
		System.out.println(ts);
		
	}

}
