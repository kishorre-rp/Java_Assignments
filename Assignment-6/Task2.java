import java.util.Scanner;
public class Task2 {
	

	  static class MobileShop{
		int Price;
		String Model;
		
		
		MobileShop(){
			Model = "Samsung";
		   Price= 20000;  
		
	}
	  }
		
	   public static void main(String[] args) {
		   
		   MobileShop  MS = new MobileShop();
		   System.out.println("The Model is: "+MS.Model+", which price can be as: Rs." +MS.Price);
			   
	   }
	}