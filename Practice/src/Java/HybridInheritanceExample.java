package Java;

class GrandFather{
	public void showG() {
		System.out.println("He is grandfather");
	}
}

class Father extends GrandFather{
	public void showF() {
		System.out.println("He is father");
	}
}

class Daughter extends Father{
	public void showD() {
		System.out.println("She is  Daughter");
	}
}

class Son extends Father{
	public void showS() {
		System.out.println("He is Son");
	}
}

public class HybridInheritanceExample {
    public static void main(String[] args) {
    	
    	Daughter D = new Daughter();
    	
    	D.showD();
    	D.showF();
    	D.showG();
    }
}
