package com.hello.Ch03;

public class Dog implements Animal {
	private String name;

	public Dog(String n) {
		name = n;
	}

	@Override
	public String speak() {
		return "Woof Woof";
	}

	public boolean isCarnivoire() {
		return true;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean isCarnivore() {
		// TODO Auto-generated method stub
		return false;
	}
}
