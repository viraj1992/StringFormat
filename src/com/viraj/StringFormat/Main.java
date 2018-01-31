package com.viraj.StringFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String Class
		
		String stringResult = String.format("Integer: %d\n", 58);
		System.out.println(stringResult);
		
		String floatString = String.format("A floating point number with 3 decimal places: %.3f\n", 2.56);
		System.out.println(floatString);
		
		String floatString2 = String.format("A floating point number with 10 decimal places: %.10f\n", 55.35);
		System.out.println(floatString2);
		
		String stringValue = String.format("String: %s\n", "Hiiiii");
		System.out.println(stringValue);
		
		String multipleStringValues = String.format("String: %s Integer: %d Float: %f\n", "Hello", 55, 0.56);
		System.out.println(multipleStringValues);
		
		String strValue1 = String.format("Integer: %4d", 4);
		System.out.println(strValue1);
		
		String strValue2 = String.format("Integer: %6d", 741258);
		System.out.println(strValue2);
		
		String strValue3 = String.format("Integer: %-5d", 998);
		System.out.println(strValue3);
		
		String strvalue4 = String.format("Integer: %08d\n", 98);
		System.out.println(strvalue4);
		
		String strValue5 = String.format("%-15s %-15s %s", "First Column", "Second Column", "Third Column");
		System.out.println(strValue5);
		
	}

}
