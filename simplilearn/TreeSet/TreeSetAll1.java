package com.simplilearn.TreeSet;

import java.util.TreeSet;

public record TreeSetAll1() {
	
	public static void main(String[] args) {
		
		TreeSet<String> t= new TreeSet<>();
		t.add("Dinesh");
		t.add("Thilaga");
		t.add("LanaSri");
		t.add("Love");
		t.add("Family");
		System.out.println(t);
		
		TreeSet<String> t1= new TreeSet<>();
		t1=(TreeSet)t.clone();
		System.out.println(t1);
		
		System.out.println("The size of the Set is: "+t1.size());

	}

}
