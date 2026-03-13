public class LoginSystem {

 		public void loginuser (String username, String password) { 	
 		  if(username.equals("Kishorre")  && password.equals("AAA") ) {
			System.out.println("Login Successfully made!!");
		}else {
			System.out.println("Incorrect password or username");
		}}
		public void  login( String email,String password) {
		  
			  if(email.equals("kishorre@gmail.com") &&  password.equals("AAA") ) {
					System.out.println("Login Successfully made!!");
				}else {
					System.out.println("Incorrect password or emailID");
				}
			}
		public void login(long mobileNumber , int otp) {
			  if(mobileNumber == (755555) && otp == 123) {
					System.out.println("Login Successfully made!!");
				}else {
					System.out.println("Incorrect mobile number or otp");
				}	
		}
	public static void main(String[] args) {
	
		LoginSystem ls = new LoginSystem();
		ls.loginuser("Kishorre", "AAA");
		ls.login("kishorre@gmail.com","AAA");
		ls.login(758393921, 123);
	}
	}