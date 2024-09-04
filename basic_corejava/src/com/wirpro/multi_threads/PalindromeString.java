package com.wirpro.multi_threads;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "madaM";

		if(isPalindrome(str)) {
			System.out.println(str + " is a palindrome");
		}
		else {
			System.out.println(str + " is not a palindrome");
		}
	}

	private static boolean isPalindrome(String str) {
		String temp = "";
		for(int i = str.length()-1 ; i >= 0 ; i--) {
			temp += str.charAt(i);
		}
		return temp.equalsIgnoreCase(str);
	}
}
