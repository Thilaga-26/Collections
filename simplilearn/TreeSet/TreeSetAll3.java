package com.simplilearn.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetAll3 {
	
	public static void main(String[] args) {
		
     TreeSet<Integer> x= new TreeSet<Integer>();
     TreeSet<Integer> treeheadset= new TreeSet<Integer>();

		
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		x.add(5);
		x.add(6);
		x.add(7);
		x.add(8);

		
		treeheadset= (TreeSet)x.headSet(7);
		
		Iterator iterator;
		iterator=treeheadset.iterator();
		
		System.out.println("display the set");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
