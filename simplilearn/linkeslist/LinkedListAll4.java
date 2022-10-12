package com.simplilearn.linkeslist;

import java.util.LinkedList;

public class LinkedListAll4 {
	public static void main(String[] args) {
		
		LinkedList<Integer> s= new LinkedList<Integer>();
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		System.out.println(s);
		
		LinkedList<Integer> s1= new LinkedList<Integer>();
		
		s1=(LinkedList)s.clone();
		System.out.println(s1);
		
		System.out.println(s.pollFirst());
		System.out.println(s);
		
		System.out.println(s.peekFirst());
		System.out.println(s);
		
		System.out.println(s.peekLast());
		System.out.println(s);
		
		if(s.contains(3)) {
			System.out.println("The number 3 exist in the linked list");
					}
		else {
			System.out.println("The number 3 does not exists in the linked list");
		}
        System.out.println("The linked list is empty or not: "+s.isEmpty());
        s.set(2, 8);
        System.out.println(s);
	}

}
