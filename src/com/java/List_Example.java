package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Example {

	public static void main(String[] args) {
		
		//interface            class
		List<Object> li = new ArrayList<>(); //upcasting
		//parent               child
		
		//add
		li.add(10);
		li.add(30);
		li.add("nevil");
		li.add(26.89);
		li.add(80);
		
		System.out.println(li);
		
		//size
		int size = li.size();
		System.out.println(size);
		
		//get
		Object obj = li.get(2);
		System.out.println(obj);
		
		//set
		li.set(3, 46);
		System.out.println(li);
		
		//indexOf
		int indexOf = li.indexOf(80);
		System.out.println(indexOf);
		
		//contains
		boolean contains = li.contains(93);
		System.out.println(contains);
		
		List<Integer> li1 = new ArrayList<>();
		
		li1.add(30);
		li1.add(60);
		li1.add(86);
		li1.add(10);
		li1.add(45);
		
		System.out.println(li1);
		
		//addAll
	//	li.addAll(li1);
	//	System.out.println(li);
		
		//retainAll
	//	li.retainAll(li1);
	//	System.out.println(li);
		
		//removeAll
	//	li.removeAll(li1);
	//	System.out.println(li);
		
		//sort(Ascending order)
		Collections.sort(li1);
		System.out.println(li1);
		
		//sort(Descending order)
		Collections.sort(li1,Collections.reverseOrder());
		System.out.println(li1);
		
		
	/*	for (int i = 0; i < li1.size(); i++) {
			
			System.out.println(li1.get(i));
		} */
		
		for (Integer num : li1) {
			
			System.out.println(num);
		}
		
		//remove
		li1.remove(2);
		System.out.println(li1);
		
		//clear
		li1.clear();
		System.out.println(li1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
