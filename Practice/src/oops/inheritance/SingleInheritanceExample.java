package oops.inheritance;

class One{
	public void printOne() {
		System.out.println("One");
	}
}

class Two extends One{
	public void printTwo() {
		System.out.println("Two");
	}
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
    	Two t = new Two();
    	t.printOne();
    	t.printTwo();
    }
}
