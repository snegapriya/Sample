package com.java;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new LinkedHashMap<>();
		
		//put
		m.put(30, "chandru");
		m.put(50, "sheela");
		m.put(30, "allen");
		m.put(43, null);
		m.put(60, "chandru");
		m.put(85, null);
		m.put(90, "sheela");
		m.put(60, "hema");
		
		System.out.println(m);
		
		//size
		int size = m.size();
		System.out.println(size);
		
		//get
		String str = m.get(60);
		System.out.println(str);
		
		//keySet
		Set<Integer> key = m.keySet();
		System.out.println(key);
		
		//values
		Collection<String> values = m.values();
		System.out.println(values);
		
		//containsKey
		boolean containsKey = m.containsKey(168);
		System.out.println(containsKey);
		
		//containsValue
		boolean containsValue = m.containsValue("sheela");
		System.out.println(containsValue);
		
		//entrySet
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
