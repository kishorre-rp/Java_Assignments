abstract class Account{
	abstract void  calculateInterest(int amount);
} 


class SavingsAccount extends Account {
	 void calculateInterest(int amount) {
		 amount +=10000;
		 System.out.println("the saving account balance after the depoist:"+amount);
	 }	
} 

class CurrentAccount extends Account {
	void calculateInterest(int amount) {
		 int interest =+ amount*10;
		 amount += interest;
		 System.out.println("the Current account balance after the depoist:"+amount);
	 }
}

public class Task4 {

	public static void main(String args[]) {
	
		Account  sa = new SavingsAccount();
		Account  cs = new CurrentAccount();
		
		sa.calculateInterest(2000);
		System.out.println();
		
		cs.calculateInterest(2000);
		 	
	}
}