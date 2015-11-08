package com.hello.Ch03;

public class Square21 extends Polygon {

	/**
	 * Create a new sqaure.
	 */

	public Square21() {
		super(4);
	}

	/**
	 * Return the perimeter of the sqaure.
	 *
	 * @return the perimeter of the sqaure.
	 */

	public double getPerimeter() {
		return 4 * vertices[0].distanceFrom(vertices[1]);
	}

} // Square
