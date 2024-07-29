package collection.set.opertion;

import java.util.*;

public class SetExample {
	
    public static void main(String[] args) {
    	Integer [] A = {22,45,33,66,55,34,77};
    	Integer [] B = {33,2,83,45,3,12,55};
    	
    	Set<Integer> set1 = new HashSet<Integer>();
    	set1.addAll(Arrays.asList(A));
    	Set<Integer> set2 = new HashSet<Integer>();
    	set2.addAll(Arrays.asList(B));
    	
    	//Finding Union of set1 and set2
    	Set<Integer> union = new HashSet<Integer>(set1);
    	union.addAll(set2);
    	System.out.println("Union of set1 and set2 is : ");
    	System.out.println(union);
    	
    	//Finding Intersection of set1 and set2
    	Set<Integer> intersection = new HashSet<Integer>(set1);
    	intersection.retainAll(set2);
    	System.out.println("Intersection of set1 and set2 is : ");
    	System.out.println(intersection);
    	
    	//Finding Difference of set1 and set2
    	Set<Integer> difference = new HashSet<Integer>(set1);
    	difference.removeAll(set2);
    	System.out.println("Difference of set1 and set2 is : ");
    	System.out.println(difference);
    	
    	
    }
}
