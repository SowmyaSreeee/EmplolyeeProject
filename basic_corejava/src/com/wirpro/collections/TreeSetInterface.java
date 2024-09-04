package com.wirpro.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetInterface {

	private Set<String> userIds;

	public TreeSetInterface() {
		userIds = new TreeSet<>();
	}

	public boolean addUser(String userId) {
		if(userIds.add(userId)) {
			System.out.println("User id " + userId + " Added successfully");
			return false;
		}
		else {
			System.out.println("User id " + userId + " already exists");
			return true;
		}
	}
	
	public boolean userExists(String userId) {
		return userIds.contains(userId);
	}
	
	public boolean removeUser(String userId) {
		if(userIds.remove(userId)) {
			System.out.println("User " + userId + " removed successfully");
			return true;
		}
		else {
			System.out.println("User id " + userId + " not exists");
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		TreeSetInterface reg = new TreeSetInterface();
		
		reg.addUser("Unknown User");
		reg.addUser("Regular User");
		reg.addUser("Miss Unknown User");
		reg.addUser("Miss Regular User");
		reg.addUser("Mr Unknown User");
		reg.addUser("Unknown User");
		
//		System.out.println("Does unknown user exists? " + reg.userExists("Unknown User"));
//		
//		reg.removeUser("Unknown User");
//		
//		reg.removeUser("Unknown User");
		
		System.out.println(reg);
	}
}
