package com.simplilearn.TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapAll2 {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> Amir= new TreeMap<>();
		SortedMap<Integer, String> amir= new TreeMap<>();

		Amir.put(45, "Don");
		Amir.put(25, "Motu");
		Amir.put(68, "Patlu");
		Amir.put(79, "Golmal");
		Amir.put(93, "Chiku");
		System.out.println(Amir);
		
		System.out.println("Key-Value using GreatestKey in the Map: "+Amir.firstEntry());
		System.out.println("Key-Value using LeastKey in the Map: "+Amir.lastEntry());
		
		System.out.println("Key using GreatestKey in the map: "+Amir.firstKey());
		System.out.println("Key using LeastKey in the map: "+Amir.lastKey());
		
		System.out.println("Descending order view of map: "+Amir.descendingKeySet());
		
		System.out.println("Key-Value mapping to get Greatest Key less than or equal to given key: "+Amir.floorEntry(65));
		
		System.out.println("Key to get the Greatest Key less than or equal to given key: "+Amir.floorKey(65));
		
		System.out.println("Portion of the map whose keys are strictly less than the given key: "+Amir.headMap(75));
		
		System.out.println("Portion of the map whose Keys are less than or equal to(Inclusive) to given key: "+Amir.headMap(75, true));
		
		System.out.println("LeastKey Strictly Greater than the given key,if not null: "+Amir.higherEntry(65));
		System.out.println("LeastKey Strictly Greater than the given key,if not null: "+Amir.higherEntry(75));
		System.out.println("LeastKey Strictly Greater than the given key,if not null: "+Amir.higherEntry(95));
		
		System.out.println("Key-Value mapping GreatestKey Strictly less than the given key,if not null: "+Amir.lowerEntry(65));
		System.out.println("Key-Value mapping GreatestKey Strictly less than the given key,if not null: "+Amir.lowerEntry(30));
		System.out.println("Key-Value mapping GreatestKey Strictly less than the given key,if not null: "+Amir.lowerEntry(25));
		
		System.out.println("Key GreatestKey Strictly less than the given key,if not null: "+Amir.lowerKey(25));
		System.out.println("Key GreatestKey Strictly less than the given key,if not null: "+Amir.lowerKey(30));
		System.out.println("Key GreatestKey Strictly less than the given key,if not null: "+Amir.lowerKey(65));
		
		System.out.println("To get the Navigable set view of the Map: "+Amir.navigableKeySet());
		
		System.out.println("Remove Key-Value Mapping associated with leastkey "+Amir.pollFirstEntry());
		System.out.println(Amir);
		
		System.out.println("Remove Key-Value Mapping associated with Greatestkey "+Amir.pollLastEntry());
		System.out.println(Amir);
		
		amir= Amir.subMap(45, 79);
		System.out.println("Portion of the map whose range from given key to another key: "+amir);
		
		amir=Amir.subMap(45, true, 79, true);
		System.out.println("Portion of the map whose range from given key to another key: "+amir);

		System.out.println("Portion of the map is greater than or equal to the given key "+Amir.tailMap(65));
		
		System.out.println("portion of a map whose keys are greater than to a given key "+Amir.tailMap(40, false));
		
		System.out.println("Key-Value Mapping associated with leastkey greater than or equal to given key: "+Amir.ceilingEntry(65));

		System.out.println("Key associated with leastkey greater than or equal to given key: "+Amir.ceilingKey(65));

	}

}
