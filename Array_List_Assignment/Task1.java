import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class Task1 {

	public static List<Integer> removeElement(List<Integer> list, int target) {

		list.removeIf(n -> n == target);
		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of an array: ");
		int size = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		System.out.println("Enter " + size + " numbers:");
		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt()); 
		}

		System.out.println("Before: " + list);
		removeElement(list, 2);
		System.out.println("After: " + list);
	}

}