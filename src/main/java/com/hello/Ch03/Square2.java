package com.hello.Ch03;

public class Square2 extends Polygon {

	public Square2() {
		super(4);
	}

	@Override
	public double getPerimeter() {
		return 4 * vertices[0].distanceFrom(vertices[1]);
	}

}
