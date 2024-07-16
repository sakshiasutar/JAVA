package threads;

public class Producer extends Thread {

	Company c;
	
	Producer(Company c){
		this.c = c;
	}
	
	public void run() {
		
		int i = 1;
		do {
			this.c.produceItem(i);
			try{
				Thread.sleep(2000);
			}catch (Exception e) {
				
			}
			i++;
		}while(i < 10);
	}
}
