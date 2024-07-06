package xyz;

class Parent{
	void print() {
		System.out.println("Parent Class");
	}
}

class subclass1 extends Parent{

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("subclass1");
	}
	
}

class subclass2 extends Parent{
	void print(){
		System.out.println("subclass2");
	}
}

public class methodOverrideExample {
    public static void main(String[] args) {
    	
    	// Creating object of class 1
    	Parent a = new Parent();
    	a.print();
    	
    	 // Now we will be calling print methods
        // inside main() method
    	a = new subclass1();
    	a.print();
    	
    	a = new subclass2();
    	a.print();
    	
    }
}
