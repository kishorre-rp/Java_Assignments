import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		    System.out.println("enter the number 1 : ");
		    int n1 = sc.nextInt();
		   
		    
		    if(n1>0) {
		    	System.out.println("The Number is positive "+n1);
		    	}
		    else if(n1<0) {
		    	System.out.println("The number is negative: "+n1);
		    }
		    else if(n1 ==0) {
		    	System.out.println("This is a whole number: "+n1);
		    }
	}
 
}