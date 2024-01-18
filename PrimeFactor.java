package Recursion;
import java.util.*;

public class PrimeFactor {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int i = sc.nextInt();
        PrimeFactor fact = new PrimeFactor();
        System.out.println(fact.factor(i));
    	
    }
    
    public int factor(int i) {
    	if(i<=1) {
    		return 0;
    	}
    	
    	int count = 0;
    	for(int j=2;j<=i;j++) {
    		if(i%j == 0) {
    			count++;
    			count += factor(i/j);
    			break;
    		}
    	}
    	return count;
    }
}
