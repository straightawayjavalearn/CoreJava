package com.test.abstraction;

abstract class Shape {

	String colorOfShape;
   
	//abstarct method
	abstract double areaOfShape();

	public abstract String toString();

	public Shape(String colorOfShape) {
		System.out.println("Constructor of Shape class called");
		this.colorOfShape = colorOfShape;
	}

	//concrete method
	public String getColorOfShape() {
		return colorOfShape;
	}
}

class Circle extends Shape {
	double radiusOfCircle;

	public Circle(String colorOfShape, double radiusOfCircle) {
		super(colorOfShape);
		System.out.println("Constructor of Circle class called");
		this.radiusOfCircle = radiusOfCircle;
	}

	@Override
	double areaOfShape() {
		return Math.PI * Math.pow(radiusOfCircle, 2);
	}

	@Override
	public String toString() {
		return "Circle color is " + super.colorOfShape + " and area is : " + areaOfShape();
	}
}

class Rectangle extends Shape {
	double length;
	double width;

	public Rectangle(String colorOfShape, double length, double width) {
		// calling Shape constructor
		super(colorOfShape);
		System.out.println("Constructor of Rectangle class called");
		this.length = length;
		this.width = width;
	}

	@Override
	double areaOfShape() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle color is " + super.colorOfShape + " and area is : " + areaOfShape();
	}
}

public class AbstractionDemo {
	public static void main(String[] args) {
		Shape shapeObject1 = new Circle("Blue", 8.2);
		Shape shapeObject2 = new Rectangle("Green", 1, 2);
		System.out.println(shapeObject1.toString());
		System.out.println(shapeObject2.toString());
	}
}