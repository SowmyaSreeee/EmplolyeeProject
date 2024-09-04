package com.wirpro.collections;

import java.util.ArrayList;
import java.util.List;

public class TestWildCardUnBounded {
	
	public static void printList(List<?>list){
		for(Object item : list) {
			System.out.println(item);
		}
	}
	
	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("Hello"); li.add("World");
		
		List<Integer> liInt = new ArrayList<>();
		liInt.add(10); liInt.add(20); liInt.add(30);
		
		printList(li); printList(liInt);
	}

}
