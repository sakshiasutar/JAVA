package xyz;

class Area{
	private int length;
	private int breadth;
	
	public Area(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public void getArea() {
		int area = length * breadth;
		System.out.println("Area : " + area);
	}
}
public class EncapsulationExample2 {
    public static void main(String[] args) {
    	Area a = new Area(2,16);
    	a.getArea();
    }
}
