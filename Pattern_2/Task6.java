import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows:  ");
		int n = sc.nextInt();

		int size = 2 * n - 1;

		for (int i = 1; i <= size; i++) {
			int row = (i <= n) ? i : size - i + 1;

			for (int j = 1; j <= row - 1; j++) {
				System.out.print(" ");
			}
			int width = 2 * (n - row) + 1;

			for (int j = 1; j <= width; j++) {

				if (row == 1 || j == 1 || j == width) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}