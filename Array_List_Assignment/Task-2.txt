import java.util.Scanner;
import java.util.*;

public class Task2 {
	    public static void countFrequency(List<Integer> list) {
	        Map<Integer, Integer> freqMap = new HashMap<>();
	        
	        for (int num : list) {
	            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
	        }
	        
	        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
	            System.out.println(entry.getKey() + " → " + entry.getValue());
	        }
	        }
	    
	public static void main(String[] args) {
		
		 List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3);
	        countFrequency(list);


	    }
}