import java.util.Scanner;

public class Task3 {

    public static int count(int number) {
       
        if (number < 10) {
            return 1;
        }
        
        return 1 + count(number / 10); 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
       
        System.out.println("Number of digits in number is: " + count(number));
             
    }
}