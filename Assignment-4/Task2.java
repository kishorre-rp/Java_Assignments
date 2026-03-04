import java.util.Scanner;

public class Task2 { 
	static int balance = 10000;
	    public static void main(String[] args) {
	    	
	    	Scanner sc  = new Scanner(System.in);
	    	System.out.println("Enter the amount to withdraw: ");
	    	int amount = sc.nextInt();
	    	
	    	if(amount > balance) {
	    		System.out.println("Insufficient Balance!");
	    	}
	    	else if(amount<=0) {
	    		System.out.println("Invalid Amount!");
	    	}else {
	    		
	    		int remaining = balance - amount;
	    		System.out.println("The remaining amount after the withdraw is: "+remaining);
	    	}
	      
	    	
    }
	
	}
