package Java;

class Test{
	public void printOne() {
		System.out.println("One");
	}
}

class TestTwo extends Test{
	public void printTwo() {
		System.out.println("Two");
	}
}

class TestThree extends Test{
	public void printThree() {
		System.out.println("Three");
	}
}


public class HiearchicalInheritanceExample {
    public static void main(String[] args) {
    	TestTwo x = new TestTwo();
    	x.printOne();
    	x.printTwo();
    	
    	TestThree y = new TestThree();
    	y.printOne();
    	y.printThree();
    }
}
