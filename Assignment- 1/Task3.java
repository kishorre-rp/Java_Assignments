public class Task3 {

	public static void main(String[] args) {
		String username = "Kishorre";
		String password = "kis";
		String status = "Logged in failed" ;

		if((username == "Kishorre") & (password == "kish")){

		   status = "Logged in successfully";
		}
		else{
		  System.out.println("check both username and password!");
		}
		System.out.println(status);

	}

}