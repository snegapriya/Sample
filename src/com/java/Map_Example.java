package com.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Example {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new LinkedHashMap<>();
		
		//put
		m.put(10, "Nevil");
		m.put(25, "revathi");
		m.put(10, null);
		m.put(60, "prashanth");
		m.put(75, null);
		m.put(90, "prashanth");
		m.put(60, "Nevil");
		m.put(82, "revathi");
		
		System.out.println(m);
		
		//size
		int size = m.size();
		System.out.println(size);
		
		//get
		String str = m.get(25);
		System.out.println(str);
		
		//keySet
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		//values
		Collection<String> values = m.values();
		System.out.println(values);
		
		//containsKey
		boolean containsKey = m.containsKey(43);
		System.out.println(containsKey);
		
		//containsValue
		boolean containsValue = m.containsValue("prashanth");
		System.out.println(containsValue);
		
		//entrySet
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
