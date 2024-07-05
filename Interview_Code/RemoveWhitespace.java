//How to remove Whitespace from String.
package com.jbk.practice01;

public class RemoveWhitespace {

	public static void main(String[] args) {
		
		String str = "  Hello   my name is    mayur   ";
		
//		using built in method
//		str = str.replaceAll("\\s+", " ");
//		
//		//remote whitespace from front and back
//		str = str.trim();
//		
//		System.out.println(str);
		
		//without method
		String newstr = "";
		
		for(int i=0; i<str.length(); i++) {
			//single character
			char ch = str.charAt(i);
			if(!Character.isWhitespace(ch)) {
				newstr+=ch;
			}
		}
		
		System.out.println(newstr);
		

	}

}
