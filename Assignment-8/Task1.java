import java.util.Scanner;
public class Payment {

	void processPayment() {
			}

	static class creditCardPayment extends Payment {
		void processPayment() {
			System.out.println("Sucessfully paid by the credit card!!");
		}
	}

	static class debitCardPayment extends Payment {
		void processPayment() {
			System.out.println("Sucessfully paid by the debit card!!");
		}
	}

	static class UPIPayment extends Payment {
		void processPayment() {
			System.out.println("Sucessfully paid by the UPI!!");
		}
	}
	public static void main(String[] args) {
		Payment cc = new creditCardPayment();
		Payment dc = new debitCardPayment();
		Payment upi = new UPIPayment();
		cc.processPayment();
		dc.processPayment();
		upi.processPayment();	
	}
	}	