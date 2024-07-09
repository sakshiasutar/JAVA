package oops.inheritance;

interface X{
	public void execute();
}

interface Y{
	public void execute();
}

class E implements X,Y{
	public void execute() {
		System.out.println("Hi... From implementation class!!");
	}
}

public class InterfaceExample2 {
    public static void main(String[] args) {
    	E obj = new E();
    	obj.execute();
    }
}

//From the above output, we could observe that though interface A and interface B contain the same method with the same signature, its implementation is provided in the implementation class C.