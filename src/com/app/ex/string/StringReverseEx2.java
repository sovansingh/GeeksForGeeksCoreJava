package com.app.ex.string;

public class StringReverseEx2 {

	public static void main(String[] args) {
		String str = "Geeks For Geeks";
		
		System.out.println("Original String: "+str);
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(str);
		stringBuffer.reverse();
		System.out.println("Reverse String: "+stringBuffer);
	}
}
