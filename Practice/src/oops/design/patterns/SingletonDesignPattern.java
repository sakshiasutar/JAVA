package oops.design.patterns;
// Lazy Way of creating single object
// It is not specify to threads
class Example{
	   private static Example example;
	// constructor
		private Example() {
			
		}
		
		public static Example getExample() {
			// object of this class
			if(example == null) {
				example = new Example();
			}
			
			return example;
		}
}

public class SingletonDesignPattern {

	public static void main(String[] args) {
		Example example1 = Example.getExample();
		System.out.println(example1.hashCode());
		
		Example example2 = Example.getExample();
		System.out.println(example1.hashCode());
		
//		Same hashCode means both objects are same ie only one object is created
		
	    System.out.println(ExampleTwo.getExampleTwo().hashCode());
	    System.out.println(ExampleTwo.getExampleTwo().hashCode());
	}
}
