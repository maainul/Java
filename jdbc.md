```.java

package notdefault;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloWorld {

	public static void main(String[] args) {
		try {
			System.out.println("Welcome to database connection .");
			String url = "jdbc:mysql://localhost:3306/student?autoReconnect=true&useSSL=false";
			String userName = "root";
			String password = "root";
			String query = "select * from info";

			// Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("Connection succssful");
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next())
				System.out.println(rs.getString("name"));
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
```