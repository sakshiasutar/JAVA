package threads;

class UserThread extends Thread{
	public void run() {
		//task for thread...
		System.out.println("This is user defined thread");
	}
}

public class ThreadOperation {

	public static void main(String[] args) {
		
		System.out.println("Program Started...");
		
		int x = 56 + 34;
		System.out.println("sum :" + x);
		
		//Thread...
		Thread t = Thread.currentThread();// Return object of the current Thread Class
		String tname = t.getName();
		System.out.println("Current running thread is "+ tname);
		
		// rename the Thread
		
		t.setName("Mymain");
		System.out.println("Current running thread is "+ t.getName());
		
		//sleep() : static method
		try{
			Thread.sleep(5000);
		}catch(Exception e) {
			
		};
		
		//getid
		System.out.println(t.getId());
		
		//going to start user defined thread.
		
		UserThread n = new UserThread();
		n.start();
		
		System.out.println("Program Ended...");

	}

}
