package day56;

import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 =new Vector();
		Vector v2=new Vector();
		String s1=new String("Hello");
		String s2=new String ("Hello");
		v1.add(s1);
		System.out.println(v1.contains(s2));//true...because of predefined class and in that class equal method are defined
		
		Fruits f=new Fruits("Apple","Sweet",150);
		Fruits f1=new Fruits("Apple","Sweet",150);
		v2.add(f1);
		//System.out.println(v2.contains(f));//false... because equal method not defined
		
		

	}

}
