import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row  = sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				if( j==1||i==row || j==i) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}