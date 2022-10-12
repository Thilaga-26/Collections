package com.simplilearn.PriortyQueue;

import java.util.PriorityQueue;

public class PriortyQueueAll1 {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> q1= new PriorityQueue<Integer>();
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
        System.out.println(q1);
        
		PriorityQueue<Integer> q2= new PriorityQueue<Integer>();
		q2.add(50);
		q2.add(60);
		q2.add(70);
		q2.add(80);
		System.out.println(q2);
		
		//q1.addAll(q2);
		
		//System.out.println(q1);
		
		//q1.removeAll(q1);
		//System.out.println(q1);
		
		System.out.println("Comparision of two priorty queue");
		for(Integer x:q1) {
			System.out.println(q2.contains(x)? "Yes" : "No");
		}

        System.out.println("The first element of the queue "+q1.peek());
        System.out.println(q1);
        System.out.println("The first element of the queue and removed it "+q2.poll());
		System.out.println(q2);
	}

}
