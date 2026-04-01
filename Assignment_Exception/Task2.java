import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
	
		String name ="Kishorre";
		String Password = "kishorre1";
		int attempt =0;
		while(attempt < 3) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter user name: ");
			String user_name = sc.nextLine();
			
			System.out.print("Enter the password: ");
			String user_Password = sc.nextLine();
			
			if(! user_name.equals(name)) {
				throw new Exception("Invalid username !!");	
				}
			if(! user_Password.equals(Password)) {
				throw new Exception("Incorrect Password!!");
			}
			
			System.out.println("Logged in Successfully");
			return;
			
		}catch(Exception e) {
			attempt ++;
			System.out.println("Error cooured at " +attempt+" attempt is: "+e.getMessage());
		}}
		
		System.out.println("Every attempt have been used (attempt used is:3)");
		
			System.out.println("terminate the program");	
	}
}