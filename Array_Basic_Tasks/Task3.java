import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		double sum =0;
		for(int i=0;i<size;i++) {
			System.out.print(" provide the elements: ");
			a[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			sum += a[i];
		}
		System.out.println("The average of all elements is:  "+sum/size);
		sc.close();
	}

}