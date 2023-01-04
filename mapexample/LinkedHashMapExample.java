package com.corejava.mapexample;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> obj = new LinkedHashMap<Integer, String>();
		obj.put(15, "grapes");
		obj.put(12, "apple");
		obj.put(18, "mango");
		
		System.out.println(obj);
		
		System.out.println(obj.size());
		
		Set<Integer> ks= obj.keySet();
		System.out.println(ks);
		
		Collection<String> cv = obj.values();
		System.out.println(cv);
		
		Set<?> entry = obj.entrySet();
		System.out.println(entry);
		
		System.out.println(obj.containsKey(15));
		
		
		
	}

}
