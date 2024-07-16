package threads;

public class Company {
	int n;
	
    synchronized public void produceItem(int n) {
    	this.n = n;
    	System.out.println("Produced : "+this.n);
    	}
    
    synchronized public int consumeItem() {
    	System.out.println("Consumed :"+ this.n);
    	return this.n;
    }
}
