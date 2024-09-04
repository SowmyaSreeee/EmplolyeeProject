package com.wirpro.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTester {
	public static void main(String[] args) {
		List<Student> s = new ArrayList<Student>();
		
		Student s1 = new Student(10 , "Shinchan" , 10);
		Student s2 = new Student(20 , "Himawari" , 6);
		Student s3 = new Student(30 , "Kazama" , 9);
		s.add(s1); s.add(s3); s.add(s2);
		Collections.sort(s);
		 for(Student student : s) {
			 System.out.println(student);
		 }
	}

}
