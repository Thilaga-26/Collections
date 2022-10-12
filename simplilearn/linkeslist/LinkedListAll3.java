package com.simplilearn.linkeslist;

import java.util.LinkedList;

public class LinkedListAll3 {
	public static void main(String[] args) {
		

	
	LinkedList<String> list= new LinkedList<String>();
	
	list.add("Triangle");
	list.add("Circle");
	list.add("Square");
	list.add("Rectangle");
	list.add("Pentagon");
	System.out.println(list);
	
	LinkedList<String> list2= new LinkedList<String>();
	
	list2.add("Colors");
	list2.add("Circle");
	list2.add("Natures");
	list2.add("Animals");
	list2.add("Pentagon");
	System.out.println(list2);
	
	list2.offer("Hexagon");
	System.out.println(list2);

	//list.addAll(list2);
	
	//System.out.println(list);
	
	LinkedList<String> list3= new LinkedList<String>();
	
	//list3.addAll(list);
	///list3.addAll(list2);
	
	//System.out.println("The joined List and List2 is: "+list3);
      for(String x:list) {
		list3.add(list2.contains(x)? "Yes" : "No");
		System.out.println(list3);
	}
	

}
}