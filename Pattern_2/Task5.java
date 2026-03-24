import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int row = sc.nextInt();

	        int mid = row;

	        for (int i = 1; i <= 2 * row - 1 ; i++) {
	            for (int j = 1; j <=  2 * row - 1; j++) {

	                int dist = Math.abs(mid - i) + Math.abs(mid - j);

	                if (dist == row - 1) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	}

}