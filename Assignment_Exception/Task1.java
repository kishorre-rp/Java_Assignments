import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		int balance = 10000;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount to withdraw: ");
		int withdraw = sc.nextInt();
		
		try {
			if(withdraw < 0) {
				throw new Exception("amount is negative!!");
			}
			if( balance < withdraw ) {
				throw new Exception("Insufficient amount!");
			}
			balance -= withdraw;
			System.out.println("The remaining balance =  "+balance);
			
		}catch(Exception e){
			System.out.println("Error occured: " +e.getMessage());
		}finally {
			System.out.println("Transcation logged sucessfully!!");
		}
	}		
}