public class Student {
	
	int studentId;
	String studentName;
	int marks;
	
    Student(int id, String n, int m){
    	this.studentId = id;
    	this.studentName = n;
    	this.marks = m;
	}
    void calculateGrade() {
    	if(marks> 90) {
    		System.out.println("Grade A");
    	}else if(marks>75) {
    		System.out.println("Grade B");
    	}else if(marks>50) {
    		System.out.println("Grade C");
    	}else {
    		System.out.println("Fail");
    	}	
    }

	public static void main(String[] args) {
		Student std = new Student(1,"Anbu",25);
		
		System.out.print("The Student no: "+std.studentId+", Mr."+std.studentName+" whose Grade is: ");
		std.calculateGrade();
		
		Student std1 = new Student(2,"Santhosh",75);
		
		System.out.print("The Student no: "+std1.studentId+", Mr."+std1.studentName+" whose Grade is: ");
		std1.calculateGrade();

	}

}