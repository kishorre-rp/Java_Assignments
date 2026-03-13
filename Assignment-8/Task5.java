public class Transport {

	void calculateFare(double fare) {
		System.out.println("the fares must be  for T.nagar!!");
	}

	static class bus extends Transport {
		void calculateFare(double fare) {
			fare +=35;
		System.out.println("The bus fare is: "+fare);
		}
	}
	static class train extends Transport {
		void calculateFare(double fare) {
			fare+=10;
			System.out.println("The train fare is: "+fare);
		}
	}

	static class taxi extends Transport {
		void calculateFare(double fare) {
			fare +=100;
			System.out.println("The taxi fare is: "+fare);
		}
	}

	public static void main(String[] args) {
		
		Transport tp = new bus();
		Transport tp1 = new train();
		Transport tp2 = new taxi();
		tp.calculateFare(5);
		tp1.calculateFare(5);
		tp2.calculateFare(5);	
	}
}