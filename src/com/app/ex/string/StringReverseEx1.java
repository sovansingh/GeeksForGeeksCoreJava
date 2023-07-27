package com.app.ex.string;

public class StringReverseEx1 {

	public static void main(String[] args) {
		String str = "Geeks For Geeks";
		String nstr = "";
		System.out.println(str.toString());
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			nstr = c+nstr;
		}
		System.out.println(nstr);
	}
}
