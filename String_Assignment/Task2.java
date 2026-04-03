import java.util.Scanner;
public class Task2 {
	 public static String countletter(String str) {
	        if (str == null || str.length() == 0) return str;
	        
	        StringBuilder result = new StringBuilder();
	        int count = 1;
	        
	        for (int i = 1; i < str.length(); i++) {
	            if (str.charAt(i) == str.charAt(i - 1)) {
	                count++;
	            } else {
	                result.append(str.charAt(i - 1)).append(count);
	                count = 1;
	            }
	        }
	        result.append(str.charAt(str.length() - 1)).append(count);
	        
	        return result.toString();
	    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String: ");
		String s = sc.nextLine();

        System.out.println("Input: " + s);
        System.out.println("Output: " + countletter(s));
	}
}