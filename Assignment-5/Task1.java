import java.util.Scanner;
public class Task1 {
	
	static class Employee{
		int empID;
		String empName;
		double basicSalary;
		
	void calculate() {
		double HRA = basicSalary*0.20;
		double DA = basicSalary*0.10;
		double bonus = basicSalary*0.05;
		double GrossSalary;
		if(basicSalary > 50000) {
		GrossSalary = basicSalary + HRA +DA+ bonus;
		}
		else  {
			 GrossSalary = basicSalary + HRA +DA;
			}
			System.out.println("the toatl gross salary of " +empName+ " is: "+GrossSalary);		
	}
	}
	   public static void main(String[] args) {
		   
		   Employee obj = new Employee();
		   obj.empID = 1;
		   obj.empName = "Kishorre";
		   obj.basicSalary = 10000;
		   obj.calculate();    
		   
		   Employee obj1 = new Employee();
		   obj1.empID = 2;
		   obj1.empName = "Santhosh";
		   obj1.basicSalary = 80000;
		   obj1.calculate(); 
		   
		   Employee obj2 = new Employee();
		   obj2.empID = 3;
		   obj2.empName = "Jeeva";
		   obj2.basicSalary = 40000;
		   obj2.calculate(); 
	   }
	}