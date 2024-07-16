package threads;

public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company comp = new Company();
		Producer p = new Producer(comp);
		Consumer c = new Consumer(comp);
		p.start();
		c.start();

	}

}
