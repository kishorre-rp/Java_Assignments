import java.util.Scanner;

public class Task2 {
	
	interface  vehicle{
		 void startEngine();
		 void stopEngine();
	}
	
	static class car implements vehicle{
		
		public void startEngine() {
			System.out.println(" In car Engine starts by inserting a key and put the gear forward by 1.");
		}
		public void stopEngine() {
			System.out.println("To turn off, put the gear in the neutral or parking state and take the key out.");
		}
	} 
	
	
static class Bike implements vehicle{
		
		public void startEngine() {
			System.out.println(" We can start by kick start the bike or press the electric to start by using keys. ");}
		public void stopEngine() {
			System.out.println("To turn off, bring the gear to the neutral and turn off the bike and mount the stand.");
		}
	}

static class Truck implements vehicle{
	
	public void startEngine() {
		System.out.println("Start by inserting the key in the key hole and see side mirroe first to move forward.  ");
	}
	public void stopEngine() {
		System.out.println("to stop it put the hand brakes on , and turn of the engine and get the key out. ");
	}
} 

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the vehicle type: ");
		String veh = sc.nextLine();
		car c = new car();
		Bike b = new Bike();
		Truck t = new Truck();
		
		if(veh.equals("car")) {
			c.startEngine();
			c.stopEngine();
		} else if(veh.equals("Bike")) {
			b.startEngine();
			b.stopEngine();
		} else if(veh.equals("Truck")) {
			t.startEngine();
			t.stopEngine();
		}
		
	}
}