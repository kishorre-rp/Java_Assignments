import java.util.Scanner;
public class Task1 {
     
	   public static void main(String[] args) {
		   
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the numbers: ");
		   int number = sc.nextInt();
		   int count =0;
		   
		   if(number ==0) {
			   System.out.println(1);
		   }
		   
		   while(number>0) {
			   
			   count++;
			   number/=10; 	   
		   }
		   System.out.println("The number of digits:" +count);
	       
	    }
	}

