import java.util.Scanner;

public class Task3 {
	public static String reverse(String str) {

		if (str == null)
			return null;

		char[] chars = str.toCharArray();
		int left = 0, right = chars.length - 1;

		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
		return new String(chars);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String to reverse: ");
		String input = sc.nextLine();
		System.out.println("Input: " + input);
		System.out.println(" output is: reverse of given String; " + reverse(input));

	}
}