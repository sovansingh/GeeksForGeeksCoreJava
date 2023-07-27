package com.app.ex.string;

public class StringReplaceEx {

	public static void main(String[] args) {
		String str = "Geeks For Geeks";
		int index = 6;
		char c = 'A';
		
		System.out.println("Original String: "+str);
//		str  = str.substring(0, index)+c+str.substring(index+1);
//		System.out.println("Modified String: "+str);
		
		str = str.replace('G', 'L');
		System.out.println("Modified String: "+str);
	}
}
