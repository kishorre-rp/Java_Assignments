import java.util.Scanner;

public  class Task3 {
	
	static class Student{
		int roll_no;
		String name;
		int Mark1;
		int Mark2;
		int Mark3;
		
		void Total() {
			int Total = Mark1 + Mark2 + Mark3;
			System.out.println("The total Mark of "+name+" is:"+Total);
		}
		void Average() {
			int avg = (Mark1+Mark2+Mark3)/3;
			System.out.println("The Average of "+name+" is:"+avg);
		}
		void Grade() {
			int avg = (Mark1+Mark2+Mark3)/3;
			char grade;
			
			if(avg >= 80) {
				grade ='A';
			}else if(avg >= 60) {
				grade ='B';
				
			}else if(avg >= 40) {
				grade ='C';
			}
			else {
				System.out.println("The student "+name+" is failed!!");
				System.out.println();			
				return;
			}
			System.out.println("The grade of "+name+" is: "+grade);
			System.out.println();	
			
			}
		}
	
    public static void main(String[] args) {
    	
    	Student std = new Student();
    	std.roll_no = 1;
    	std.name = "Kishorre";
    	std.Mark1= 80;
    	std.Mark2 =80;
    	std.Mark3 = 80;
    	std.Total();
    	std.Average();
    	std.Grade();
    	
    	Student std1 = new Student();
    	std1.roll_no = 2;
    	std1.name = "Santhosh";
    	std1.Mark1= 70;
    	std1.Mark2 =60;
    	std1.Mark3 = 50;
    	std1.Total();
    	std1.Average();
    	std1.Grade();
    	
    	Student std2 = new Student();
    	std2.roll_no = 3;
    	std2.name = "Jeeva";
    	std2.Mark1= 30;
    	std2.Mark2 =20;
    	std2.Mark3 = 10;
    	std2.Total();
    	std2.Average();
    	std2.Grade();
    	
    	Student std3 = new Student();
    	std3.roll_no = 4;
    	std3.name = "Anbu";
    	std3.Mark1= 85;
    	std3.Mark2 =61;
    	std3.Mark3 = 78;
    	std3.Total();
    	std3.Average();
    	std3.Grade();
    	
    	Student std4 = new Student();
    	std4.roll_no = 5;
    	std4.name = "Fayaz";
    	std4.Mark1= 81;
    	std4.Mark2 =73;
    	std4.Mark3 = 63;
    	std4.Total();
    	std4.Average();
    	std4.Grade();
     	
    }
}