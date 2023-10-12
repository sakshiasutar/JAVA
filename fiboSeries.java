import java.util.*;

public class fiboSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = fibo(n-1) + fibo(n-2);
		System.out.println("Fibonacci Series:"+ans);
	}
	
	static int fibo(int n) {
		if (n<2)
		{
			return n;
		}
		
		return fibo(n-1) + fibo(n-2);
	}

}
