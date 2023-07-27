package com.app.ex.string;

public class StringReverseEx {

	public static void main(String[] args) {
		String str = "Geeks For Geeks";
		
		char[] strArray = str.toCharArray();
	
		for(char c : strArray) {
			System.out.print(c);
		}
		System.out.println();
		for(int i=strArray.length-1;i>=0;i--) {
			System.out.print(strArray[i]);
		}
	}
}
