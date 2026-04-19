import java.util.*;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sequence of character: ");
		 String str = sc.nextLine();

	        Map<Character, Integer> check = new HashMap<>();

	        for (char ch : str.toCharArray()) {
	            check.put(ch, check.getOrDefault(ch, 0) + 1);
	        }

	        System.out.println(check);

	}
}