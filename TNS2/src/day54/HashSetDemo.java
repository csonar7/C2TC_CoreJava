package day54;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1(1,"Ramesh",15000);
		Employee1 e2 = new Employee1(1,"Ramesh",15000);
		
		HashSet hs=new HashSet();
		hs.add(e1);
		System.out.println(hs.contains(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
