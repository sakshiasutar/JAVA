/*   *********
      *******
       *****
        ***
         *
         *
        ***
       *****
      *******
     *********           */

package Patterns;
import java.util.Scanner;

public class Pattern_10 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
    for(int i=n;i>0;i--) {
    	for(int j=0;j<=n-i-1;j++) {
    		System.out.print(" ");
    	}
    	
    	for(int k=0;k<2*i-1;k++) {
    		System.out.print("*");
    	}
    	System.out.println();
    	
    }
    for(int s=0;s<n;s++) {
    	for(int j=0;j<n-s-1;j++) {
    		System.out.print(" ");
    	}
    	
    	for(int k=0;k<2*s+1;k++) {
    		System.out.print("*");
    	}
    	System.out.println();
    
	}
	}
}

