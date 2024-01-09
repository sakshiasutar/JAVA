/*  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5  */
package Patterns;
import java.util.Scanner;

public class Pattern_4 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	for(int i=1;i<=n;i++) {
		int sum = 0;
		for(int j=1;j<=i;j++) {
			sum = sum + 1;
			System.out.print(sum);
		}
		System.out.println();
	}
	}
}