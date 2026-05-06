import java.util.*;

public class Task3 {
	public static List<Integer> rotateRight(List<Integer> list, int k) {
		int n = list.size();
		if (n == 0)
			return list;

		// Normalize k
		k = k % n;

		// Reverse whole list, then reverse parts
		Collections.reverse(list);
		Collections.reverse(list.subList(0, k));
		Collections.reverse(list.subList(k, n));

		return list;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		System.out.println("Enter " + size + " elements:");
		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}

		System.out.print("Enter K (rotate right): ");
		int k = sc.nextInt();

		System.out.println("Before: " + list);
		rotateRight(list, k);
		System.out.println("After: " + list);

	}
}