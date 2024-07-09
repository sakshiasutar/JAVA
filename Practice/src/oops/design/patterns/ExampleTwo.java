package oops.design.patterns;

//Eager way of createing singleton
// it is not a good way in the terms of usage

public class ExampleTwo {
    private static ExampleTwo Two = new ExampleTwo();
    
    
    public static ExampleTwo getExampleTwo() {
    	return Two;
    }
}
