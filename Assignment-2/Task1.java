import java.util.Scanner;
public class Task1 {
   
	    static class mark {
	        String name;
	        static int  roll_no = 0;
	    }
	    
	   public static void main(String[] args) {
	        mark student = new mark();  
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the Student name: ");
	        student.name = sc.nextLine();  
	        
	        System.out.println("enter the Student roll_no: ");
	        student.roll_no = sc.nextInt();
	        
	        System.out.println("enter the Tamil mark: ");
	        int mark1 = sc.nextInt();
	        System.out.println("enter the English mark: ");
	        int mark2 = sc.nextInt();
	        System.out.println("enter the Maths mark: ");
	        int mark3 = sc.nextInt();
	        
	        method(mark1, mark2, mark3, student);
	    }
	    
	    public static void method(int mark1, int mark2, int mark3, mark student) {
	        int total_marks = mark1 + mark2 + mark3;
	        System.out.println("the total mark of " + student.name +" is: " + total_marks);
	    }
	}
