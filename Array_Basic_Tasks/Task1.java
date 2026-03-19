import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int size = sc.nextInt();
		int[] a = new int[size];
		
		System.out.println("Enter these "+size+" Elements!!");
		
		for(int i=0;i<size;i++) {
			System.out.print("Enter the element: ");
			 a[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++) {
		System.out.print("Elemnts are: "+a[i]+", ");}
		sc.close();
	}
}
