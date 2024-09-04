package com.wirpro.collections;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {

	private Set<String> userIds;

	public SetInterface() {
		userIds = new HashSet<>();
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
		SetInterface reg = new SetInterface();
		
		reg.addUser("Unknown User");
		reg.addUser("Regular User");
		reg.addUser("Unknown User");
		
		System.out.println("Does unknown user exists? " + reg.userExists("Unknown User"));
		
		reg.removeUser("Unknown User");
		
		reg.removeUser("Unknown User");
	}
}
