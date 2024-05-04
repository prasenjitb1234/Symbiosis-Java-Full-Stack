package testing1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class fetch1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			Connection co = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","12345");
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
