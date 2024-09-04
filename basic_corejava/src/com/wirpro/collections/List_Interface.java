package com.wirpro.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_Interface {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>(20);
		ArrayList<Integer> list3 = new ArrayList<Integer>(list2);
		
		list1.add("one"); list1.add("two"); list1.add("three");
		list1.add("one");
		System.out.println(list1.size());
		
		list1.ensureCapacity(20);
		System.out.println(list1.contains("two"));
		
		System.out.println(list1.indexOf("one"));
		
		System.out.println(list1.lastIndexOf("one"));
		
		System.out.println(list1.get(3));
		
		list1.remove(2);
		System.out.println(list1);
		
		ArrayList<String> list4 = new ArrayList<String>();
		
		list4.add("555"); list4.add("666"); list4.add("777");
		list4.add("888");
		
		list4.addAll(list1);
		
		System.out.println("Elements using ierator");
		
		Iterator<String> it = list4.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		ListIterator<String> lit = list4.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}
}
