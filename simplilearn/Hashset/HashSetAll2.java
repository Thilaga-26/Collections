package com.simplilearn.Hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetAll2 {
	
	public static void main(String[] args) {
		
		HashSet<String> set1= new HashSet<>();
		set1.add("11");
		set1.add("12");
		set1.add("13");
		set1.add("14");
        System.out.println(set1);
        
       // String a[]= new String[set1.size()];
       // set1.toArray(a);
        //System.out.println("The converted arrays are");
        //for(String m: a) {
        //	System.out.println(m);
        //}
       // TreeSet<String> Tree= new TreeSet<String>(set1);
        //System.out.println(Tree);
        
        ArrayList<String> L= new ArrayList<String>(set1);
        System.out.println(L);
	}

}
