public class Employee {
	 ;
	void calculateBonus(double salary) {
	}
    static class Manager extends Employee  {
	   void calculateBonus(double salary) {
		    salary = salary*0.20 + salary;
		   System.out.println("The bonus is: "+salary);
	   }
   }
   
   static class Developer extends Employee{
	   void calculateBonus(double salary) {
		   salary = salary*0.10 + salary;
		   System.out.println("The bonus is: "+salary);
	   }
	   
   }
   static class intern extends Employee{
	   void calculateBonus(double salary) {
		   salary = salary*0.05 + salary;
		   System.out.println("The bonus is: "+salary);
	   }
	   
   }
	public static void main(String[] args) {
		Employee emp = new Manager();
		Employee emp2 = new Developer();
		Employee emp3 = new intern();
		emp.calculateBonus(90000);
		emp2.calculateBonus(70000);
		emp3.calculateBonus(30000);
		
	}}