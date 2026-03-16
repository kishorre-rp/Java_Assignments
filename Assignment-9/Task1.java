public class Task1 {
	interface Payment {
		void processpayment(double amount);
	}

	 static class CreditCardPayment implements Payment {
		public void processpayment(double amount) {

			System.out.println("The amount " + amount + " has done via.. credit card!");
		}
	}

	static class UPIPayment implements Payment {
		public void processpayment(double amount) {
			System.out.println("The amount " + amount + " has done via.. UPI!!");
		}
	}

	static class PayPal implements Payment {
		public void processpayment(double amount) {
			double discount = amount * 0.10;
			discount -= amount;
			System.out.println("The amount " + discount + " has done via.. Paypal after the discount");
		}
	}

	public static void main(String[] args) {
		CreditCardPayment cc = new CreditCardPayment();
		 UPIPayment upi = new  UPIPayment();
		 PayPal pp = new PayPal();
		 
		 cc.processpayment(1000);
		 upi.processpayment(1000);
		 pp.processpayment(1000);
	}
}