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
		double result = price * quantity;
		
	}

	public static void main(String[] args) {
		
		Product pr = new Product(1,"Shampoo", 200, 2);
		pr.calculateTotalPrice();
		
		Product pr = new Product(2,"Soap", 100, 5);
		pr.calculateTotalPrice();
		

	}

}