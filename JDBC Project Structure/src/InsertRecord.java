import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class InsertRecord {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch137", "root", "root");
		System.out.println("Connection Done.......");
		Statement statement=connection.createStatement();
		statement.executeUpdate("insert into student values(102,'Java')");
		System.out.println("Data inserted...");
	
	
		String insert1="insert into student values(111,'Java')";
		statement.executeUpdate(insert1);
		
		String insert2="insert into student values(222,'ss')";
		statement.executeUpdate(insert2);
		
		String insert3="insert into student values(333,'ccc')";
		statement.executeUpdate(insert3);
		
		String insert4="insert into student values(444,'ms')";
		statement.executeUpdate(insert4);
		
		
		
		System.out.println("Data inserted...");
	
	
	
	}
}
