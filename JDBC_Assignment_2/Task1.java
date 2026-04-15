import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Task1 {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/student";
	static final String User = "root";
	static final String Pass = "Clashroyale@21";

	public static void main(String[] args) {
		
		try (Connection conn = DriverManager.getConnection(DB_URL, User, Pass);
				CallableStatement stmt = conn.prepareCall("{CALL InsertStudent(?, ?, ?)}");) {
 
            stmt.setInt(1, 1);
            stmt.setString(2, "Kishorre");
            stmt.setInt(3, 85);
            
            int i = stmt.executeUpdate();
            System.out.println("Student inserted via Stored Procedure are: "+i);
            
          
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());			
		}
	}