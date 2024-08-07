package oops.abstraction;

abstract class Shape{
	String color;
	// these are abstract methods 
	abstract double area();
	public abstract String toString();
	
	// abstract class can have the constructor 
	public Shape(String color) {
		System.out.println("Shape Constructor is called");
		this.color = color;
	}
	
	
	public String getColor() {
		return color;
	}
}

class Circle extends Shape{
	double radius;

	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle Constructor is called");
		this.radius = radius;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radius,2);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Circle color is " + super.getColor() 
        + " and area is : " + area();
	}
	
//	The 'super' keyword allows referencing the parent class or superclass of a subclass in Java.
	
}	

class Rectangle extends Shape{
	double length; 
    double width;
    
	public Rectangle(String color, double length, double width) {
		super(color);
		System.out.println("Rectangle constructor called");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle color is " + super.getColor() 
        + " and area is : " + area();
	}
    
}

public class AbstractClass {
    public static void main(String[] args) {
    	Shape s1 = new Circle("Red",2.2);
    	Shape s2 = new Rectangle("Yellow",2,4);
    	
    	 System.out.println(s1.toString()); 
         System.out.println(s2.toString());
    }
}
