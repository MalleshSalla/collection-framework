package com.corejava.setexamples;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("java");
		ts.add("python");
		ts.add("javascript");

		// ts.add(10); // invalid
		System.out.println(ts);

		/*
		 * TreeSet ts1 = new TreeSet(); ts1.add(new StringBuffer("java")); ts1.add(new
		 * StringBuffer("python"));
		 * 
		 * System.out.println(ts1);
		 */

		TreeSet<Integer> integers = new TreeSet<Integer>();
		integers.add(21);
		integers.add(12);
		integers.add(1);
		integers.add(0);
		integers.add(15);
		integers.add(17);

		System.out.println(integers);

		TreeSet<Integer> ts2 = new TreeSet<Integer>(new MyComparator());// ---->1
		ts2.add(10);
		ts2.add(0);
		ts2.add(15);
		ts2.add(5);
		ts2.add(20);
		System.out.println(ts2);// [20, 15, 10, 5, 0]

	}

}

class MyComparator implements Comparator<Object> {
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if (i1 < i2)
			return 1;
		else if (i1 > i2)
			return -1;
		else
			return 0;
	}
}
