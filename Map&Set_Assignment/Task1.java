import java.util.*;

public class Task1 {

	public static void main(String[] args) {

		List<String> email = Arrays.asList("kishorr@gmail.com", "anbu@gmail.com", "santhosh@gmail.com",
				"anbu@gmail.com", "vishwa@gmail.scom");

		Set<String> uniqueEmails = new HashSet<>(email);

		System.out.println("Unique Email IDs: " + uniqueEmails);
	}
}