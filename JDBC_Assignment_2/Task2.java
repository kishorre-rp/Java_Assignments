import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Task2 {
	
	static final String DB_URL ="jdbc:mysql://localhost:3306/student";
	static final String User = "root";
	static final String Pass = "Clashroyale@21"; 

	public static void main(String[] args) {
		
		
		try (Connection conn = DriverManager.getConnection(DB_URL, User, Pass);
				  CallableStatement stmt = conn.prepareCall("{CALL AddEmployee(?, ?)}");) {
 
			stmt.setString(1, "Jeeva");
            stmt.setDouble(2, 55000.00);
            
            int i = stmt.executeUpdate();
            System.out.println("Student inserted via Stored Procedure are: "+i);
            
          
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());			
		}

	}

}