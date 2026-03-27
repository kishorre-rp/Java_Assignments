import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
	
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter user name: ");
			String name = sc.nextLine();
			
			if(name == "Kishorre") {
				System.out.println();			}
			
		}catch(Exception e) { 
			System.out.println(e.getMessage());
			
		}
	}
}