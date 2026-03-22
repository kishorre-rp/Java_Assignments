abstract class Transport{
	abstract void BookTicket();	
}

class Bus extends Transport{
	void BookTicket() {
	System.out.println("Select the seats either window or side seat, pay by only online payments. ");	
	}
}

class Train extends Transport{
	void BookTicket() {
		System.out.println("Book by IRTC, select the RAC or Waiting or confirmed list, if booked you will recieve in gmail !!  ");
	}
}

public class Task3 {
	public static void main(String[] args) {
	
		Transport b = new Bus();
		Transport T = new Train();
		
		b.BookTicket();
		System.out.println();
		T.BookTicket();
	}

}