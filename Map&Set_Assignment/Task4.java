import java.util.*;

public class Task4 {

	public static void main(String[] args) {

		Map<Integer, Double> Salary = new HashMap<>();

		
		Salary.put(1, 45000.2);
		Salary.put(2, 55000.0);
		Salary.put(3, 60000.0);

		
		int empId = 2;
		System.out.println("Salary of Employee " + empId + ": " + Salary.get(empId));

		
		Salary.put(2, 58000.0);
		System.out.println("Updated Salary of Employee 2: " + Salary.get(2));

	}
}
