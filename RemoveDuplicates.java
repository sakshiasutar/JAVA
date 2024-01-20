import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the size of the array:");
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	System.out.println("Enter the elements in the array:");
    	for(int i=0;i<n;i++) {
    		arr[i] = sc.nextInt();
    	}
    	
    	for(int i=0;i<n;i++) {
    		System.out.print(arr[i] + " ");
    	}
    	System.out.println();    	
    	int ret = removeDuplicates(arr);
    	System.out.println(ret);
    	
    	for(int i=0;i<ret;i++) {
    		System.out.print(arr[i] + " ");
    	}
    }
    
    public static int removeDuplicates(int[] arr) {
    	int length = arr.length;
    	int i=0;
    	for(int j=1;j<length;j++) {
    		if(arr[i] != arr[j]) {
    			arr[i+1] = arr[j];
    			i++;
    		}
    	}
    	return i+1;
    }
}
