package com.corejava.setexamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
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
		
		System.out.println("-----------");
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
		}
		
		System.out.println(hs.isEmpty());
		hs.clear();
		System.out.println(hs.isEmpty());
		
	}

}
