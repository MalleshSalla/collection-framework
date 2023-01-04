package com.corejava.mapexample;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		Map<Integer,String> hashMap = new HashMap<>();
		
		hashMap.put(01, "Mallesh");
		hashMap.put(03, "Ahamad");
		hashMap.put(02, "Mallesh");
		hashMap.put(4, null);
		
		hashMap.put(null, null);
		
		System.out.println(hashMap);
		
		System.out.println(hashMap.keySet());
		
		System.out.println(hashMap.values());
		
		System.out.println(hashMap.size());
		
		
		//Checking whether key '3' exist in map
        
        System.out.println(hashMap.containsKey(3));      //Output : true
         
        //Checking whether value 'Mallesh' exist in hashmap
         
        System.out.println(hashMap.containsValue("Mallesh"));   //Output : true
		
		
//		for(Map.Entry<Integer, String> var : hashMap.entrySet()) {
//				
//			System.out.println(var.getKey() + " " + var.getValue());
//		}
		
		/*	1) hashmap allows null key and but allows null value.
		 * 	2) hashmap not allows duplicate key but allows duplicate values
		 * 	3) it doesn't follow insertion order but it follows sorted order.
		 *  4) hashmap is key and value pair.
		 *  
		 * */
		
	}
	

}
