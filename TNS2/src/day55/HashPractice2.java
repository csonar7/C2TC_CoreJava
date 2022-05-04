package day55;

import java.util.HashSet;
import java.util.Iterator;

public class HashPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs1=new HashSet<>();
		hs1.add("hello");
		hs1.add("hii");
		hs1.add("Bye");
		hs1.add("AAA");
		hs1.add("BBB");
		
		System.out.println(hs1);
		
		System.out.println(hs1.size());
		hs1.remove("BBB");
		System.out.println(hs1);
		
		Iterator<String> it =hs1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for(String s:hs1)
		{
			System.out.println(s);
		}
			
		
	}

}
