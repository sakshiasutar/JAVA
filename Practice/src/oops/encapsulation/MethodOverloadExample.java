package oops.encapsulation;

class Helper{
    
	static int Multiply(int a, int b) {
		return a*b;
	}
	
//	method with same name as above but with different parameters or datatypes
	static double Multiply(double a, double b) {
		return a*b;
	}
}

public class MethodOverloadExample {
    public static void main(String[] args) {
    	System.out.println(Helper.Multiply(2, 4));
    	System.out.println(Helper.Multiply(5.5, 6.3));
    }
}
