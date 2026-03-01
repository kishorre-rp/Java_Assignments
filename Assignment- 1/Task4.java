import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		    System.out.println("enter to check the  item: ");
		    String item = sc.nextLine();
		    int total = 0;
		    
		    if (item.equals("Apple") ) {
		    	
		    	total = 100;
		    }
		    else if(item.equals("Banna")){
		    	total = 20;
		    }
		    else {
		    	System.out.println("the  item is not avaliable: "+ total);
		    	
		    }
		    System.out.println("the total item  avaliable is : "+ total);
		    
	}

}