import java.util.Scanner;
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		
		    int N = 10;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("enter the size of an array: ");
	        int size = sc.nextInt();
	        int arr[] = new int[size];
	        
	        for(int i =0; i<size;i++) {
	        	
	        	System.out.print("Enter the number: ");	  
	        	arr[i] = sc.nextInt();
	        }

	        Set<Integer> set = new HashSet<>();
	        for (int num : arr) {
	            set.add(num);
	        }

	        System.out.print("Missing numbers: ");
	        for (int i = 1; i <= N; i++) {
	            if (!set.contains(i)) {
	                System.out.print(i + " ");
	            }
	        }
	}
}