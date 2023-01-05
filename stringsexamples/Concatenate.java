package com.corejava.stringsexamples;

import java.util.Scanner;

public class Concatenate {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String firstStr = sc.next();
		
		System.out.println("Enter the Second String");
		String secondStr = sc.next();
		
		System.out.println("Result after concatination");

		System.out.println(firstStr + " " +secondStr);
		
	}
}
