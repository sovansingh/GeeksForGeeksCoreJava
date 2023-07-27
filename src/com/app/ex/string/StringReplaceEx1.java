package com.app.ex.string;

public class StringReplaceEx1 {

	public static void main(String[] args) {
		String str = "Geeks For Geeks";
		int index = 6;
		char c = 'L';
		
		System.out.println("Original String: "+str);
		StringBuilder stringBuilder = new StringBuilder(str);
		stringBuilder.setCharAt(index, c);
		System.out.println("Modified String: "+stringBuilder);
//		StringBuilder stringBuilder2 = new StringBuilder(str);
//		stringBuilder2.replace(c, index, str);
//		System.out.println("Modified String 1: "+stringBuilder2);
	
		StringBuffer stringBuffer = new StringBuffer(str);
		stringBuffer.setCharAt(index, c);
		System.out.println("Modified String: "+stringBuffer);
	}
}
