import java.util.*;

public class Task4 {
	public static int findSecondLargest(List<Integer> list) {
		if (list.size() < 2)
			return -1;

		List<Integer> sorted = new ArrayList<>(list);
		sorted.sort(Collections.reverseOrder());

		int largest = sorted.get(0);
		for (int i = 1; i < sorted.size(); i++) {
			if (sorted.get(i) != largest) {
				return sorted.get(i);
			}
		}
		return -1;
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

		System.out.println("Input: " + list);
		int second = findSecondLargest(list);
		if (second != -1) {
			System.out.println("Second Largest: " + second);
		} else {
			System.out.println("No second largest element!");
		}

	}
}