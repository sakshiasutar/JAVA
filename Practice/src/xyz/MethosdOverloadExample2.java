package xyz;

class Helper1{
	static int MultiplyOne(int a, int b) {
		return a*b;
	}
	
	static int MultiplyOne(int a, int b, int c) {
		return a*b*c;
	}
}

public class MethosdOverloadExample2 {
    public static void main(String[] args) {
    	System.out.println(Helper1.MultiplyOne(2,4));
    	System.out.println(Helper1.MultiplyOne(2, 7, 3));
    }
}
