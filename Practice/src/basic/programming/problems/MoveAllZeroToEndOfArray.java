package basic.programming.problems;

import java.util.*;

public class MoveAllZeroToEndOfArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        
        System.out.println("Enter the element in the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<n;i++){
          if(arr[i] != 0){
              arr[count++] = arr[i];
          }  
        }
        
        for(int i=count;i<n;i++){
            arr[i] = 0;
        }
        
        System.out.println("Modified Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}









