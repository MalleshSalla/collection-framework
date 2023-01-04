package com.corejava.mapexample;

import java.util.TreeMap;

public class TreeMapExample {
	
	public static void main(String[] args) {
		
		TreeMap<String,String> treeMap = new TreeMap<>();
		
		treeMap.put("Brave","courage");
		treeMap.put("Brilliant","clever");
		treeMap.put("Joy","happiness");
		treeMap.put("Confident","truth");
		
		
		for(String word: treeMap.keySet()) {
			System.out.println(treeMap.get(word));
		}
		
		
		
		
		/*	HashMap doesn't maintain insertion order or sorting order 
		 * 
		 * TreeMap  maintains natural order(ascending order)
		 * 
		 * LinkedHashMap maintain insertion order 
		 * 
		 * 
		 * HashMap doesn't allow null keys but allows null value,
		 *  but TreeMap doesn't allow null key. LinkedHashMap allows null key.
		 *  
		 *  5. Internal implementation
		 *     HashMap is internally based upon hash table data structure,
		 *      TreeMap is based upon Red Black Tree. and 
		 *      LinkedHashMap uses doubly linked list to keep elements in the same order they are inserted. 
		 *  
		 *  
		 *  
		 *  
		 *  None of these map are synchronized.
		 * */
	}

}
