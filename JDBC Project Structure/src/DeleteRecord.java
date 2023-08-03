import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class DeleteRecord {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch137", "root", "root");
		System.out.println("Connection Done.......");
		Statement statement=connection.createStatement();
		statement.executeUpdate("delete from student where id=102");
		System.out.println("Data deleted...");
	}
}
