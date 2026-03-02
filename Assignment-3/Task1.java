import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		
	System.out.println("To check which is greater number!! ");
	
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number 1 : ");
    int n1 = sc.nextInt();
    System.out.println("enter the number 2:  ");
    int n2 = sc.nextInt();
    
    if(n1>n2) {
    	System.out.println("The largest number is: "+n1);
    	}
    else {
    	System.out.println("The largest number is: "+n2);
    }
	}

}