package oops.abstraction;

class A{
	private int data = 10;
	void msg() {
		System.out.println("Hello Friends");
	}
}


public class PrivateModifier {
	A obj = new A();
//	System.out.println(obj.data); // It will give compile time error
	
//	obj.msg();// It will also give compile time error;
    
}
