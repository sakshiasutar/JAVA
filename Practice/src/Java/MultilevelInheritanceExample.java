package Java;

//Parent class
class OneOne{
	public void printOne() {
		System.out.println("Print One");
	}
}

// Child class TwoOne inherits from class OneOne
class TwoOne extends OneOne{
	public void printTwo() {
		System.out.println("Print Two");
	}
}

// Child class Three inherits from class TwoOne

class Three extends TwoOne{
	public void printThree() {
		System.out.println("Print Three");
	}
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
    	Three t = new Three();
    	t.printOne();
    	t.printTwo();
    	t.printThree();
    }
}
