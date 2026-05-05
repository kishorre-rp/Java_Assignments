import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class Task1 {
	public static String findSmallest(String s, String t) {
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String window = s.substring(i, j);

				if (hasAllLetters(window, t)) {

					if (result.equals("") || window.length() < result.length()) {
						result = window;
					}
				}
			}
		}
		return result;
	}

	public static boolean hasAllLetters(String window, String t) {
		String copy = window;

	
		for (char need : t.toCharArray()) {
			int pos = copy.indexOf(need);
			if (pos == -1) {
				return false; 
			}
			
			copy = copy.substring(0, pos) + copy.substring(pos + 1);
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		System.out.print("Enter the target: ");
		String t = sc.nextLine();

		System.out.println( "Output: "+ findSmallest(s, t));
	}
}