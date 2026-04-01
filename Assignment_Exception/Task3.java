import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the mark: ");
		int marks = sc.nextInt();
		sc.nextLine();
		System.out.print("enter the name of the student: ");
		String name = sc.nextLine();

		try {
			if (name == null || name.isEmpty()) {
				throw new Exception("Must enter the Student name!");
			}

			if (marks < 0 || marks > 100) {
				throw new Exception("Marks are invalid, enter a valid mark(1 to 100)");
			} else {
				if (marks > 80) {
					System.out.println("Grade A obtained by " + name);

				} else if (marks > 60) {
					System.out.println("Grade B obtained by " + name);

				} else if (marks > 40) {
					System.out.println("Grade C obtained by " + name);

				} else {
					System.out.println(" Failed ! by " + name);
				}
			}
		} catch (Exception e) {

			System.out.println("error occured: " + e.getMessage());
		} finally {
			System.out.println("Process Completed!!");
		}	
	}
}