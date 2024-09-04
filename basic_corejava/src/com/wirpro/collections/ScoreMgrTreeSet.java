package com.wirpro.collections;

import java.util.TreeSet;

public class ScoreMgrTreeSet {
	private TreeSet<Integer> scores;
	
	public ScoreMgrTreeSet() {
		scores = new TreeSet<>();
	}

	public void addScore(int score) {
		if(scores.add(score)) {
			System.out.println("score " + score + " added" );
		} else {
			System.out.println("Score " + score + " is already in the set");
		}
	}
	
	public int getHighestScore() {
		return scores.last();
	}
	
	public int getLowestScore() {
		return scores.first();
	}
	
	public void topNScores(int top) {
		System.out.println("top" + top + " scores sre :");
		scores.descendingSet().stream().limit(top).forEach(score -> System.out.println(score));
	}
	
	public void getscoresInRange(int ll , int ul) {
		System.out.println("Scores between " + ll + " and " + ul + " are :");
		scores.subSet(ll ,  true , ul , true).forEach(score -> System.out.println(score));
	}
	
	public static void main(String[] args) {
		ScoreMgrTreeSet mgr = new ScoreMgrTreeSet();
		
		mgr.addScore(50); mgr.addScore(20); mgr.addScore(30);
		mgr.addScore(40); mgr.addScore(10); mgr.addScore(10);
		
		System.out.println("highest score is: " + mgr.getHighestScore());
		System.out.println("Lowest score is: " + mgr.getLowestScore());
		
		mgr.topNScores(3);
		mgr.getscoresInRange(20, 40);
		
		System.out.println(mgr);
	}

	@Override
	public String toString() {
		return "ScoreMgrTreeSet [scores=" + scores + "]";
	}
}
