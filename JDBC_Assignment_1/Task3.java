import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Task3 {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/student"; 
	static final String  User = "root";
	static final String Pass = "Clashroyale@21";

	public static void main(String[] args) {
		
		try(Connection con = DriverManager.getConnection(DB_URL,User,Pass);
			PreparedStatement stmt = con.prepareStatement("update employee set salary = ? where department = ?");) {
			
			stmt.setInt(1,2000);
			stmt.setString(2,"Computer");
			stmt.addBatch();
			
			stmt.setInt(1,5400);
			stmt.setString(2,"Tamil");
			stmt.addBatch();
			int i = stmt.executeUpdate();
			
			System.out.println("the employee records which are updated are: "+i);
			
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}