package com.simplilearn.TreeSet;

import java.util.TreeSet;

public class TreeSetAll2 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> x= new TreeSet<Integer>();
		
		x.add(10);
		x.add(18);
		x.add(45);
		x.add(52);
		x.add(63);
		x.add(75);
		x.add(82);
		x.add(93);

		System.out.println(x);

		System.out.println("The Greater than or Equal to is: "+x.ceiling(60));
		System.out.println("The Greater than or Equal to is: "+x.ceiling(20));
		
		System.out.println("The less than or Equal to is: "+x.floor(60));
		System.out.println("The less than or Equal to is: "+x.floor(20));
		
		System.out.println("The Greater than or Equal to is: "+x.higher(60));
		System.out.println("The Greater than or Equal to is: "+x.higher(20));
		
		System.out.println("The less than or Equal to is: "+x.lower(60));
		System.out.println("The less than or Equal to is: "+x.lower(20));
		
		
		
		
		
		
	}

}
