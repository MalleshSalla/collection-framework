package com.corejava.setexamples;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
	public static void main(String[] args) {
		SortedSet<Integer> ss = new TreeSet<Integer>();
		for (int i = 10; i <= 20; i++) {
			ss.add(i);
		}
		
		System.out.println(ss.first());// 10
		System.out.println(ss.last());// 20
		System.out.println(ss.headSet(16));// [10, 11, 12, 13, 14, 15]
		System.out.println(ss.tailSet(18));// [18, 19, 20]
		System.out.println(ss.subSet(12, 17));// [12, 13, 14, 15, 16]
		System.out.println(ss.comparator());// null
	}
}