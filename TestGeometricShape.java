package Assignment2;

import java.util.Scanner;

abstract class GeometricShape {
	public abstract void area();

	public abstract void perimeter();
}

class Circle extends GeometricShape {
	final private static double PI = 3.14;
	private int radius;
	private double areaOfCircle;
	private double perimeterr;

	public Circle(int radius) {
		super();
		this.radius = radius;

	}

	public void area() {
		areaOfCircle = PI * radius * radius;
	}

	public void perimeter() {
		perimeterr = 2 * PI * radius;
	}

	public void display() {
		System.out.println("area of circler is =>>> " + areaOfCircle);
		System.out.println("perimeter of circle is =>>> " + perimeterr);
	}
}

class Rectangle extends GeometricShape {
	private int length;
	private int bredth;
	private int areaOfRectangle;
	private int perimeterr;

	public Rectangle(int length, int bredth) {
		super();
		this.length = length;
		this.bredth = bredth;
	}

	public void area() {
		areaOfRectangle = length * bredth;
	}

	public void perimeter() {
		perimeterr = (length + bredth) * 2;
	}

	public void display() {
		System.out.println("area of rectangle is =>>> " + areaOfRectangle);
		System.out.println("perimeter of rectangle is ==>>> " + perimeterr);
	}

}

class Triangle extends GeometricShape {
	private int side1;
	private int side2;
	private int side3;
	private double areaOfTriangle;
	private int perimeterr;

	public Triangle(int side1, int side2, int side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public void area() {
		areaOfTriangle = (side1 * side2) / 0.5;
	}

	public void perimeter() {
		perimeterr = side1 + side2 + side3;
	}

	public void display() {
		System.out.println("area of triangle is ==>>> " + areaOfTriangle);
		System.out.println("perimeter of triangle ==>>> " + perimeterr);
	}
}

public class TestGeometricShape {
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		circle.area();
		circle.perimeter();
		circle.display();
		System.out.println("==============================");
		Rectangle rectangle = new Rectangle(12, 12);
		rectangle.area();
		rectangle.perimeter();
		rectangle.display();
		System.out.println("==============================");
		Triangle triangle = new Triangle(3, 4, 5);
		triangle.area();
		triangle.perimeter();
		triangle.display();
	}
}
