package basic.programming;

public class PrimeNumber {

	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i == 0) {
					return false;
				}
			}	
			return true;
		}
	}
	
	public static void main(String[] args) {
		if(isPrime(12)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
}
