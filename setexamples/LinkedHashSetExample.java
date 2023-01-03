package com.corejava.setexamples;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.add(27);
		hs.add(12);
		hs.add(null);
		hs.add(9);
		hs.add(21);
		hs.add(21);
		System.out.println(hs.size());
		
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		System.out.println("-------");
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);
		}
		
		System.out.println(hs.isEmpty());
		hs.clear();
		System.out.println(hs.isEmpty());
	}

}
