import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Task4 {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/student";
	static final String PASS = "Clashroyale@21";
	static final String  USer = "root"; 

	public static void main(String[] args) {
		
		try (Connection con = DriverManager.getConnection(DB_URL,USer, PASS);
			PreparedStatement stmt = con.prepareStatement("update student22 set name = ? , marks = ? where id = ?");
				) {
			stmt.setString(1,"Jeevarath");
			stmt.setInt(2, 24);
			stmt.setInt(3,2);
			stmt.addBatch();
			
			stmt.setString(1,"Pavi");
			stmt.setInt(2, 99);
			stmt.setInt(3,1);
			stmt.addBatch();
			
			int[] i = stmt.executeBatch();
			
			System.out.println("the records name and marks updated are: "+i.length);	
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());	
		}
	}
}