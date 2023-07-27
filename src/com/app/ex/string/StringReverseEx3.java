package com.app.ex.string;

public class StringReverseEx3 {

	public static void main(String[] args) {
		String str = "Geeks For Geeks";
		System.out.println(str);
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(str);
		stringBuilder.reverse();
		System.out.println(stringBuilder);
	}
}
