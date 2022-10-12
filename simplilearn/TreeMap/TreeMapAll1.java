package com.simplilearn.TreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapAll1 {
	public static void main(String[] args) {
		
TreeMap<Integer, String> z= new TreeMap<Integer, String>();
		
		z.put(5, "Berlin");
		z.put(8, "Cumcum");
		z.put(15, "Theribaby");
		z.put(28, "Loveyou");
		z.put(44, "Sachin");
		System.out.println(z);
	}

}

class SortKey implements Comparator<String>{
	
	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.compareTo(s2);
	}
}
