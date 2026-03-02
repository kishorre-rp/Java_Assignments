import java.util.Scanner;

public class Task4 {

static int ADD =0;
	
	
	public static int add(int number) {
		
		if(number ==0) 
			return 0 ;
		if(number ==1) 
			return 1;
		
		return number+add(number-1); }
		
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integer: ");
		int n = sc.nextInt();
		
		System.out.println("sum of all natural number is: "+add(n));	
		}

}
