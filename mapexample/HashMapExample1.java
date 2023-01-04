package com.corejava.mapexample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 
{
	public static void main(String[] args)
	{
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "Banana");
		map.put(2, "Apple");
		map.put(3, "Orange");
		map.put(4, "Straberry");
		map.put(5, "Grapes");
		map.put(6, "papaya");
		map.put(7, "Watermelon");
		map.put(8, "Kiwi");
		
		for(Map.Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}