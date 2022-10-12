package com.simplilearn.linkeslist;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListAll2 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> nature= new LinkedList<Integer>();
		
		nature.add(25);
		nature.add(35);
		nature.add(45);
		nature.add(55);
		nature.add(65);
		nature.add(75);
		nature.add(85);
		
		System.out.println(nature);
		
		for (int e=0;e<nature.size();e++) {
			System.out.println("The index is "+e+ " : "+nature.get(e));
		}

		nature.remove(1);
		
		System.out.println(nature);
		
		Object firstelement= nature.removeFirst();
		System.out.println("First Element REmoved : "+ firstelement);
		
		Object lastelement= nature.removeLast();
		System.out.println("Last Element Removed : "+ lastelement);
		
		//nature.removeAll(nature);
		//System.out.println(nature);
		
		Collections.swap(nature, 2, 3);
		System.out.println(nature);
		
		Collections.shuffle(nature);
		System.out.println(nature);
				
	}

}
