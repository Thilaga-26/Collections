package com.simplilearn.TreeSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetAll {
	
	public static void main(String[] args) {
		
		TreeSet<String> t= new TreeSet<>();
		t.add("Dinesh");
		t.add("Thilaga");
		t.add("LanaSri");
		t.add("Love");
		t.add("Family");
	    System.out.println(t);
		TreeSet<String> t1= new TreeSet<>();
		t1.add("xxx");
		t1.add("yyy");
		t1.add("zzz");
		t1.add("uuu");
		t1.add("rrr");
		System.out.println(t1);
		
		//TreeSet<String> t3= new TreeSet<>();
		//t3.addAll(t);
		//t3.addAll(t1);
		
		//t.addAll(t1);
		
		//System.out.println(t);

		
		System.out.println("Iterate Through for each Loop");
		for(String s:t) {
			System.out.println(s);
		}
		
		System.out.println("Iterate using Iterator");
		Iterator<String> a= t.descendingIterator();
		while(a.hasNext()){
			System.out.println(a.next());
		}
		
		Object first_element=t.first();
		System.out.println("The First Element is: "+first_element);
		
		Object last_element=t.last();
		System.out.println("THe last Element is: "+last_element);
		
		System.out.println("compare the two sets");
		for(String s:t) {
			System.out.println(t1.contains(s)? "Yes" : "No");
		}
				


		
	}

}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		