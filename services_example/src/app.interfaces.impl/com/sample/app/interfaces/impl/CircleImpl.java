
package com.sample.app.interfaces.impl;

import com.sample.app.interfaces.Circle;

public class CircleImpl implements Circle {

	public static final double PI = 3.14;

	@Override
	public double perimeter(double radius) {
		return 2 * PI * radius;
	}

	@Override
	public double area(double radius) {
		return PI * radius * radius;
	}

}

