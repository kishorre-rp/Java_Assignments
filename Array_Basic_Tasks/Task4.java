import java.util.Scanner;

public class Task4 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:  ");
		int size = sc.nextInt();
		
		int [] b =new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("enter the element: ");
			b[i] = sc.nextInt();
		}
		int max =b[0];
		for(int i=0;i<size;i++) {
			if(b[i]>max) {
				max = b[i];
				}
		}
		System.out.println("The Largest element in an array is: " +max);
		sc. close();
	}
}