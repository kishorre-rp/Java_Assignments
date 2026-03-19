import java.util.*;

public class Number_increasing_Reverse_pyramaid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++) { 

			for(int j =1;j<=row-i+1;j++) {

				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}