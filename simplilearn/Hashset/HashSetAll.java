package com.simplilearn.Hashset;

import java.util.HashSet;

public class HashSetAll {
	
	public static void main(String[] args) {
		
		HashSet<String> set= new HashSet<>();
		
		set.add("Canada");
		set.add("London");
		set.add("Italy");
		set.add("Greece");
		set.add("Maldivs");
		
		System.out.println(set);
		
		System.out.println("Iterate using For each loop");
		for(String s:set) {
			System.out.println(s);
		}
		System.out.println("The Number of elements in the set is "+set.size());
		
		System.out.println("Checking the HahSet is Empty or Not :"+set.isEmpty());
		
		//set.clear();
	   // System.out.println(set);
		//System.out.println("Checking the HahSet is Empty or Not :"+set.isEmpty());

	}

	
}
