import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word to reverse:  ");
		String str = sc.nextLine();
		String rev = "";
		 
		 for(int i=str.length()-1;i>=0;i--) {
			 
			 rev += str.charAt(i);
		 }System.out.println(rev);
	}
}