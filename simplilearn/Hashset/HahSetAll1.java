package com.simplilearn.Hashset;

import java.util.HashSet;

public class HahSetAll1 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set1= new HashSet<>();
		set1.add(11);
		set1.add(12);
		set1.add(13);
		set1.add(14);
        System.out.println(set1);
		HashSet<Integer> set2= new HashSet<>();
		//set2= (HashSet)set1.clone();
		//System.out.println(set2);

        set2.add(15);
        set2.add(12);
        set2.add(17);
        set2.add(14);
        System.out.println(set2);

		//System.out.println("Compare the two sets");
		//for(Integer d: set1) {
		//System.out.println(set2.contains(d)? "Yes" : "No");
	    //}
        
        //set1.retainAll(set2);
        //System.out.println(set1);
        
        set1.removeAll(set1);
        set2.removeAll(set2);
        System.out.println(set1);
        System.out.println(set2);
	}

}
