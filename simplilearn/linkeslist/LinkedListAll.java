package com.simplilearn.linkeslist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAll {
	
	public static void main(String[] args) {
		
		LinkedList<String> love= new LinkedList<String>();
		
		love.add("Butterfly");
		love.add("HoneyBee");
		love.add("Bubby");
		love.add("NatureLover");
		love.add("Waterfalls");
		
		System.out.println(love);
		
		love.add(3,"TajMahal");
		love.addFirst("ParisTower");
		love.addLast("Pyramid");
		
		System.out.println(love);
		
		love.offerFirst("FallSwing");
		love.offerLast("LakeBoat");
		System.out.println(love);
		
		LinkedList<String> love2= new LinkedList<String>();
		love2.add("ForestTrekking");
		love2.add("Mountains");
		
		love.addAll(1,love2);
		
		System.out.println(love);
		
	    Object first_element= love.getFirst();
	    System.out.println("The FirstOccurance is:"+first_element);
	    
	    Object last_element= love.getLast();
	    System.out.println("The FirstOccurance is:"+last_element);

		
		System.out.println("Ilterate using for each loop");
		for(String lover:love) {
			System.out.println(lover);
		}
		
		System.out.println("Iterate using Iterator");
		Iterator it= love.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Iterate through iterator from specified position");
		Iterator x= love.listIterator(2);
		while(x.hasNext()) {
			System.out.println(x.next());
		}
		System.out.println("Iterate through iterator using reverse");
		Iterator y= love.descendingIterator();
		while(y.hasNext()) {
			System.out.println(y.next());

		}
	}
	

}
