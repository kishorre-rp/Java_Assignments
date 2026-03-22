abstract class Appliance{
	abstract void  turnOn();
	abstract void turnOff();
} 

class Fan extends Appliance{
	void turnOn() {
		System.out.println("It is used to turn on the fan! ");
	}
	void turnOff() {
		System.out.println("Kindly switch off the fan before leave!!");
	}
}

class WashingMachine extends Appliance{
	void turnOn() {
		System.out.println("Plug the wire in the switch to turn on and set the timer");
	}
	
	void turnOff() {
		System.out.println("See if the washing machine ends, then switch off it!!");
	}
}


public class Task1 {
	public static void main(String[] args) {
		
		Appliance fan = new Fan();
		Appliance wm = new WashingMachine();
		
		System.out.println("Item:1");
		fan.turnOn();
		fan.turnOff();
		System.out.println("Item: 2");
		
		wm.turnOn();
		wm.turnOff();
	}
}