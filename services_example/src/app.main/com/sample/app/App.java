
package com.sample.app;

import java.util.ServiceLoader;

import com.sample.app.interfaces.Circle;

public class App {

	public static void main(String args[]) {

		Iterable<Circle> iterable = ServiceLoader.load(Circle.class);
	
		System.out.println("Going to get instances");	
		for(Circle circle : iterable) {
			double area = circle.area(10);
			double perimeter = circle.perimeter(10);
			
			System.out.println("Area : " + area);
			System.out.println("Perimeter : " + perimeter);
		}
	}
}

