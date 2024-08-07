package basic.programming.problems;
import java.util.Scanner;
public class DifferenceOfSum {

	public static int difference(int n, int m) {
		int min = 0;
		int max = 0;
		
		for(int i=1;i<=m;i++) {
			if(i % n == 0) {
				min = min + i;
			}
			else {
				max = max + i;
			}
		}
		return Math.abs(max - min);
	}
	
	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     int m = sc.nextInt();
	     System.out.println(difference(n,m));
	}
}
