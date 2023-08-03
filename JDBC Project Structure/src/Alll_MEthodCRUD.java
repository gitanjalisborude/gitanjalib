import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Alll_MEthodCRUD {

	void insert() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch137", "root", "root");
		System.out.println("Connection Done.......");
		Statement statement = connection.createStatement();
		statement.executeUpdate("insert into student values(102,'Java')");
		System.out.println("Data inserted...");

		String insert1 = "insert into student values(111,'Java')";
		statement.executeUpdate(insert1);
	}

	void update() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch137", "root", "root");
		System.out.println("Connection Done.......");
		Statement statement = connection.createStatement();
		statement.executeUpdate("update student set name='selenium' where id=102");
		System.out.println("Data updated...");
	}

	void delete() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch137", "root", "root");
		System.out.println("Connection Done.......");
		Statement statement = connection.createStatement();
		statement.executeUpdate("delete from student where id=102");
		System.out.println("Data deleted...");
	}

	void select() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded...");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch137", "root", "root");
		System.out.println("Connection Done.......");

		Statement statement = connection.createStatement();

		ResultSet rs = statement.executeQuery("select * from student");

		System.out.println("Student Table");

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}
	}

}
