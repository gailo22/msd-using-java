package com.hello.Ch03;

class Superclass1 {

	private int id;

	public Superclass1(int myId) {
		id = myId;
	}
}

public class Subclass1 extends Superclass1 {

	public Subclass1(int myId) {
		super(myId);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		Subclass1 x = new Subclass1(1);
	}
}
