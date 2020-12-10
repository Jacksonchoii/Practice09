package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

	public static void main(String[] args) {
		List<Shape> sList = new ArrayList<Shape>();

		Shape r = new Rectangle(5, 6);
		Shape t = new RecTriangle(6, 2);
		sList.add(r);
		sList.add(t);

		for (int i = 0; i < sList.size(); i++) {

			System.out.println("area: " + sList.get(i).getArea());
			System.out.println("Perimeter: " + sList.get(i).getPerimeter());

			if (sList.get(i) instanceof Resizeable) {
				((Resizeable) sList.get(i)).resize(0.5);

				System.out.println("new area: " + sList.get(i).getArea());
				System.out.println("new Perimeter: " + sList.get(i).getPerimeter());
			}
		}

	}
}