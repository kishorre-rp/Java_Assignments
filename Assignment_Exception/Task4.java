import java.util.Scanner;
public class Task4 {
    public static int analyzeReturn() {
        try {
            System.out.println("Try block  using");
            return 10; 
        } catch (Exception e) {
            System.out.println("Catch block value : " + e.getMessage());
            return 20;
        } finally {
            System.out.println("Finally ");
        }
    }
    
    public static void main(String[] args) {
    	
         int  result = analyzeReturn();
        System.out.println("Final returned value: " + result);
        
    }
}