import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array:  ");
		int size = sc.nextInt();
		
		int [] a =new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("enter the "+(i+1)+" element: ");
			a[i] = sc.nextInt();
		}
		int min =a[0];
		for(int i=0;i<size;i++) {
			if(a[i]<min) 
				min = a[i];
		}
		System.out.println("The samllest element in an array is: " +min);
		sc. close();
	}

}