import java.util.Scanner;

public class Grade_question {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the mark: ");
		int n = sc.nextInt();
		char grade = 'F';
		
		if(n<0 || n> 100) {
			System.out.println("enter a valid mark! ");
					} else {
	    if(n >= 90 && n<=100 ) {
			 grade = 'A';
		}
		else if(n >= 75  && n <= 89 ) {
			 grade = 'B';
		}
		else if(n >= 50 && n<=74 ) {
			 grade = 'C';
		
		} else if(n<50) {
			grade = 'F';
		}
		System.out.println("The obtained grade is: " + grade );
					}
				}
	}