import java.util.Scanner;

public class Task4 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row  = sc.nextInt();
		
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");}
			
			for(int j=1;j<=2*i-1;j++) {
				if( j==1||i==row || j== 2*i-1) {
				System.out.print("*");}
				else {
					System.out.print(" ");
				}
				}
			System.out.println();
		}	

	}
}