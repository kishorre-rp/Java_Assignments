public class Task3 {
	interface SmartDevice{
		void turnon();
		void turnoff();
	}
	
	static class Fan implements SmartDevice{
		public void turnon() {
			System.out.println("The fan must be turned on by switch and adjuxt by regulator!!");
			
		}
		public void turnoff() {
			System.out.println("Easily turn off by pressing the switch off mode");
		}
	}
	
	static class Light implements SmartDevice{
		public void turnon() {
			System.out.println("IT will produce the material called photon which will be bright turned on by pressing the switch on");
			
		}
		public void turnoff() {
			System.out.println("When we turn off the light the area become dark than before");
		}
	} 
	
	
	static class AirConditioner implements SmartDevice{
		public void turnon() {
			System.out.println("It will give the cold air with the desired temperature that we wanted! by tippin on the regulator");
			
		}
		public void turnoff() {
			System.out.println("When we off the AC the cold will reduce evenly");
		}
	} 

	public static void main(String[] args) {
		Fan f = new Fan();
		Light l = new Light();
		AirConditioner ac = new AirConditioner();
		
		f.turnon();
		f.turnoff();
		
		l.turnon();
		l.turnoff();
		
		ac.turnon();
		ac.turnoff();
	}

}