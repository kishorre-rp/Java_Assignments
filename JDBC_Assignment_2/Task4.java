import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Task4 {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/student";
	static final String PASS = "Clashroyale@21";
	static final String  USer = "root"; 

	public static void main(String[] args) {
		
		try (Connection conn = DriverManager.getConnection(DB_URL, USer, PASS);
				  CallableStatement stmt = conn.prepareCall( "{CALL UpdateStudentMarks(?, ?)}");) {

			 stmt.setInt(1, 101);  
	         stmt.setInt(2, 95);
          
          int i = stmt.executeUpdate();
          System.out.println("Student inserted via Stored Procedure are: "+i);
          
        
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());			
		}
	}
}