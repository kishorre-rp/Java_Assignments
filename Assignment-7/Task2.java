public class Product {
	int productId;
	String productName;
	double price;
	double quantity;
	double result;
	
	Product(int id, String name, double amount, double rate){
		this.productId = id;
		this.productName = name;
		this.price = amount;
		this.quantity = rate;
	}
	void calculateTotalPrice(){
		 result  = price * quantity;
		
	}

	public static void main(String[] args) {
		
		Product pr = new Product(1,"Shampoo", 200, 2);
		pr.calculateTotalPrice();
		
		System.out.println("The product ID: "+pr.productId+" of product "+pr.productName+" whose total price is " +pr.result);
		
		Product pr1 = new Product(2,"Soap", 100, 5);
		pr1.calculateTotalPrice();
		System.out.println("The product ID: "+pr1.productId+" of product "+pr1.productName+" whose total price is "+pr1.result);
		
	}

}

}