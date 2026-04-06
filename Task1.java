import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Task1 {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/student";
	static final String User = "root";
	static final String Pass = "Clashroyale@21";

	public static void main(String[] args) {
		
		try (Connection con = DriverManager.getConnection(DB_URL,User,Pass );
			 PreparedStatement stmt = con.prepareStatement("insert into student21 values(?,?,?,?)");) {
			
			stmt.setInt(1,12);
			stmt.setString(2,"kaarun");
			stmt.setInt(3,43);
			
			
			int i = stmt.executeUpdate();
			System.out.println("the records inserted are: "+i);
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());			
		}
	}
}