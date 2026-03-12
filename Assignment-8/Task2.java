public class ShapeCalculator {

 		public void area (int side) { 	
 		  int square = side*side;
			System.out.println("The area of square is: "+square);
		
		}
		public void  area(double length, double width) {
		   double rectangle = length*width;	
			System.out.println("The area of rectangle is: "+ rectangle);
			}
	
		public void area( double radius) {
		double circle = 3.14*radius*radius; 
			System.out.println("The radius of circle is:  "+circle);		
		}
	
	public static void main(String[] args) {
	
		ShapeCalculator sc = new ShapeCalculator();
		sc.area(4);
		sc.area(2,3);
		sc.area(3.0);	
	}
	}
