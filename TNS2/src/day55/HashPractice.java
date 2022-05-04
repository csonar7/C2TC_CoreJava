package day55;

import java.util.HashSet;

public class HashPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hs=new HashSet<>();
		hs.add(45);
		hs.add(12);
		hs.add(11);
		hs.add(33);
		
		System.out.println(hs);
		
		System.out.println(hs.size());
		
		System.out.println(hs.contains(45));
		System.out.println(hs.isEmpty());
		System.out.println(hs.hashCode());

	}

}
