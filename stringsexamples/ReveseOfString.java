package com.corejava.stringsexamples;

public class ReveseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		String str  = "Welcome To Edureka";
		String[] strArray = str.split(" ");
		for (String temp : strArray) {
				System.out.println(temp);
		}
		
		for (int i = 0; i < 3; i++) {
				char[] s1 = strArray[i].toCharArray();
				
				for (int j = s1.length-1; j >=0; j--) {
					System.out.print(s1[j]);	
				}
				
			System.out.print(" ");
			
		}
		
		System.out.println("");
		System.out.println("---------");
		reverseOfString("mallesh");
		
	}

	private static void reverseOfString(String string) {
		
		String s = "";
		for (int i = string.length()-1; i >=0 ; i--) {
			s = s+string.charAt(i);
		}
		System.out.println(s);
		
	}
	
	

}
