import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		
	System.out.println("Welcome to the ABC website!! ");
	
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the amount: ");
    int amount = sc.nextInt();
    System.out.println("enter the discount percentage: ");
    int discount = sc.nextInt();
    

    if(amount >5000) {
    	int result  =  (amount*discount)/100 ;
    	System.out.println("The total amount after the discount is: "+result);
    }
    else {
    	System.out.print("There is no discount! the total amount to be paid is: "+ amount);
    }
    	
	}

}
