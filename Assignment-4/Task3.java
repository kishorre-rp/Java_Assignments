import java.util.Scanner;

public  class Task3 {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter to check armstrong number or not: ");
    	int num = sc.nextInt();
    	int temp = num;
    	int sum = 0;
    	while(temp>0) {
    		int single= temp%10;
    		sum += single*single*single; 
    	    temp/=10;
    		
    	}
    	if(sum == num) {
    		System.out.println("It is a Armstrong number!");
    	}else {
    		System.out.println("It is not a Armstrong number");
    	}
     	
    }
}
