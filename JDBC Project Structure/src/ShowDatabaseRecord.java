import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowDatabaseRecord {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch137", "root", "root");
		System.out.println("Connection Done.......");
		
		Statement statement=connection.createStatement();
		
		ResultSet rs=statement.executeQuery("select * from student");
		
		System.out.println("Student Table");
		
		while (rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		
		
	}

}
