import java.util.Scanner;

public class Task2 {
	
	    static class bank_details {
	        public String name;
	        public static int balance = 10000;  
	    }
	    
	    public static void main(String[] args) {
	        bank_details obj = new bank_details();
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter your name: ");
	        obj.name = sc.nextLine();
	        if(obj.name.equals("Kishorre")) {
	        
	        System.out.println("Enter the amount to withdraw: ");
	        int withdraw = sc.nextInt();
	        sc.nextLine();  
	        
	        
	            if (bank_details.balance > withdraw) {
	                System.out.println("The amount can be transacted is: ₹" + withdraw);
	                int Total_amount = bank_details.balance - withdraw; 
	                bank_details.balance = Total_amount;  
	            } else {
	                System.out.println("The withdraw amount exceeds the balance! ₹" + bank_details.balance);
	            }
	        } else {
	            System.out.println("Enter a valid name!");
	        }
	       

	
        
    }
	
	}