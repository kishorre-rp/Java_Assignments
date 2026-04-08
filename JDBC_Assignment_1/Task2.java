import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Task2 {
	
	static final String DB_URL ="jdbc:mysql://localhost:3306/student";
	static final String User = "root";
	static final String Pass = "Clashroyale@21"; 

	public static void main(String[] args) {
		
		
		try(Connection con = DriverManager.getConnection(DB_URL,User,Pass);
			PreparedStatement stmt = con.prepareStatement("update  student22 set marks = ? where id = ?");	){
			
			stmt.setInt(1,28);
			stmt.setInt(2,1);
			
			
			int i = stmt.executeUpdate();
			
			System.out.println("the records updated are: "+i);
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}