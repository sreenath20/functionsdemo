package ford.b1.oops.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) {
		

		try (Connection con = DriverManager
				  .getConnection("jdbc:mysql://localhost:3306/demo", "root", "root")) {
				    // use con here
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
