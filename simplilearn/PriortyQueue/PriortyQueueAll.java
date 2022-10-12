package com.simplilearn.PriortyQueue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriortyQueueAll {
	
	public static void main(String[] args) {
		
		PriorityQueue<String> queue= new PriorityQueue<String>();
		
		queue.add("Elephants");
		queue.add("Horse");
		queue.add("Tiger");
		queue.add("Lion");
		queue.add("Cheetah");
		
		System.out.println(queue);
		
		queue.offer("deer");
	
		System.out.println("Iterate using for each loop");
		for(String x: queue) {
			System.out.println(x);
		}
		
		System.out.println("Iterate using iterator");
		Iterator<String> a= queue.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		
		System.out.println("The Number of Elements in the queue is : "+queue.size());
		
		ArrayList<String> x= new ArrayList<String>(queue);
		System.out.println(x);
	}

}
