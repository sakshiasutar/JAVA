package basic.programming.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequencyOfEachElementInTheArray {
	
	public static void freq(int arr[], int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		System.out.println(map);
		
		int highestFreq = 0;
		int lowestFreq = n;
		int highestFreqElem = 0;
		int lowestFreqElem = 0;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			
			if(value > highestFreq) {
				highestFreq = value ;
				highestFreqElem = key;
			}
			
			if(value < lowestFreq) {
				lowestFreq = value;
				lowestFreqElem = key;
			}
		}
		
		System.out.println("Highest Frequency Element : " + highestFreqElem + ", with Frequency : " + highestFreq);
		System.out.println("Lowest Frequency Element : " + lowestFreqElem + ", with Frequency : " +lowestFreq);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {5,10,10,5,5,5,15};
		int n = arr.length;
		freq(arr,n);
	}
}
