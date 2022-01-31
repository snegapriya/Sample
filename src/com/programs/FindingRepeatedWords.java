package com.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindingRepeatedWords {

	public static void main(String[] args) {
		
		String s = "by the people of the people for the people";
		
		String[] spl = s.split(" ");
		
		Map<String,Integer> m = new LinkedHashMap<>();
			
		for (String str : spl) {
			
			if (m.containsKey(str)) {
				
				Integer n = m.get(str);
				m.put(str, n+1);
			} 
			else {

				m.put(str,1);
			}
		//	System.out.println(m);
		}
		
		System.out.println(m);
		
		Set<Entry<String, Integer>> entrySet = m.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			
			if (entry.getValue()<3) {
				
				System.out.println(entry);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
