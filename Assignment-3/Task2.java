import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		    System.out.println("enter the number 1 : ");
		    int n1 = sc.nextInt();
		    System.out.println("enter the number 2:  ");
		    int n2 = sc.nextInt();
		    System.out.println("enter the number 3:  ");
		    int n3 = sc.nextInt();
		    
		    if(n1>n2 && n1>n2) {
		    	System.out.println("The largest number is: "+n1);
		    	}
		    else if(n2>n1 && n2>n3) {
		    	System.out.println("The largest number is: "+n2);
		    }
		    else if(n3>n1 && n3>n2) {
		    	System.out.println("The largest number is: "+n3);
		    }
	}

}