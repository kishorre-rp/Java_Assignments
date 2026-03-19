import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of element:");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("enter the size of " +size+" Elements");
		
		for(int i=0;i<size;i++) {
			System.out.print("Enter the element: ");
			a[i] = sc.nextInt();
		}
		for(int i =0;i<size;i++) {
			sum += a[i];
		}
		System.out.println("Sum of array is: "+sum);
	}
}