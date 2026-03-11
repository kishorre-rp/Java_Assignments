public class Employee {
	
    int empID;
	String empName;
	double salary;
	
	 Employee(int id, String name , double amount) {
		 this.empID = id;
		 this.empName = name;
		 this.salary = amount;
	}
	  void displayEmployee(){
		 
		  System.out.println("The ID no "+empID+ " of employee is "+empName+" whose salary is "+salary);
		  
	  }

	public static void main(String[] args) {
		Employee emp = new Employee(1,"Kishorre",20000);
		emp.displayEmployee();
		
		Employee emp1 = new Employee(2,"Santhosh",50000);
		emp1.displayEmployee();
		
		Employee emp2 = new Employee(3,"Jeeva",85000);
		emp2.displayEmployee();
		 

	}

}