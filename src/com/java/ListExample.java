package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		//interface           class
		List<Object> l = new ArrayList<>(); //upcasting
		//parent              child
		
		//add
		l.add(25);
		l.add(75.89);
		l.add('S');
		l.add("ramya");
		l.add(69);
		
		System.out.println(l);
		
		//size
		int size = l.size();
		System.out.println(size);
		
		//get
	    Object obj = l.get(4);
		System.out.println(obj);
		
		//set
		l.set(1, 98);
		System.out.println(l);
		
		//indexOf
		int indexOf = l.indexOf(69);
		System.out.println(indexOf);
		
		//contains
		boolean contains = l.contains(150);
		System.out.println(contains);
		
		List<Integer> li = new ArrayList<>();
		
		li.add(36);
		li.add(66);
		li.add(25);
		li.add(53);
		li.add(69);
		
		System.out.println(li);
		
		//addAll
	//	l.addAll(li);
	//	System.out.println(l);
		
		//retainAll
	//	l.retainAll(li);
	//	System.out.println(l);
		
		//removeAll
	//	l.removeAll(li);
	//	System.out.println(l);
		
		//sort(Ascending order)
		Collections.sort(li);
		System.out.println(li);
		
		//sort(Descending order)
		Collections.sort(li,Collections.reverseOrder());
		System.out.println(li);
		
	/*	for (int i = 0; i < li.size(); i++) {
			
			System.out.println(li.get(i));
		} */
		
		for (Integer num : li) {
			
			System.out.println(num);
		}
		
		//remove
		li.remove(2);
		System.out.println(li);
		
		// clear
		li.clear();
		System.out.println(li);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
