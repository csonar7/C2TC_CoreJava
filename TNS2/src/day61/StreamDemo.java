package day61;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

import day59.Employee3;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee3> als=new ArrayList<>();
		
		Employee3 e1=new Employee3(101, "aaa",25300.25);
		Employee3 e2=new Employee3(102, "bbb",25300.25);
		Employee3 e3=new Employee3(103, "ccc",25780.36);
		Employee3 e4=new Employee3(104, "ddd",28720.25);
		Employee3 e5=new Employee3(105, "eee",25925.25);
		Employee3 e6=new Employee3(101, "aaa",25300.25);
		
		als.add(e1);
		als.add(e6);
		System.out.println(als.size());
		als.remove(e6);
		System.out.println(als.contains(e6));//true...because the duplicate object are present in it.
		als.add(e5);
		als.add(e4);
		als.add(e3);
		als.add(e2);
		
		Iterator<Employee3> ite= als.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		
		Stream<Employee3> stm=als.stream();
		System.out.println(stm);
		System.out.println("***********************");
		als.stream().forEach(System.out::println);
		
	}

}
