package com.wirpro.collections;

public class Box<T> {
	private T content;
	
	public Box(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}
	
	public void setContent(T content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Box [content=" + content + "]";
	}
	
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>(123);
		System.out.println(intBox);
		
		Box<String> strBox = new Box<>("hello world");
		System.out.println(strBox);
	}
}
