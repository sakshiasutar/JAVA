package Java;

interface shapes{
	double calculateArea(); // Abstract method
}

class circles implements shapes{
	private double radius;

	public circles(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	
}

class rectangles implements shapes{
	private double length;
	private double width;
	
	public rectangles(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return length * width;
	}
	
}

public class InterfaceExample {
    public static void main(String[] args) {
    	
    	circles c = new circles(5.0);
    	rectangles r = new rectangles(4.0,6.0);
    	
    	System.out.println("Area of Circle: "
                + c.calculateArea()); 
        System.out.println("Area of Rectangle: "
                + r.calculateArea());
    }
}
