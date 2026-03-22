abstract class Food{
	abstract void prepare();
	void cooking() {};
	
}
class Pizza extends Food{
	void prepare() {
		System.out.println("pizza can be prepared by getting flour,egg, toppings ");
	}
	void cooking() {
		System.out.println("Pizza can be get on the oven, so it can be cooked in 2 hours");
	}
}
class Burger extends Food{
	
	void prepare() {
		System.out.println("Take two bun, keep toppings inside the bun without cooking in fire!!");
	}
} 

public class Task2 {

	public static void main(String[] args) {
		
		Food pi = new Pizza();
		Food bur = new Burger();
		
		System.out.println("How can a pizza can be made! ");
		
		pi.prepare();
		pi.cooking();
		System.out.println();
		
		System.out.println("How can a Burger can be made! ");
		bur.prepare();
	}
}