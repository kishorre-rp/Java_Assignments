import java.util.Scanner;


public  class Task3 {
	  static class LibrarySystem{
			int MemberID;
			String MembershipType;
			
			
			LibrarySystem(){
				MemberID = 501;
				MembershipType = "Regular";
		}
		  }
			
		   public static void main(String[] args) {
			   
			   LibrarySystem LS = new LibrarySystem();
			   System.out.println("Welcome!: "+LS.MemberID+", As your type is: " +LS.MembershipType);
			   
			   LibrarySystem LS1 = new LibrarySystem();
			   LS1.MemberID++;
			   System.out.println("Welcome!: "+LS1.MemberID+", As your type is: " +LS1.MembershipType);
				   
		   }
}