package com.simplilearn.linkeslist;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListAll5 {
	public static void main(String[] args) {
		
		LinkedList<String> y= new LinkedList<String>();
		
		y.add("Element");
		y.add("Element1");
		y.add("Element2");
		y.add("Element3");
		System.out.println(y);
		
		y.set(2, "Element 5");
		
		ArrayList<String> x= new ArrayList<String>(y);
		
		for(String e: x) {
			System.out.println(e);
		}
	}

}
