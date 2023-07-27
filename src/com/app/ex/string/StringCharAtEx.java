package com.app.ex.string;

public class StringCharAtEx {

	public static char getCharFromString(String str,int index) {
		char c = str.charAt(index);
		return c;
	}
	
	public static void main(String[] args) {
		String str = "sovanlipsa";
		int index = 6;
		
		char c = getCharFromString(str,index);
	
		System.out.println("Character from "+str+" at index "+index+" is : "+c);
	}
}
