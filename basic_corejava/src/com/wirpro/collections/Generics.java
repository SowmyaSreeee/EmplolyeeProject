package com.wirpro.collections;

public class Generics {
	public static<T> void printArray(T[] array) {
		for(T element :array) {
			System.out.println(element);
		}
	}
public static void main(String[] args) {
	Integer[] intArray = {1 ,2 , 3,4, 5};
	printArray(intArray);
	
	String[] strArray = {"Hello", "world" , "Generics"};
	printArray(strArray);
}
}
