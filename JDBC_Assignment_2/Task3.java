import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Task3 {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/student"; 
	static final String  User = "root";
	static final String Pass = "Clashroyale@21";

	public static void main(String[] args) {
		
		try (Connection conn = DriverManager.getConnection(DB_URL, User, Pass);
				  CallableStatement stmt = conn.prepareCall("{CALL InsertUserData(?, ?, ?)}");) {

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();  
            
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
			
			
			stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, marks);
          
          int i = stmt.executeUpdate();
          System.out.println("Student inserted via Stored Procedure are: "+i);
          
          sc.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());			
		} 
	}
}