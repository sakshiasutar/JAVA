package threads;

public class MyThreadTwo extends Thread {
    
	public void run() {
		
		// thread task
		
		for(int i=1;i<=10;i++) {
			System.out.println(i*5);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
