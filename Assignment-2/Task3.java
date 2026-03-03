import java.util.Scanner;

public  class Task3 {
	
	public int employeeID;
	public int Basic_salary;

    
    public static void main(String[] args) {
        Task3 obj = new Task3();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Employee ID: ");
        obj.employeeID = sc.nextInt();
        
        System.out.println("Enter the basic salary: ");
        obj.Basic_salary = sc.nextInt();
        
        System.out.println("Enter the employee rating: ");
        double rating = sc.nextDouble();
        obj.calculation(rating); 
    }
    
    public void calculation(double rating) {
    	
    	double rate = rating;
    	if(rate == 5) {
    		double bonus = Basic_salary*0.20;
    		double total_amount = Basic_salary + bonus;
    		System.out.println("The Bonus with total salary is: "+ total_amount);
    		
    	}
    	else if(rate == 4) {
    		double bonus = Basic_salary*0.15;
    		double total_amount = Basic_salary + bonus;
    		System.out.println("The Bonus with total salary is: "+ total_amount);
    		
    	}
    	else if(rate == 3) {
    		double bonus = Basic_salary*0.10;
    		double total_amount = Basic_salary + bonus;
    		System.out.println("The Bonus with total salary is: "+ total_amount);
    		
    	}else {
    		System.out.println("They are not eligible for bonous!!");
    	} 	
    }
}
